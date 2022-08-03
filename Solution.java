class Solution {
	public static boolean isEven(int n) {
        int r = n % 2;
        if (r == 0) {
            return true;
        } else {
        	return false;
        }
	}
	
	
	public static void main(String[] args) {
		boolean res = isEven(12);
		System.out.println("Result: " + res);
	}
}