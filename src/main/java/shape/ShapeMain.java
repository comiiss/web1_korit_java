package shape;

public class ShapeMain {
    public static void printArea(Shape s) {
        double area = s.getArea(); //오버라이딩된 메서드 호출
        //Shape을 상속 받고 오버라이딩만 하면
        //여러 가지 도형을 추가하더라도, 코드 변경하지 않아도 된다
        System.out.println("면적: " + area);
    }
    public static void main(String[] args) {
        //Square - width, height, getArea() 오버라이딩
        //Triangle - width, height, getArea() 오버리이딩
        //클래스를 작성해 주세요
        //main에서 실제 객체를 생성해 주세요

        Shape s1 = new Square(10, 10);
        Shape s2 = new Triangle(10, 10);


    }
}
