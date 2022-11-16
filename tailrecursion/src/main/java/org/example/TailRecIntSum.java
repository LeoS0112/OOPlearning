package org.example;

public class TailRecIntSum {
    int triangularTail(int start, int accum){
        if (start == 0) {
            return accum;
        }
        return triangularTail((start-1), (accum+start));
    }

    int triangularNoTail(int start){
        if (start == 0){
            return 0;
        }
        return start + triangularNoTail(start-1);
    }

}
