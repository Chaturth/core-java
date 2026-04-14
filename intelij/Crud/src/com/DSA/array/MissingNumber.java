package com.DSA.array;

public class MissingNumber {
    public static void main(String[] args) {
        int[] num={1,2,3,5,6};
        int n= num.length+1;
        int totalSum=n*(n+1)/2;

        int arraySum=0;
        for(int nums : num){
            arraySum+=nums;
        }


        int missingNo=totalSum-arraySum;
        System.out.println("missingNumber is:"+missingNo);
    }
}
