package _16_Interface;

//class X interface
public interface Animal {
    //필드가 존재하지 않음(heap 메모리가 없다 = 객체가 존재하지 않는다)
    //(ex) new animal
    //static(상수)는 선언 가능
    //밑의 문장엔 public static final가 생략되어 있음

    String name = "포유류";

    //모든 메서드는 public abstract 자동 취급. 시그니처만!
    void sound();
    void move();



}
