package _10_Class;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[10];
        //자리만 미리 만들어두면
        //원시 자료형은 기본값이 배정됨
        //참조 자료형은 null이 배정됨

        int count = 0;
        while(true) {
            System.out.println("--학생 기록부--");
            System.out.println("1. 학생 조회");
            System.out.println("2. 학생 등록");
            System.out.println("q. 종료");

            System.out.println("메뉴 선택: ");
            String choice = scanner.nextLine();
            if(choice.equals("1")) {

            } else if(choice.equals("2")) { //학생 등록
                System.out.println("이름을 입력하세요: ");
                String name = scanner.nextLine();
                System.out.println("국어 점수: ");
                int kor = scanner.nextInt();
                System.out.println("영어 점수: ");
                int eng = scanner.nextInt();
                System.out.println("수학 점수: ");
                int math = scanner.nextInt();

                //객체로 조합
                Student student = new Student(name, kor, eng, math);
                students[count] = student;
                count++;


            } else if(choice.equals("q")) { //종료
                System.out.println("종료");
                break;

            } else {
                System.out.println("다시 입력하세요");
            }
        }

    }
}
