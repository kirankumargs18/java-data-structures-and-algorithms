package com.kirangs.basicmaths.tyf;

public class ArmStrongNumber {

    public static void main(String[] args) {

	System.out.println(isArmStrongNumber(371));
	System.out.println(isArmStrongNumber(100));

    }

    /*
     * Time Complexity : O(numberOfDigits) 
     * Space Complexity : O(1)
     */
    private static boolean isArmStrongNumber(int n) {
	int temp = n;
	int sum = 0;
	while (n > 0) {
	    int digit = n % 10;
	    sum = sum + (digit * digit * digit);
	    n = n / 10;
	}
	if (sum == temp) {
	    return true;
	}
	return false;
    }

}
