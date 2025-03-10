package com.kyungbae.section01.arithmetic;

public class Application1 { // class start

    public static void main(String[] args) { // main start
    /*
        # 산술연산자
        1. 이항 연산자 (두 개의 값 연산)
        2. 종류
            1) 덧셈   : +
            2) 뺄셈   : -
            3) 곱셈   : *
            4) 나누기 : /
            5) 나머지 : %
        3. 우선순위
            1) * / %
            2) + -

     */

        int num1 = 10;
        int num2 = 3;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2); // 나누기 했을 때의 몫
        System.out.println(num1 % num2); // 나누기 했을 때의 나머지

        // ArithmeticException : / by zero
        // 0 나누기 하였을때 오류코드

        // % 사용
        // 값 % 2 == 0   => 짝수
        // 값 % 2 == 1   => 홀수

        // 값 % 5 == 0   => 5의 배수


    } // main end

} // class end
