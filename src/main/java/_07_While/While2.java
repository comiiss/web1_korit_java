package _07_While;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {

        /*
            while(조건식) {}: (조건 -> 코드 실행) x n
            do {} while(조건식): (코드 실행 -> 조건) x n

            - 최소 한 번은 실행되는 반복문

         */
        //메뉴 선택시
        Scanner scanner = new Scanner(System.in);
        int myChoice;
        int balance = 100000;


        do {
            System.out.println("--메뉴 선택--");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 잔액 확인");
            System.out.println("0. 종료");

            System.out.print("메뉴를 선택하세요: ");
            myChoice = scanner.nextInt();

            if (myChoice == 1) { //입금
                System.out.println("입금할 금액: ");
                int money = scanner.nextInt();
                balance += money;
                System.out.println(money + "원 입금 완료");

            } else if (myChoice == 2) { //출금
                //출금 구현(잔액 부족시 "잔액이 부족합니다" 출력)
                System.out.println("출금할 금액");
                int money = scanner.nextInt();
                if (balance < money) {
                    System.out.println("잔액이 부족합니다");
                    continue;
                }
                balance -= money;
                System.out.println(money + "원 출금 완료");


            } else if (myChoice == 3) { //잔액 확인
                System.out.println("잔액: " + balance);

            }
        }

        while (myChoice != 0); //myChoice == 0이면 탈출
        System.out.println("ATM 종료");
    }
}