package com.gallifreyantimelord.scaler.dsaadvanced.day46;

public class UniqueElementUsingBinarySearch {
    public static void main(String[] args) {
        int[] ar = {3,3,7,7,4,4,9,9,24,12,12,14,14,6,6};
        int N = ar.length;
        int l=0, h=N-1;

        while(l<=h){
            int m=(l+h)/2;

            if(ar[m-1] != ar[m] && ar[m+1] != ar[m]){
                System.out.println("The unique element is "+ar[m]);
            }

            if(ar[m-1] == ar[m]){
                m-=1;
            }

            if(m%2 == 0){
                l = m+2;
            }
            else{
                h=m-1;
            }
        }
    }
}
