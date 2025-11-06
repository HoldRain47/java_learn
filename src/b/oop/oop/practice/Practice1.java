package b.oop.oop.practice;

public class Practice1 {
  public static class Person {
    String name;
    int age;
    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
    public void printInfo(){
      System.out.printf("이름:%s, 나이:%s세", name, age);
    }
  }
  public static void main(String[] args) {
    Person person = new Person("홍길동", 25);
    person.printInfo();
  }
}
