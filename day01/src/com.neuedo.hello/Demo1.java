package com.neuedo.hello;
import java.util.Scanner;


public class Demo1 {
    public static void main(String[] args) {
        System.out.println("请输入头的个数");
        Scanner scanner = new Scanner(System.in);
        int head =scanner.nextInt();
        System.out.println("请输入脚的个数");
        int foot =scanner.nextInt();
        int x =0;
        int y =0;
        if (foot>2*head && ((foot-2*head)/2)%2==0){
         x =(foot-2*head)/2;
         y =(head-x);
        System.out.println(x);
        System.out.println(y);
        }else{
            System.out.println("数值不符合");
        }

        }
    }

