package com.DSA.array;

public class Reverse {
    public static void main(String[] args) {


        String[] word = {"A", "B", "c"};

        int start = 0;
        int end = word.length - 1;

        while (start < end) {
            String temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            start++;
            end--;


        }
        for(String s: word)
        {
            System.out.println("Reversed string:"+s);
        }
    }
}
