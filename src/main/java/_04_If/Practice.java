package _04_If;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        String realId = "java";
        String realPassword = "qwer1234";

        //1. 스캐너를 통해 아이디, 패스워드를 입력 받는다
        //2. 입력 받은 아이디, 패스워드가 모두 동일하면
        //로그인 성공 출력, 아니라면 로그인 실패 출력

        Scanner scan = new Scanner(System.in);

        System.out.println("아이디: ");
        String Id = scan.nextLine();

        System.out.println("비밀번호: ");
        String Password = scan.nextLine();

        if(Id.equals(realId) && Password.equals(realPassword)) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }

        boolean isSameId = realId.equals(Id);
        boolean isSamePassword = realPassword.equals(Password);
        boolean isVaildLogin = isSameId && isSamePassword;

        if(isVaildLogin) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }
    }
}
