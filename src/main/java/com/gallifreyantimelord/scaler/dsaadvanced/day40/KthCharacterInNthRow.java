package com.gallifreyantimelord.scaler.dsaadvanced.day40;

public class KthCharacterInNthRow {
    public static void main(String[] args) {
        int N = 5;
        int k = 4;

        System.out.println(findCharacter(N, k));
    }

    private static int findCharacter(int n, int k){
        if(n == 1)
            return 0;

        int parent = findCharacter(n-1, k/2);

        if(k%2 == 0)
            return parent;
        else
            return (parent^1);
    }
}
