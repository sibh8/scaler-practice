package com.gallifreyantimelord.scaler.dsaadvanced.day43;

public class InversionCount {

    private static int cnt = 0;
    public static void main(String[] args) {
        cnt = 0;
        int[] A = {10, 3, 8, 15, 6, 12, 2, 18, 7, 1};
        int N  = A.length;

        sort(A,0,N-1);

        System.out.println("The answer is: "+cnt);
    }

    private static void sort(int[] A, int s, int e) {
        if(s>=e){
            return;
        }
        int m = (s+e)/2;
        sort(A, s, m);
        sort(A, m+1, e);
        merge(A, s, m, e);
    }

    private static void merge(int[] A, int s, int m, int e) {
        int tmp[] = new int[e-s+1];
        int P1=s, P2=m+1, P3=0;

        while(P1<=m && P2 <= e){
            if(A[P1] <= A[P2]) {
                tmp[P3] = A[P1];
                P1++;
                P3++;
            }
            else{
                cnt += (m-P1+1);
                tmp[P3] = A[P2];
                P2++;
                P3++;
            }
        }

        while(P1 <= m){
            tmp[P3] = A[P1];
            P1++;
            P3++;
        }

        while(P2 <= e){
            tmp[P3] = A[P2];
            P2++;
            P3++;
        }

        int i=s, j=0;
        while(i<=e){
            A[i] = tmp[j];
            i++;
            j++;
        }
    }
}
