package com.gallifreyantimelord.scaler.dsaadvanced.day45;

public class PositiveNumberCountSort {
    public static void main(String[] args) {
//        int[] A = {9,6,2,5,1,8,3};
        int[] A = {1,1,3,5,6,5,8,9};

        A = invokeCountSort(A);

        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
    }

    private static int[] invokeCountSort(int[] A) {
        int[] F = new int[10];
        int N = A.length;

        for(int i=0; i<N; i++){
            F[A[i]] += 1;
        }

        int k = 0;

        for(int i=0; i<F.length; i++){
            for(int j=0; j<F[i]; j++){
                A[k] = i;
                k++;
            }
        }

        return A;
    }
}
