package com.neuedo.bank;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Round();
    }
    static void Round(){
        double p =3.14;
        double r;
        double c;
        double m;
        System.out.println("请输入圆的半径");
        Scanner s = new Scanner(System.in);
        r = Double.parseDouble(s.next());
        c =2*p*r;
        m = p*r*r;
        System.out.println("圆的周长:"+ c);
        System.out.println("圆的面积:"+ m);

    }
}

