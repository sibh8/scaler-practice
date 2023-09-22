package com.gallifreyantimelord.scaler.dsaadvanced.day32;

public class MaxSubArraySumKadanceAlgorithm {
    public static void main(String[] args) {

//        int[] ar = {3,2,-6,8,2,-9,4};
//        int[] ar = {3,2,4,-1,3,-4,3};
        int[] ar = {1,2,3,4,5,6,7,8,9};

        int[] res = calculateMaxSubArraySum(ar);

        for(int i=0; i<res.length; i++){
            System.out.println(res[i]);
        }
    }

    private static int[] calculateMaxSubArraySum(int[] a){
        int ans[] = new int[3];
        int N = a.length;

        int sum = 0, max=-999999, s=0, e=0;

        for(int i=0; i<N; i++){
            sum+=a[i];

            if(sum < 0) {
                sum = 0;
                s = i+1;
            }

            if(max < sum) {
                max = sum;
                e = i;
            }
        }

        ans[0] = s;
        ans[1] = e;
        ans[2] = max;

        return ans;
    }
}
