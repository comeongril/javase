package com.neuedo.bank;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
       bank();
    }
    static void bank(){
        double i;
     double i1;
       double i2;
       double j1;
       double j2;
        System.out.println("请输入存款数");
        Scanner s = new Scanner(System.in);
        i = Double.parseDouble(s.next());
        i1 = i+i*0.0035;
        i2 = i+i1*2;
        j1 = i+i*0.015;
        j2 =i+i*0.021*2;
        System.out.println("第一年活期："+i1);
        System.out.println("第二年活期："+i2);
        System.out.println("第一年定期："+j1);
        System.out.println("第二年定期："+j2);


    }
}
