package com.neuedo.shuzu;

import java.util.Random;

public class Demo1 {

        public static void main(String[] args) {

            // 定义数组
           int[] arr = new int[5];
            //随机数组
            Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
                arr[i] = r.nextInt();
            }
            // 打印所有数组元素
            for (int a:arr) {
                System.out.println(a);
            }
          // 查找最大值
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {max = arr[i];
                }
            }
            System.out.println("Max is " + max);
            // 查找最小值
           int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {min = arr[i];
                }
            }
            System.out.println("Min is " + min);
            // 计算所有元素的总和
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println("sum is " + sum);
            //计算平均值
            System.out.println("avg is " + sum / arr.length);

        }

    }



