package _07_While;

import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        //1 이상 11 미만 정수 중 랜덤 하나 뽑은 후, 대입
        int randomNum = random.nextInt(1, 11);

        System.out.println(randomNum);

        while (true) {
            System.out.println("숫자를 입력하세요: ");
            int myGuess = scanner.nextInt();

            if (myGuess == randomNum) {
                System.out.println("정답입니다");
                break;
            } else {
                System.out.println("다시 입력하세요: ");

            }
            //1 ~ 100 사이 랜덤 숫자 뽑은 후, 대입
            int randomInt = random.nextInt(1, 101);

            //1. 1 ~ 100 사이 정수 입력 받기
            //2. 입력값 > 랜덤값 "down" 출력
            //3. 입력값 < 랜덤값 "up" 출력
            //4. 입력값 == 랜덤값 "정답입니다" 출력 후 탈출

            while (true) {
                System.out.print("숫자를 입력하세요");
                int myself = scanner.nextInt();

                //입력값 검증(1 ~ 100)
                if(myGuess < 1 || myGuess > 100) {
                    System.out.println("1 ~ 100 사이 값을 입력하세요");
                    continue;

                }

                if (myself > randomInt) {
                    System.out.println("down");
                } else if (myself < randomInt) {
                    System.out.println("up");
                } else {
                    System.out.println("정답입니다");
                    break;
                }
            }
        }
    }
}

