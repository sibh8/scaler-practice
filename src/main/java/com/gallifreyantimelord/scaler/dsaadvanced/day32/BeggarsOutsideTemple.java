package com.gallifreyantimelord.scaler.dsaadvanced.day32;

public class BeggarsOutsideTemple {
    public static void main(String[] args) {
        int[][] queries = {{1,3},{4,-2},{3,1}};

        int[] ans = calculateBeggarsOutsideTemple(6, queries);

        for(int i=0; i<6; i++){
            System.out.print(ans[i]+" ");
        }

        System.out.println("");

        int[][] queries1 = {{0,-1},{3,2},{2,-4}};

        ans = calculateBeggarsOutsideTemple(7, queries1);

        for(int i=0; i<6; i++){
            System.out.print(ans[i]+" ");
        }
    }

    private static int[] calculateBeggarsOutsideTemple(int A, int[][] queries) {

        int N = queries.length;
        int[] ar = new int[A];

        for(int i=0; i<N; i++){
            int idx = queries[i][0];
            int val = queries[i][1];

            ar[idx] = val;
        }

        int sum = 0;

        for(int i=0; i<A; i++){
            sum+=ar[i];
            ar[i] = sum;
        }

        return ar;
    }
}
