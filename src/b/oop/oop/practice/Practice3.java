package b.oop.oop.practice;

public class Practice3 {
  public static class Car {
    String model;
    private int speed;
    public Car(String model, int speed) {
      this.model = model;
      this.speed = speed;
    }

    public void accelerate(){
      if(speed+10 <= 100)this.speed +=10;
    }
    public void brake(){
      if(speed-10 > 0)this.speed -=10;
    }


    public void printInfo(){
      System.out.printf("모델:%s, 속력:%s", model, speed);
    }
  }
  public static void main(String[] args) {
    Car car = new Car("Avante", 0);
    car.accelerate();  // 속도 10
    car.accelerate();  // 속도 20
    car.accelerate();  // 속도 30
    car.brake();       // 속도 20
    car.printInfo();   // 모델: Avante, 속도: 20km/h
  }

}
