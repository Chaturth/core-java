package com.DSA.array;

import java.util.Arrays;

public class Duplicate {

    public static void main(String[] args) {

        int[] num={1,2,4,2,6,7};
        Arrays.sort(num);
        int i=0;
        for( i=0;i< num.length;i++)

        {
            boolean found=false;
            for(int j=i+1;j<num.length;j++){

                if(num[i]==num[j]){
                    found=true;
                }
            }
            if(!found){

                System.out.println(num[i]+"");
            }
        }

    }
}
