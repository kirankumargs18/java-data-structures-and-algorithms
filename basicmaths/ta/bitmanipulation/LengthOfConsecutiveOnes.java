package com.kirangs.basicmaths.ta.bitmanipulation;

public class LengthOfConsecutiveOnes {

    public static void main(String[] args) {

	System.out.println(countConsecutiveOnes(101));
	System.out.println(countConsecutiveOnes(73));

    }

    // Time : O(logN)
    // Space : O(1)
//    when we do n & (n<<1) if it has consecutive 1's then result is non-zero else result is zero
    private static int countConsecutiveOnes(int n) {
	int count = 0;
	while (n > 0) {
	    n = n & (n << 1);
	    count++;
	}
	return count;
    }
}
