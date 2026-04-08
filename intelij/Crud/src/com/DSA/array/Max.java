package com.DSA.array;

public class Max {

    public static void main(String[] args) {

        int[] numbers={1,2,4,6,8,0,6};
        int max=numbers[0];


        for(int i=0; i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[j]>max)
                {
                    max=numbers[j];

                }
            }

        }
        System.out.println("Maximum element is:"+max);
    }

}
