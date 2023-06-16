public class Book {
    private String title;
    private int releaseYear;
    private int pages;

    public Book() {

    }

    public Book(String title, int releaseYear, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
}


