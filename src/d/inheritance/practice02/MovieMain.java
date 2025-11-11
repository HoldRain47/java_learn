package d.inheritance.practice02;


public class MovieMain {

}
class Movie{
  String title;
  double rating;
  public Movie(String title, double rating){
    this.title = title;
    this.rating = rating;
  }

  @Override
  public String toString() {
    return "Movie{" +
        "title='" + title + '\'' +
        ", rating=" + rating +
        '}';
  }
  public void displayInfo(){
    System.out.println(this);

  }
}
class ActionMovie extends Movie {
  String specialEffects;
  public ActionMovie(String title, double rating, String specialEffects) {
    super(title, rating);
    this.specialEffects = specialEffects;

  }

  @Override
  public String toString() {
    return "[액션] " + title +
        "(평점" + rating + ") - " +
        "특수효과: " + specialEffects;
  }
}

class Comedy extends Movie {
  String humorStyle;
  public Comedy(String title, double rating, String humorStyle) {
    super(title, rating);
    this.humorStyle = humorStyle;

  }

  @Override
  public String toString() {
    return "[코메디] "+ title +
        "(평점: " + rating +") - "+
        "유머: " + humorStyle;
  }
}
class Drama extends Movie{
  String theme;

  @Override
  public String toString() {
    return "[드라마] " + title +
        "(평점:" + rating + ") - "+
        "주제: " + theme;
  }

  public Drama(String title, double rating, String theme) {
    super(title, rating);
    this.theme = theme;

  }
}


class MovieShow{
  public static void main(String[] args) {
    Movie[] movies = {
        new ActionMovie("어벤져스", 4.5, "최고급 CG"),
        new Comedy("극한직업", 4.7, "상황 코미디"),
        new Drama("기생충", 4.9, "계급 갈등")
    };

    for (Movie movie : movies) {
      movie.displayInfo();
    }
  }
}