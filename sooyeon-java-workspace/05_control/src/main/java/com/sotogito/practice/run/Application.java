package com.sotogito.practice.run;

import com.sotogito.practice.controller.ConditionPractice;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConditionPractice cp = new ConditionPractice();

        System.out.println("실행할 기능을 선택하세요.");
        int function = sc.nextInt();


        if(function >=1 && function<=9){
            System.out.printf("선택 : %d",function);
        }

        switch (function) {
            case 1:
                cp.practice1();
                break;
            case 2:
                cp.practice2();
                break;
            case 3:
                cp.practice3();
                break;
            case 4:
                cp.practice4();
                break;
            case 5:
                cp.practice5();
                break;
            case 6:
                cp.practice6();
                break;
            case 7:
                cp.practice7();
                break;
            case 8:
                cp.practice8();
                break;
            case 9:
                cp.practice9();
                break;
            default:
        }

    }
}
