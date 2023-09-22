/*
An exmple where actual merge sort technique using the array division method is shown
 */

package com.gallifreyantimelord.scaler.dsaadvanced.day43;

import java.util.Arrays;

public class MergeSortArray1 {
    public static void main(String[] args) {
        int[] ar = {3, 10, 6, 15, 8, 12, 2, 18, 17};
        int N = ar.length;
        int l = 0;
        int h = N-1;

        mergeSortArray(ar, l, h);

        for(int i=0; i<N; i++){
            System.out.print(ar[i]+" ");
        }
    }

    private static void mergeSortArray(int[] ar, int l, int h) {

        if(l == h)
            return;

        int m = (l+h)/2;

        mergeSortArray(ar, l, m);
        mergeSortArray(ar, m+1, h);
        merge(ar, l, m, h);
    }

    private static int[] merge(int[] ar, int l, int m, int h) {

        int p1=0, p2=0, p3=0;
        int N = m-l+1;
        int M = h-m;
        int[] ar1 = new int[N];
        int[] ar2 = new int[M];
        int[] res = new int[N+M];

        while(p1 < N && p2 < M){
            if(ar1[p1] < ar2[p2]){
                res[p3] = ar1[p1];
                p1++;
                p3++;
            }

            if(ar2[p2] < ar1[p1]) {
                res[p3] = ar2[p2];
                p2++;
                p3++;
            }
        }

        return res;
    }
}
