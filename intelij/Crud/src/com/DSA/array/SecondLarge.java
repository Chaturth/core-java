package com.DSA.array;

public class SecondLarge {

    public static void main(String[] args) {

        int[] digit={6,4,2,7,8};
        int largest=digit[0];
        int secondLargest=0;

        int i=0;

        while(i < digit.length){
            if(digit[i]>largest) {
                 secondLargest = largest;
                largest = digit[i];
            }
            else if (digit[i] > secondLargest && digit[i] != largest) {
                secondLargest = digit[i];
            }

            i++;
        }
        System.out.println("first largest:"+largest);
        System.out.println("second largest:"+secondLargest);

    }
}
