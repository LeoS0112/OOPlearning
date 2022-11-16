package org.example;

public class Main {
    public static void main(String[] args) {

        TailRecIntSum tester = new TailRecIntSum();
        long startTime = System.nanoTime();
        var tail = tester.triangularTail(6000, 0);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        long startTimeNoTail = System.nanoTime();
        var noTail = tester.triangularNoTail(6000);
        long endTimeNoTail = System.nanoTime();
        long durationNoTail = endTimeNoTail - startTimeNoTail;
        System.out.println(duration);
        System.out.println(durationNoTail);
        System.out.println(lowestCommon(0,1));
    }

    public static int lowestCommon(int a, int b){
        if (a%2 == b%2){
            return 0;
        }
        if (a==0 || b==0){
            return -1;
        }
        return 1 + lowestCommon((a/2), (b/2));
    }

}