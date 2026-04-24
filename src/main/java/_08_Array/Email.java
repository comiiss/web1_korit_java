package _08_Array;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        System.out.print("이메일을 입력하세요: ");
        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();

        //1. 이메일이 유효한가? - @이 있는가 && .이 있는가
        //유효하면 유효합니다 출력
        //사용자 이메일 아이디 추출해서 출력

        boolean hasAt = email.contains("@");
        boolean hasDot = email.contains(".");

        if(hasAt && hasDot) {
            System.out.println("유효합니다");
        }

        int atIndex = email.indexOf("@");
        String username = email.substring(0, atIndex);
        System.out.println(username);

        int dotIndex = email.indexOf(".");
        String domain = email.substring(atIndex + 1, dotIndex);

        //특정 index의 char를 추출
        char firstChar = domain.charAt(0); //알고리즘 테스트
        System.out.println(firstChar);

        }



    }

