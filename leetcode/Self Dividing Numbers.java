class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(i < 10){
                numbers.add(i);
            }
            else if(isSelfDividing(i)){
                	numbers.add(i);
            }
        }
        return numbers;
    }

	public boolean isSelfDividing(int num){
		if(num < 10){
			return true;
		}
		if(num % 10 == 0){
			return false;
		}
		int copy = num;
		while(copy > 0){
			int rem = copy % 10;
			if(rem == 0 || num % rem != 0){
				return false;
			}
			copy /= 10;
		}
		return true;
	}
}
