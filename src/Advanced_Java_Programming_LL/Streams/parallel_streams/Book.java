package Advanced_Java_Programming_LL.Streams.parallel_streams;

public class Book {
    private String author, title;
    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    @Override
    public String toString(){
        return ("Author: "+author+" Title: "+title);
    }
}
