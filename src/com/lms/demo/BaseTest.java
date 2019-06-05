package com.lms.demo;


import java.util.Scanner;

public class BaseTest {
    public static void main(String[] args) {
        // 求取最大公约数
        System.out.println("请输入第一个整数：");
        Scanner scanner = new Scanner(System.in);
        int one =  scanner.nextInt();
        System.out.println("请输入第二个整数：");
        int two  =  scanner.nextInt();

        int min = (one < two ) ? one :two ;
        for(int i = min ; i > 0; i--){
            if (one % i ==0 && two % i ==0 ){
                System.out.println("最大公约数是："+ i);
                break;
            }
        }
    }
}