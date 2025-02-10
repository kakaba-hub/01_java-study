package com.jun.section02.loop.controller;

import java.util.Scanner;

public class While {

    /*
     ## while문 ##

     1. 특정 조건을 만족하는 경우 반복해서 실행할 코드 작성
     2. 반복 실행할 코드는 중괄호 {}로 묶어 다른 코드와 구분해줘야함
     */

    public void testBasicWhile() {

        // "안녕하세요" 5번 출력

        /*
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        */

        int count = 0;
        while(count < 5){// count=0,1,2,3,4 =>count가 5가 되기 전까지 반복
            System.out.println("안녕하세요");
            count++;
        }
    }

    public void testWhlieExample1(){
        // 1부터 5까지 1씩 증가되는 값을 출력

       int num = 1;
        while(num <= 5){// num = 1,2,3,4,5 => 6이 되는 순간 반복이 종료되어야함
            System.out.println(num++);
//            num++;
        }

    }

    public void testWhileExample2(){
        // 1부터 사용자가 입력한 수까지 1씩 증가되는 값 출력
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int inputnum =sc. nextInt();

        int num = 1;
        while(num <= inputnum){ //num=1,2,3....,inputnum까지 수행
            System.out.println(num++);
        }
    }
    /*
        ## do while문 ##
        1. while문은 조건식에 따라,변수의 초기값에 따라 반복문이 단한번도 실행되지 않을 수 있음
        2. do while문을 사용하면 조건식고 상관 없이 반드시 최초 1번은 실행함
        3. 작성 형식
     */

    public void testBasicDoWhile(){
      do {
          System.out.println("조건식과 상관없이 최초 1번은 동작됨");
      }while(false);
    }
    public void testDoWhileExample1(){
        // 1부터 사용자입력값까지 1씩 증가되는 값 출력
        // 단, 사용자가 입력한 값이 음수일 경우 적어도 1은 출력되도록하시오.
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int inputNum = sc. nextInt();

        int num = 1;
        do {
            System.out.println(num++);
        }while(num <= inputNum);
    }
}
