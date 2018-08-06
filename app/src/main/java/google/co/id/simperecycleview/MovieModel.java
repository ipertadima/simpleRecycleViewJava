package google.co.id.simperecycleview;

public class MovieModel {
    private String title;
    private String genre;
    private String year;

    public MovieModel() {

    }

    public MovieModel(String title, String genre, String year) {
        this.title = title;
        this.setGenre(genre);
        this.setYear(year);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
