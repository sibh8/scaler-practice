package com.gallifreyantimelord.scaler.dsaadvanced.day43;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] a1 = {6, 7, 11,14};
        int[] a2 = {3,8,9};

        int p1=0, p2=0, p3=0;
        int N = a1.length;
        int M = a2.length;

        int[] result = new int[N+M];

        while(p1 < N && p2 < M){
            if(a1[p1] <= a2[p2]){
                result[p3] = a1[p1];
                p1++;
                p3++;
            }

            if(a2[p2] <= a1[p1]){
                result[p3] = a2[p2];
                p2++;
                p3++;
            }
        }

        while(p1<N){
            result[p3] = a1[p1];
            p1++;
            p3++;
        }

        while(p2<M){
            result[p3] = a2[p2];
            p2++;
            p3++;
        }


        // Print the sorted array

        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
