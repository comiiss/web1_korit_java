package _04_If;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        //if문 - 코드 분기 목적으로 사용하는 제어문법
        int height = 130;
        int age = 23;
        //if(boolean 데이터) {
        //       boolean이 true면 실행되는 코드
        // }
        if (height >= 120) {
            System.out.println("탑승 가능합니다");
        }

        if (true) {
            System.out.println("저는 항상 실행됩니다");
        }

        if (height >= 120 && age < 14) {
            System.out.println("탑승 가능합니다");

        }

        if (age >= 20) {
            System.out.println("성인입니다");
        } else { //위의 조건들이 모두 false일 떄
            System.out.println("미성년자입니다");
        }

        //if ~else if~ else 문
        //위에서부터 아래로 감시한다
        //동시에 여러 조건을 검사하는 것이 아니다
        //오름차순, 내림차순으로 작성해야 한다
        //true가 연산되면 해당 블럭 코드를 실행하고 탈출

        if (age <= 7) {
            System.out.println("유치원");
        } else if (age <= 13) {
            System.out.println("초등학교");
        } else if (age <= 16) { //위의 조건들이 false여야 실행됨
            System.out.println("중학교");
        } else if (age <= 19) {
            System.out.println("고등학교");
        } else {
            System.out.println("성인");
        }

        //내가 정한 규칙(비즈니스 로직)에서 조건문을 작성할 때
        boolean isLogin = false; //로그아웃 상태
        boolean isBanned = true; //차단 계정이다

        if (!isLogin) {
            System.out.println("로그인이 필요합니다");
        } else if (isBanned) {
            //위 조건이 false일 때 실행, 로그인 때만 실행
            System.out.println("정지된 계정입니다");

        }

        //실습 1) num1의 절댓값 출력
        int num1 = -12; //12로 변경했을 떄도 12 출력
        if (true) {
            System.out.println(num1);
        } else {
            System.out.println(num1 * -1);
        }

            //실습 2) num2, num3 중 큰 값을 출력

            Scanner scanner = new Scanner(System.in);
            System.out.println("입력하세요");

            int num2 = 10;
            int num3 = scanner.nextInt(); //20으로 바뀌면 20이 출력


            if (num2 > num3) {
                System.out.println(num2);
            } else {
                System.out.println(num3);

            }

            scanner.close();

            //실습3 bmi 계산
            //bim = 체중(kg) / 키(m)*키(m)
            //철수(174cm, 70kg)의 비만도 결과를 출력해 주세요

            double height2 = 174/100.0; //int와 double이 연산되면 double
            double weight = 70.0;

            /*

            double low = 18.5;
            int normal = 25;
            int over = 30;

             */

            double bmi = weight / (height2 * height2);

            //연산자 우선순위: (), >, 대입
            //우선순위 동일하면, 왼쪽부터 연산해야 한다


        /*if(weight / (height1 * height1) < low) {
                System.out.println("저체중");
            } else if(weight / (height1 * height1) >= low
                        && weight / (height1 * height1) < normal) {
                System.out.println("정상");
            } else if(weight / (height1 * height1) >= normal
                        && weight / (height1 * height1) < over) {
                System.out.println("과체중");
            } else {
                System.out.println("비만");

         */
            if(bmi < 18.5) {
                System.out.println("저체중");
            } else if(bmi < 25) { // && bmi >= 18.5
                System.out.println("정상");
            } else if(bmi < 30) { //&& bmi >= 25
                System.out.println("과체중");
            } else {
                System.out.println("비만");


            }



        }
    }
