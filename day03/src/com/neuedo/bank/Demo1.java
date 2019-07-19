package com.neuedo.bank;

import java.util.Scanner;

public class Demo1 {
        static int money = 10000;
        static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();




    }
    static void showMenu() {
        while(true){
            System.out.println("*******");
            System.out.println("1.查看余额");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.退出");
            System.out.println("请输入编号来选择功能");
            int index = input.nextInt();
            input.nextLine();
            switch (index){
                case 1:
                    lookMoney();
                    break;
                case 2:
                    addMoney();
                    break;
                case 3:
                    takeMoney();
                    break;
                case 4:
                    moveMoney();
                    break;
                case 5:
                    close();
                    return;
                    default:
                        System.out.println("没有此项");
            }

        }
    }
    static void lookMoney(){
        System.out.println("余额为"+money);
    }
    static void addMoney(){
        System.out.println("请输入存款金额");
        int add = input.nextInt();
        input.nextLine();
        money += add;
        System.out.println("成功");
    }
    static  void takeMoney(){
        System.out.println("请输入取款金额");
        int take =input.nextInt();
        input.nextLine();
        money -= take;
        System.out.println("成功");
    }
    static  void moveMoney(){
        System.out.println("请输入转账金额");
        int move =input.nextInt();
        input.nextLine();
        money += move;
        System.out.println("成功");

}
static void close(){
    System.out.println("退出");

}
}
