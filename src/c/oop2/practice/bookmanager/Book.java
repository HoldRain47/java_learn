package c.oop2.practice.bookmanager;

public class Book {
  // TODO: 필드 선언
  // - title (String): 제목
  private String title;
  // - author (String): 저자
  private String author;
  // - price (int): 가격
  private int price;
  // - isbn (String): ISBN
  private String isbn;
  // TODO: 생성자 오버로딩 (this()를 사용하여 연결)
  // 1. Book(String title, String author)
  //    - 가격은 0, ISBN은 null로 초기화
  private boolean detailed=false;
  public Book(String title, String author){
    this.title=title;
    this.author=author;
    this.price = 0 ;
    this.isbn = null;
  }

  // 2. Book(String title, String author, int price)
  //    - ISBN은 null로 초기화
  public Book(String title, String author, int price) {
    this.title = title;
    this.author = author;
    this.price = price;
    this.isbn = null;
  }
  // 3. Book(String title, String author, int price, String isbn)
  //    - 모든 필드 초기화
  public Book(String title, String author, int price, String isbn) {
    this.title = title;
    this.author = author;
    this.price = price;
    this.isbn = isbn;
    this.detailed = true;
  }
  // TODO: displayInfo() 메서드
  // 출력 형식: "제목 - 저자: 저자명, 가격: 0000원"
  public void displayInfo(){
    System.out.print("제목: "+this.title);
    System.out.print("저자: "+this.author);
    System.out.println("가격: "+this.price);
    displayInfo(detailed);
  }
  // TODO: displayInfo(boolean detailed) 메서드 오버로딩
  // detailed가 true이고 isbn이 null이 아니면 ISBN도 출력
  // 위의 displayInfo()에서 이 메서드를 호출하도록 구현
  public void displayInfo(boolean detailed){
    if(detailed){
      System.out.println("ISBN: "+this.isbn);
    }
  }
  // TODO: applyDiscount(int percent) 메서드
  // percent% 할인 적용 (예: 10 입력 시 10% 할인)
  public int applyDiscount(int percent){
    return price -(price * percent/100);
  }
  // TODO: applyDiscount(int amount, boolean isPercent) 메서드 오버로딩
  // isPercent가 true면 퍼센트 할인, false면 정액 할인
  public int applyDiscount(int amount, boolean isPercent){
    if(!isPercent) return price - amount;
    return applyDiscount(amount);
  }
  // TODO: getTitle() 메서드
  // 제목 반환
  public String getTitle(){
    return this.title;
  }
  // TODO: getAuthor() 메서드
  // 저자 반환
  public String getAuthor(){
    return this.author;
  }
  // TODO: getPrice() 메서드
  // 가격 반환
  public int getPrice(){
    return this.price;
  }
  public int setPrice(int price){
    return this.price =price;
  }
}
