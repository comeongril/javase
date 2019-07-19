package com.neuedo.shuzu;


import java.util.Random;

public class a {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r = new Random();
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = r.nextInt(10);

        }
        for (int i:arr) {

            System.out.println(i);
        }
        int max = arr[0];
        int min = arr[0];
        for (int i:arr) {
            if (i>max) {
                max = i;
        }
        if (i<min){
            min = i;
        }
        }
            System.out.println("最大值"+max);
            System.out.println("最小值"+min);



}
}
