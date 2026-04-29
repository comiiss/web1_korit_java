package _10_Class;

public class ClassMain {
    public static void main(String[] args) {
        //클래스: 내가 직접 정의하는 참조 자료형

        //new: 참조 자료형이 저장될 heap 메모리 공간 확보
        Student st1 = new Student(); //st1은 heap 주소를 저장
        //.으로 불러온다
        st1.name = "홍길동";
        st1.kor = 90;
        st1.eng = 80;
        st1.math = 70;
        System.out.println(st1.name); //데이터를 읽겠다

        //new 연산시 실제 heap에 데이터 묶음을 저장할 구역을 만든다
        //그것을 객체라고 부른다 혹은 인스턴스라고 한다
        Student st2 = new Student();
        st2.name = "홍길동";
        st2.kor = 90;
        st2.eng = 80;
        st2.math = 70;

        Student[] students = {st1, st2};
        //자료형[] 변수 이름 = { };

        //Car 클래스를 정의해 주세요
        //필드: brand, model, year
        //서로 다른 car 객체를 생성해 주세요

        Car car1 = new Car();
        car1.brand = "현대";
        car1.model = "그랜저";
        car1.year = 25;

        Car car2 = new Car();
        car2.brand = "기아";
        car2.model = "K9";
        car2.year = 26;

        Student st3 = new Student("김길동", 100, 90, 100);
        //둘 다 객체의 주소를 넘기는 것
        Student.printInfo(st3); //직접 넘기기
        st3.printInfo(); //첫 번째, this로 넘기기

        Student[] sts = {st1, st2, st3};
        for(Student st : sts) {
            st.printInfo();
        }


    }
}
