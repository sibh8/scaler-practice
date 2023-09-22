package com.gallifreyantimelord.scaler.dsaadvanced.day35;

public class SetLast4Bits {
    public static void main(String[] args) {

        int A = 53;
        int B = 5;

        for(int i=0; i<B; i++){
            if ((A&(1<<i)) != 0){
                A = A^(1<<i);
            }
        }
    }
}
