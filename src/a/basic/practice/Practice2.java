package a.basic.practice;

public class Practice2 {
  public static void main(String[] args) {
    System.out.println("");

    System.out.println("-----------");

    System.out.println("문제 1: 구구단");

    for(int i = 2; i <10;i++){
      for(int y =1; y<10; y++) {
        int x = i*y;
        System.out.printf("%d x %d = %d\n", i,y,x);
        }
      }
    System.out.println("-----------");


    System.out.println("문제 2: 별 찍기 패턴 1");
    String star = "";
    for(int i = 0; i <5; i++){
      star += "*";
      System.out.println(star);
    }
    System.out.println("-----------");

    String star2 = "";
    System.out.println("문제 3: 별 찍기 패턴 2");
    for(int i = 0; i <5; i++){
      star2 = star.substring(i);
      System.out.println(star2);
    }
    System.out.println("-----------");

    StringBuilder star3 = new StringBuilder("*");
    String blank = "     ";
    for(int i = 0; i <5; i++){
      System.out.println(blank + star3.toString());
      blank = blank.substring(1);
      star3.append("**");
    }

    System.out.println("문제 5: 약수 구하기");
    int[] arr1 = new int[8];
    int arrIndex = 0;
    for (int i = 1; i < 25; i++){
      if(24 % i == 0){
        arr1[arrIndex] = i;
        arrIndex++;
      }
    }
    for (int num : arr1){
      System.out.println(num);
    }

    System.out.println("-----------");

    System.out.println("문제 6: 소수 판별");


    int num6 = 0;
    int num6Sum = 0;
    for (int i = 1; i < 18; i++){
      if(17 % i == 0){
        num6Sum++;
      }
    }
    if(num6Sum == 2)System.out.println("17은 소수입니다");
    else System.out.println("17은 소수가 아닙니다");
    System.out.println("-----------");

    System.out.println("문제 7: 소수 판별 최적화");

    System.out.println("-----------");

    System.out.println("문제 8: 최대공약수 (GCD)");

    System.out.println("-----------");


    System.out.println("문제 9: 최소공배수 (LCM)");

    System.out.println("-----------");

    System.out.println("문제 10: 피보나치 수열");
    int n10 = 20;
    int[] arr10 = new int[n10];
    arr10[0] = 0;
    arr10[1] = 1;
    for (int i = 2; i < arr10.length; i++) {
      arr10[i] = (arr10[i - 1] + arr10[i - 2]);
    }
    System.out.println(arr10[9]);

    System.out.println("-----------");

    System.out.println("문제 11: 팩토리얼");
    int n11 = 5;
    int num11 = 1;

    for (int i = 1; i < n11+1; i++){
      num11 *= i;
    }
    System.out.println(num11);
    System.out.println("-----------");

    System.out.println("문제 12: 역순 숫자 출력");
    int num12 = 12345;
    int sum12 = 0;
    while (num12 > 0){
      System.out.print(num12%10);
      num12/=10;
    }
    System.out.println("-----------");



    System.out.println("문제 13: 숫자 자릿수 합");

    int num13 = 12345;
    int sum13 = 0;
    while (num13 > 0){
      sum13 += num13 %10;
      num13 /=10;
    }

    System.out.println(sum13);
    System.out.println("-----------");


    System.out.println("문제 14: 구구단 특정 단 건너뛰기");

    for(int i = 2; i <10;i++){
      if(i==5) continue;
      for(int y =1; y<10; y++) {
        int x = i*y;
        System.out.printf("%d x %d = %d\n", i,y,x);
      }
    }
    System.out.println("-----------");


  }
}
