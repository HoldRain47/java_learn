package a.basic;

import java.util.Scanner;

public class Practice {
  public static void main(String[] args) {
    System.out.println("문제 1: 홀짝 판별");
    //    문제 1: 홀짝 판별
    int num = 17;
    if(num % 2 == 0)
      System.out.printf("%d은 짝수 입니다", num);
    else
      System.out.printf("%d은 홀수 입니다", num);

    System.out.println("문제 2: 학점 계산 ");
    Scanner sc = new Scanner(System.in);
    int score = sc.nextInt();
    if(score >= 90)
      System.out.println("A");
    else if(score >= 80)
      System.out.println("B");
    else if(score >= 70)
      System.out.println("C");
    else if(score >= 60)
      System.out.println("D");
    else
      System.out.println("F");

    System.out.println("문제 3: 윤년 판별 ");
    int year = 2024;
    if(year % 4 == 0 && year % 100 != 0)
      System.out.printf("%d은 윤년 입니다", year);
    else if (year % 400 == 0)
      System.out.printf("%d은 윤년 입니다", year);

    System.out.println("문제 4: 삼각형 유효성 검사 ");
    int a = 3, b = 4, c = 5;
    if(a > 0 & b > 0 & c > 0) {
      if (a + b > c && a + c > b && b + c > a) {
        System.out.println("삼각형을 만들 수 있습니다.");
      } else {
        System.out.println("삼각형을 만들 수 없습니다.");
      }
    } else {
      System.out.println("변의 길이는 모두 양수여야 합니다.");
    }

    System.out.println("문제 5: 계절 판별  ");
    int month = 7;
    String season;

    switch (month) {
      case 3:
      case 4:
      case 5:
        season = "봄";
        break;
      case 6:
      case 7:
      case 8:
        season = "여름";
        break;
      case 9:
      case 10:
      case 11:
        season = "가을";
        break;
      case 12:
      case 1:
      case 2:
        season = "겨울";
        break;
      default:
        season = "잘못된 월";
        break;
    }

    System.out.println(month + "월은 " + season + "입니다.");


    System.out.println("문제 6: 요일 판별 ");
    int day = 7;
    String week = "";

    switch (day) {
      case 1:
        season = "월요일은 평일 입니다";
        break;
      case 2:
        season = "화요일은 평일 입니다";
        break;
      case 3:
        season = "수요일은 평일 입니다";
        break;
      case 4:
        season = "목요일은 평일 입니다";
        break;
      case 5:
        season = "금요일은 평일 입니다";
        break;
      case 6:
        season = "토용일은 주말 입니다";
        break;
      case 7:
        season = "일요일은 주말 입니다";
        break;
      default:
        season = "잘못된 날";
        break;
    }
    System.out.printf("%s 입니다.", week);


    System.out.println("문제 7: BMI 계산 및 판정");
    double height = 175.0;  // cm
    double weight = 70.0;   // kg
    double bmi = 0;
    bmi = height/(weight*2);
    String result_p1 ="";

    if(bmi < 18.5) result_p1= "저체중 입니다";
    else if (18.5 <= bmi || bmi > 23) result_p1= "정상 체중입니다";
    else if (23 <= bmi || bmi > 25) result_p1= "과체중 체중입니다";
    else result_p1= "비만";
    System.out.println(result_p1);

    System.out.println("문제 8: 최댓값 구하기");
    int a8 = 10, b8 = 25, c8 = 17;
    int max;
    if (a8 > b8) max = a8;
    else max = b8;
    if (c8 > max) max = c8;
    System.out.printf("최댓값: " + max);

    System.out.println("");

    int math = 70, english = 80, science = 45;
    int subjectsSum = math + english + science;

    if (subjectsSum / 3 >= 60 && math >= 40 && english >= 40 && science >= 40)
      System.out.println("합격");
    else
      System.out.println("불합격");

    double price = 120000;
    boolean isMember = true;
    if(price >= 100000) price/=0.9;
    else if (price >= 50000) price/=0.95;
    if(isMember)price/=0.95;
    System.out.println(price);
  }


}