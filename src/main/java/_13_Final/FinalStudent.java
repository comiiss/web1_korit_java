package _13_Final;

public class FinalStudent {
    private final String name;
    private final int studentId;
    private int age;

    //final: 반드시 1회 초기화되어야 하는 필드
    public FinalStudent(String name, int studentId, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    //setName(String name)은 final 필드이기 때문에 불가능하다

//    public void setName(String name) {
//        this.name = name; << 메서드는 적을 수 있는데 this가 안 된다
//    }

    //final 매개 변수 - 외부에서 들어온 값을 변경할 수 없음
    public void printInfo(final String school) {
        System.out.println("학교: " + school);
        System.out.println("이름: " + this.name);
        System.out.println("학번: " + this.studentId);
        System.out.println("나이: " + this.age);
    }

}

