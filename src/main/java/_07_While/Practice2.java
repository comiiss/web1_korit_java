package _07_While;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        String password = "1234";
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int maxCount = 5;

        while (true) {
            //비밀번호 입력 받기
            //맞추면 "문이 열립니다" 출력
            //틀리면 "다시 입력하세요" 출력
            //5회 틀리면, "문이 잠깁니다" 출력하고 탈출
            System.out.print("비밀번호를 입력하세요: ");
            String passwordInput = scanner.nextLine();

            if (password.equals(passwordInput)) {
                System.out.println("문이 열립니다");
                break;
            } else {
                System.out.println("다시 입력하세요");
                count++;

            }
            if (count == maxCount) {
                System.out.println("문이 잠깁니다");
                break;
            } else {
                int leftTrial = maxCount - count;
                System.out.println("남은 시도 횟수: " + leftTrial);
            }
        }


    }
}