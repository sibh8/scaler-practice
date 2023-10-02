package com.gallifreyantimelord.scaler.dsaadvanced.day40;

public class TowerOfHanoi {
    public static void main(String[] args) {

        printTowerOfHanoiMovement(4, "A","C", "B");

    }

    private static void printTowerOfHanoiMovement(int N, String src, String dest, String temp){
        if(N == 0){
            return;
        }

        printTowerOfHanoiMovement(N-1, src, temp, dest);
        System.out.println("Movement: "+src+"->"+dest);
        printTowerOfHanoiMovement(N-1, temp, dest, src);
    }
}
