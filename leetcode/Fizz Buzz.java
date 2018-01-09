class Solution {
    public List<String> fizzBuzz(int n) {
        int count = 1;
        ArrayList<String> list = new ArrayList<String>();
        while(count <= n){
            if(count % 3 == 0 && count % 5 == 0){
                list.add("FizzBuzz");
            }
            else if(count % 3 == 0){
                list.add("Fizz");
            }
            else if(count % 5 == 0){
                list.add("Buzz");
            }
            else {
                list.add(Integer.toString(count));
            }
            count ++;
        }
        return list;
    }
}
