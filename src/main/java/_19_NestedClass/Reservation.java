package _19_NestedClass;


//예약 클래스
//내부 클래스 - static 내부 클래스(빌더 패턴으로)
public class Reservation {
    private String username;
    private String date;
    private int personCount;
    private int price;

    //일반 내부 클래스 안 쓰는 이유
    //class A {} <-- 이게 내부 클래스
    //메모리 누수 때문이다
    /*
        내부 클래스의 객체는 바깥 클래스의 객체가 존재해야 생성 가능
        - 내부 객체는 항상 바깥 객체를 참조하고 있다
        - 내부 객체는 사용되는데 바깥 객체는 사용되지 않는 상황이 있을 수 있다\
        - 가비지 콜렉터가 바깥 객체를 회수 대상으로 생각 X
          이런 과정에서 메모리 누수

     */

    //빌더 패턴 - 생성자를 대체하는 패턴
    //필드가 많은 상황에서 오버로딩으로는 경우의 수가 너무 많아진다

    //1. private로 외부 생성을 막는다
    private Reservation(Builder builder) {
        //3. 빌더 객체의 필드값을 복사해옴
        this.username = builder.username;
        this.date = builder.date;
        this.price = builder.price;
        this.personCount = builder.personCount;

    }

    //외부에서 Builder를 접근하기 쉽게
    public static Builder builder() {
        return new Builder(); //빌더의 기본 생성자(필드 초기화 안 되어 있음)

    }


    //스태틱 내부 클래스는 별개의 클래스 취급을 한다(사실상 다른 파일)

    public static class Builder {
        //2. 바깥 클래스의 필드 구성을 동일하게 가져간다
        private String username;
        private String date;
        private int personCount;
        private int price;

        //3. setter들을 정의

        public Builder username(String username) {
            //여기서 this는? builder 객체
            this.username = username;
            return this;
        }

        public Builder date(String date) {
            this.date = date;
            return this;

        }

        public Builder personCount(int personCount) {
            this.personCount = personCount;
            return this;

        }

        /*
            e: React.MouseEvent<HTMLButtonElement>
            JSX.Element
         */
        public Builder price(int price) {
            this.price = price;
            return this;


        }

        //4. 바깥 클래스의 private 생성자를 빌더가 호출
        //static 내부 클래스는 다른 클래스 취급이지만,
        //private 필드, 메서드 접근이 가능하다
        //접근 제어자에 영향 받지 않는다
        public Reservation build() {
            Reservation r = new Reservation(this);
            return r;
        }
    }
}