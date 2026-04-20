package _06_For;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        /*
            반복문 for문
            *for문에서 선언하는 변수는 중괄호 안에만 생존하는 변수다
            for(변수 선언 - 초기식; 조건식; 증감식) {
                반복될 코드
            }

            for문 코드 진행 순서
            초기식 - 조건식 검사 - true면 코드 실행 - 증감식) X n
            - 조건식 검사 결과가 false면 for 중괄호 탈출

         */

        //안녕하세요 5번 출력

        for (int i = 0; i < 5; i++) {
            System.out.println("안녕하세요");
        }

        //초기식 생략시
        int a = 0;
        for (; a < 5; a++) {
            System.out.println("안녕하세요");
        }


        //중간 코드
        int b = 0;
        for (; a < 10; a++) {
            b++;
        }

        System.out.println(a + b); //출력값을 작성하시오


        for (int i = 1; i <= 5; i++) {
            System.out.println("사람" + i);
        }

        //1단계) 1~10 출력
        //2단계) 1~10 중 짝수만 출력
        //3단계) 1~100 합한 값 출력

        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
        }

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        int sum = 0; //외부 변수
        for (int i = 1; i <= 100; i++) {
            sum += i; //sum = sum + i;
        }
        System.out.println(sum);

        //4단계) 1 ~ 100까지 수 중에서
        //3의 배수, 5의 배수가 각각 몇 개인지 출력

        int countOf3 = 0;
        int countOf5 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                countOf3++;

            }
            if (i % 5 == 0) {
                countOf5++;

            }
        }
        System.out.println(countOf3);
        System.out.println(countOf5);

        for (int i = 1; i <= 10; i++) {
            //짝수면 출력해
            //홀수면 출력하지 마
            if (i % 2 != 0) {
                System.out.println("홀수 발견");
                continue; //다음 반복으로 스킵
            }
            System.out.println(i); //스킵된다면 실행 불가능
        }

        //1~10 더하다가 20이 넘어가는 순간 탈출
        int sum2 = 0;
        for (int i = 1; i <= 10; i++) {
            sum2 += i;
            if (sum2 > 20) {
                System.out.println("20 초과!" + sum2);
                break; //반복 중단 - for문 중괄호 즉시 탈출
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요:");
        //입력 받은 숫자를 1~100를 for문을 돌며 탐색
        //매 반복마다 누적합
        //입력 받은 숫자를 찾으면, 탈출하면서 누적합 출력
        //만약에 못 찾는다면 찾을 수 없다고 출력해야 한다

        int input = scanner.nextInt();
        int sum3 = 0;
        boolean isExist = false;

        for (int i = 1; i <= 100; i++) {
            sum3 += i; //매 반복마다 누적합
            if (i == input) ;
            {
                System.out.println(sum3);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("숫자를 찾을 수 없습니다");
        }

        //1~100 반복 중
        //누적합
        //누적합이 2000이 넘어가고,
        //i가 짝수일 때 탈출, i와 누적합 출력

        int sum4 = 0;
        for (int i = 1; i <= 100; i++) {
            sum4 += i;
            if (sum4 > 2000 && i % 2 == 0)
                {
                    System.out.println(sum4);
                    System.out.println(i);
                    break;

                }

            }
        }
    }




