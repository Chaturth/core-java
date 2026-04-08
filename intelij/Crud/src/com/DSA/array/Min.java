package com.DSA.array;

public class Min {

    public static void main(String[] args) {

        int[] num={44,55,22,88,5,2};

        int min=num[0];

        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[j] < min)
                {
                    min=num[j];

                }
            }
        }
        System.out.println("Minimum element found:"+min);
    }
}
