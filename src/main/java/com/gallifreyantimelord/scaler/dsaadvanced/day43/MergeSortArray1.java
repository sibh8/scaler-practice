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

    private static void merge(int[] ar, int l, int m, int h) {

        int p1=l, p2=m+1, p3=0;
        int[] res = new int[h-l+1];

        while(p1 <= m && p2 <= h){
            if(ar[p1] < ar[p2]){
                res[p3] = ar[p1];
                p1++;
                p3++;
            }

            if(ar[p2] < ar[p1]) {
                res[p3] = ar[p2];
                p2++;
                p3++;
            }
        }

        while(p1<=m){
            res[p3] = ar[p1];
            p1++;
            p3++;
        }

        while(p2<=h ){
            res[p3] = ar[p2];
            p2++;
            p3++;
        }


        int i=l, j=0;
        while(i<=h){
            ar[i] = res[j];
            i++;
            j++;
        }
    }
}
