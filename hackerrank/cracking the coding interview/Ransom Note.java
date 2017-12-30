public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public Solution(String magazine, String note) {
        magazineMap = new HashMap<String, Integer>();
        noteMap = new HashMap<String, Integer>();

        String[] magazineWords = magazine.split(" ");
        String[] noteWords = note.split(" ");

        for(String m : magazineWords){
            if(magazineMap.containsKey(m)){
                magazineMap.put(m, magazineMap.get(m) + 1);
            }
            else{
                magazineMap.put(m, 1);
            }
        }

        for(String n : noteWords){
            if(noteMap.containsKey(n)){
                noteMap.put(n, noteMap.get(n) + 1);
            }
            else{
                noteMap.put(n, 1);
            }
        }
    }

    public boolean solve() {
        for(Map.Entry<String, Integer> entry : noteMap.entrySet()){
            String key = entry.getKey();
            //magazine map doesn't contain the key
            if(!magazineMap.containsKey(key)){
                return false;
            }
            //make sure number of occurences in magazine is greater than 0
            magazineMap.put(key, magazineMap.get(key) - noteMap.get(key));
            if(magazineMap.get(key) < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}
