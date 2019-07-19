package com.neuedo.hello;

public class Helloword {
   public static void main(String[] args) {
        /*for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();*/



        /*for(int i =97; i< 123 ; i++){
            System.out.print((char)i);
        }
        for(int i=121; i>96;i--){
            System.out.print((char)i);
        }*/
       /*for (int i = 0; i < 5; i++) {
           for (int j = 0; j <5 ; j++) {
               if (i>=j){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }

           }
           System.out.println();


       }*/
       for (int i = 0; i < 5; i++) {
           for (int j = 0; j <5 ; j++) {
               if (i +j>=2 && j-i<=2 && i-j<=2 && i+j<=6){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }



           }
           System.out.println();
       }
   }
}






