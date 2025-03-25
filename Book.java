import java.io.InputStream;

public class Book {
    private String title;
    private int pageCount;

    public Book(String title, int pageCount){
        this.pageCount = pageCount;
        this.title = title;
    }

    public void setTitle(String title) {
        if (title == null){
            throw new IllegalArgumentException("Title can not be empty!");
        }
        this.title = title;
    }

    public void setPageCount(int pageCount) {
        if (pageCount < 0){
            throw new IllegalArgumentException("pageCount must be positive.");
        }
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        System.out.println(title + "(" + pageCount + ")");
        return "";
    }
}
