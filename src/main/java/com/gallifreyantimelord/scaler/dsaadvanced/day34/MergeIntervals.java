package com.gallifreyantimelord.scaler.dsaadvanced.day34;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,5},{8,10},{15,20},{21,24},{27,30}};
        int s = 11;
        int e = 22;

        int N = intervals.length;

        for(int i=0; i<N; i++){
            int si = intervals[i][0];
            int ei = intervals[i][1];

            if(ei < s) {
                System.out.println("{" + si + "," + ei + "}");
            }else if(e < si) {
                System.out.println("{" + si + "," + ei + "}");

                for (int j = 0; j < N; j++) {
                    System.out.println("{" + intervals[j][0] + "," + intervals[j][1] + "}");
                }
                return;
            } else{
                if(si < s){
                    s = si;
                }
                if(e < ei){
                    e = ei;
                }
            }
        }

        // System.out.println("{" + s + "," + e + "}");
    }
}
