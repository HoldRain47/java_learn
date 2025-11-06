package b.oop.oop.practice;

public class Practice2 {
  public static class Dog {
    String name;
    String breed;
    public Dog(String name, String breed) {
      this.name = name;
      this.breed = breed;
    }
    public void sit(){
      System.out.printf("%s %s가 앉았습니다.\n", breed, name);
    }
    public void hand(){
      System.out.printf("%s %s가 손을 내밀었습니다.\n", breed, name);
    }
  }
  public static void main(String[] args) {
    Dog dog = new Dog("진돗개", "백구");
    dog.sit();
    dog.hand();
  }
}
