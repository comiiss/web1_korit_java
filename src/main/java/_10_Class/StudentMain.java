package _10_Class;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //스캐너 생성
        int max = 10; //10이라는 공간 설정
        Student[] students = new Student[max];
        //Student 타입을 담을 수 있는
        //max 공간 만큼의 배열 students 1개 생성

        //자리만 미리 만들어두면
        //원시 자료형은 기본값이 배정됨
        //참조 자료형은 null이 배정됨

        int count = 0; //나중에 쓸 count 변수 선언
        while (true) {
            System.out.println("--학생 기록부--");
            System.out.println("1. 학생 조회");
            System.out.println("2. 학생 등록");
            System.out.println("3. 이름으로 조회");
            System.out.println("q. 종료");

            System.out.println("메뉴 선택: ");
            String choice = scanner.nextLine();

            //while의 조건이 언제나 true이 무한 반복됨

            if (choice.equals("1")) { //학생 전체 조회
                if (count == 0) {
                    System.out.println("등록한 학생이 없습니다.");
                    continue;

                }

                for (Student st : students) {
                    if (st == null) {
                        break;
                    } //채워진 배열을 출력하다가, null인 배열을 만나면
                    //break를 걸기
                    st.printInfo();
                }

                for (int i = 0; i < count; i++) {
                    Student st = students[i];
                    st.printInfo();
                    break;
                    //하나씩 꺼내서 조회하기

                }

            } else if (choice.equals("2")) {//학생 등록

                if (count >= max) {
                    System.out.println("정원 초과입니다");
                    continue;
                }
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

                //학생 등록을 할 때 객체가 만들어져야 하니까
                //카운트도 되게끔 적었다


            } else if (choice.equals("q")) { //종료
                System.out.println("종료");
                break;

            } else if (choice.equals("3")) { //이름으로 조회
                if (count == 0) {
                    System.out.println("등록된 학생이 없습니다");
                }

                System.out.println("이름을 입력하세요: ");
                String name = scanner.nextLine();

                boolean isFound = false;

                for (int i = 0; i < count; i++) {
                    Student st = students[i];
                    if (st.name.equals(name)) {
                        st.printInfo();
                        isFound = true;
                        break;
                    }
                }

                if (!isFound) {
                    System.out.println("해당 이름의 학생은 없습니다");
                }


            } else {
                System.out.println("다시 입력하세요");
            }
        }

    }
}
