package a.basic.practice;

import java.util.Arrays;

public class Practice3 {
  public static void main(String[] args) {
    System.out.println("");
    System.out.println("---------------------");


    System.out.println("문제 1: 배열 최댓값/최솟값");
    int[] numbers = {45, 23, 78, 12, 89, 34};
    Arrays.sort(numbers);
    System.out.printf("최대값: %d\n",numbers[numbers.length-1]);
    System.out.printf("최솟값: %d",numbers[0]);
    System.out.println("---------------------");

    System.out.println("문제 2: 배열 뒤집기");
    int[] arr2_1 = {1, 2, 3, 4, 5};
    int[] arr2_2 = new int[5];
    for(int i = arr2_1.length-1, j=0; i >= 0; i--){
      arr2_2[j] = arr2_1[i];
      j++;
    }
    System.out.println("원본 배열: " + Arrays.toString(arr2_1));
    System.out.println("뒤집기 배열: " + Arrays.toString(arr2_2));
    System.out.println("---------------------");


    System.out.println("문제 3: 특정 값 찾기");
    int[] arr3 = {10, 20, 30, 40, 50};
    int target3 = 30;
    int flag3 = -1;

    for(int i = 1; i < arr3.length; i++ ){
      if(arr3[i] == target3){
        flag3 = i;
      }
    }
    System.out.printf("30의 인덱스: %d 개\n",flag3);
    System.out.println("---------------------");


    System.out.println("문제 4: 배열 요소 개수 세기");
    int[] arr4 = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
    int[] arr4count = {0,0,0,0};
    for(int i = 0; i < arr4.length; i++){
      if(arr4[i] == 1){
        arr4count[0] +=1;
      }
      else if(arr4[i] == 2){
        arr4count[1] +=1;
      }
      else if(arr4[i] == 3){
        arr4count[2] +=1;
      }
      else if(arr4[i] == 4){
        arr4count[3] +=1;
      }
    }
    for(int i = 0; i < arr4count.length; i++){
      System.out.printf("%d: %d\n",i,arr4count[i]);
    }

    System.out.println("---------------------");
    System.out.println("문제 5: 2차원 배열 합계");
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    int count5 = 0;
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[i].length; j++){
        count5 += matrix[i][j];
      }
    }
    System.out.println(count5);

    System.out.println("---------------------");
    System.out.println("문제 6: 배열에서 두 번째로 큰 수");
    int[] arr6 = {45, 23, 78, 12, 89, 34};
    Arrays.sort(arr6);
    System.out.println(arr6[arr6.length-2]);
    System.out.println("---------------------");
  }
}
