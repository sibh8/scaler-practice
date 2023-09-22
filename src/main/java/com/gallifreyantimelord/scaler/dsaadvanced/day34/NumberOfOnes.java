package com.gallifreyantimelord.scaler.dsaadvanced.day34;

public class NumberOfOnes {
    static int calculatedigitsOfone(int A)
    {
        int n = A, factors = 1, count = 0, remainder = 0;
        while (n > 0) {
            int temp = factors;
            // check for remainders three cases mentioned in
            // the approach
            if (n % 10 == 0) {
                remainder = 0;
            }
            else if (n % 10 > 1) {
                remainder = temp;
            }
            else if (n % 10 == 1) {
                remainder = (A % temp) + 1;
            }
            factors *= 10; // increamneting factors for checking
            // different locations such as ones,
            // tens,hundreds places ones
            count += (A / factors) * temp + remainder;
            n = n / 10;
        }
        return count;
    }
    public static void main(String[] args)
    {
        int n = 11;
        System.out.println(calculatedigitsOfone(n));
        n = 113;
        System.out.println(calculatedigitsOfone(n));
        n = 235;
        System.out.println(calculatedigitsOfone(n));
    }
}
