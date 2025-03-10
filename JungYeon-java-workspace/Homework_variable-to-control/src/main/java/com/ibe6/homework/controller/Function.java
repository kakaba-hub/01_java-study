package com.ibe6.homework.controller;

import java.util.Scanner;

public class Function {
    public void calculator() {
        /* 두 개와 연산자 하나를 키보드로 입력 받아 두 정수는 int변수에,
        연산문자는 char변수에 저장하시오.
        연산문자가 +이면 두 정수의 합 계산, -이면 두 정수의 차 계산,
        x 또는 X이면 두 정수의 곱, /이면 두 정수의 나누기 몫 계산 후 출력하시오.
        단, /이면서 나누는 수(두 번째 수)가 0이면 "0으로 나눌 수 없습니다." 출력하고
        결과 값은 0으로 처리하시오.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수:");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수:");
        int num2 = sc.nextInt();
        System.out.print("연산자(+, -, x, /) :");
        char op = sc.next().charAt(0);

        int result = 0;

        if (op == '/' && num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다");
            System.out.println(num1 + " " + op + " " + num2 + " = " + result);
        } else {
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case 'x':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            System.out.println(num1 + " " + op + " " + num2 + " = " + result);
        }
    }

    public void totalCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수:");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수:");
        int num2 = sc.nextInt();

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        int sum = 0;
//
        for (int i = min; i <= max; i++) {
            sum += i;
        }
//
        System.out.println(min + "부터 " + max + "까지 정수들의 합: " + sum);
    }

    public void printProfile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("나이: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별(여자/남자): ");
        String gender = sc.nextLine();
        System.out.print("성격: ");
        String ps = sc.nextLine();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("성별: " + gender);
        System.out.println("성격: " + ps);




    }

    public void printScore() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("학년: ");
        int grade = sc.nextInt();
        System.out.print("반: ");
        int cl = sc.nextInt();
        System.out.print("번: ");
        int num = sc.nextInt();
        System.out.print("성별(M/F): ");
        sc.nextLine();
        char gender = sc.nextLine().charAt(0);
        System.out.print("성적: ");
        double score = sc.nextDouble();

        String result = "";

        if (gender == 'M') {
            result = "남학생";
        } else if (gender == 'F') {
            result = "여학생";
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }

        String point = "";

        if (score >= 90) {
            point = "A";
        } else if (score >= 80) {
            point = "B";
        } else if (score >= 70) {
            point = "C";
        } else if (score >= 60) {
            point = "D";
        } else {
            point = "F";
        }
        System.out.print(grade + "학년 " + cl + "반 " + num + "번 " + result + " " + name + "의 점수는 " + score + "점이고" + " " + point + "학점입니다.");

    }

    public void printStarNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수: ");
        int num = sc.nextInt();
        if(num < 0){
            System.out.println("양수가 아닙니다.");
            return;
        }

        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                if(i == j) {
                    System.out.print(j + 1);
                }else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public void sumRandom() {
        int random = (int) (Math.random() * 100 + 1);
        int sum = 0;
        for(int i=1; i<=random; i++) {
            sum += i;
        }
        System.out.println("1부터" + random + "까지의 합: " + sum);
    }

    public void exceptGugu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수: ");
        int dan = sc.nextInt();
        if (dan > 0) {
            for (int j = 1; j <= 9; j++) {
                if (j % dan == 0) {
                    continue;
                }
                System.out.println(dan + " * " + j + " = " + (dan * j));
            }
        }
    }

    public void diceGame() {
        /*
        두 개의 주사위가 만들어낼 수 있는 모든 경우의 수를 랜덤으로 정하고
        랜덤으로 정해진 두 주사위 눈의 합이 입력된 수와 같은 경우 “맞췄습니다“ 출력,
        입력 값과 다르면 “틀렸습니다“ 출력하여 맞출 때까지 반복하시오.
        값을 맞추면 “계속 하시겠습니까? (y/n) : “가 출력되고
        ‘y’ 또는 ‘Y’ 입력 시 새로운 랜덤 수가 정해지고 처음부터 다시 시작되도록 하시오.
        만일 ‘n’ 또는 ‘N’ 입력 시 종료되도록 하시오.
         */

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("주사위 두 개의 합을 맞춰보세요(2~12입력): ");
            int num = sc.nextInt();
            sc.nextLine();
            int random = (int) (Math.random() * 12 + 2);
            if (num <= 12 && num >= 2) {
                if (random != num) {
                    System.out.println("틀렸습니다.");
                    System.out.println();
                } else {
                    System.out.println("맞췄습니다");
                    System.out.println("주사위의 합: " + random);

                    while (true) {
                        System.out.println("계속 하시겠습니까?(y/n)");
                        char answer = sc.nextLine().charAt(0);
                        if (answer == 'y' || answer == 'Y') {
                            break;
                        } else if (answer == 'n' || answer == 'N') {
                            System.out.println("종료합니다.");
                            return;
                        } else {
                            System.out.println("잘못 입력하셨습니다.");
                        }
                    }
                }
            } else {
                System.out.println("2부터 12까지의 숫자만 입력해주세요.");
            }
        }

    }
}


