package com.neuedo.hello;

public class Demo2 {
    public static void main(String[] args) {
       /* int a = 1;
        int b = 1;
        int c = 0;
        System.out.print(a+" "+b+" ");

        for(int i = 3; i<17; i++ ){
            c = a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }*/
        int pre = 1;

        for (int i = 1; i < 1000; i = i + pre) {
            System.out.println(i);
            pre = i - pre;

        }


    }

        }




