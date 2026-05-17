package _17_Object;

import java.util.Objects;

public class ObjectStudent {
    private String name;
    private int age;

    public ObjectStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //toString
    //클래스 풀네임 + @ + 16진수
    //국룰: 객체의 상태(필드 값) 정보를 문자열로 표현
    //로깅 목적, 디버깅 목적 (문제 추적)

    @Override
    public String toString() {
        String data = ("name=" + this.name + " age=" + this.age);
        return data;

    }

    //equals()
    //원래 == 연산자와 동일하게 주소 비교
    //근데 오버라이딩해서 필드가 같으면 true가 나오게 하고 싶다면
    public boolean equals(Object o) {
        //같은 클래스 객체가 아니면 false
        if(o == null || this.getClass() != o.getClass()) {
            return false;

            //여기서 getClass는 MyClass와 무관하고 이 객체의 클래스 정보를
            //반환하는 메서드다
    }

        //다운캐스팅
        //왜 이름이 다운캐스팅이냐, Object처럼 큰 범위였는데
        //ObjectStudent처럼 더 구체적인 타입으로 내려왔으니까
        ObjectStudent that = (ObjectStudent) o;
        //필드 값 비교
        //원시 자료형은 필드는 == 연산자 사용
        //참조 자료형 필드는 Objects.equals() 사용
        return age == that.age && Objects.equals(name, that.name);
    }

    //equals를 오버라이딩하면, 반드시 hashCode도 오버라이딩 해 줘야 함
    //HashMap, HashSet 같은 해시 기반 자료형에서 중복 체크 할 때 사용됨

    @Override
    public int hashCode() {
        //hash에 넘기는 필드는 equals와 동일하게
        return Objects.hash(name, age);

    }
}
