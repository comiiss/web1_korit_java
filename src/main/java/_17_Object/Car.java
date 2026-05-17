package _17_Object;

import java.util.Objects;

public class Car {
    private String model;
    private String color;
    private int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    //객체용 지문 번호 생성

    @Override
    public int hashCode() {
        return Objects.hash(model, color, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';


    }

    //필드만 선언했는데, 작성되어져야 하는 코드
    // - 보일러플레이트 코드
    //라이브러리를 통해 해결!(lombok)
}
