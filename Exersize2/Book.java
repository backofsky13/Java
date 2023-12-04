import java.lang.*;
public class Book {
    private String name;
    private int page;
    public Book(String n, int p) {
        name = n;
        page = p;
    }
    public Book(String n){
        name = n;
        page = 0;
    }
    public Book(){
        name = "GoodForBrain";
        page = 0;
    }
    public void setPage(int page){
        this.page = page;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getPage(){
        return page;
    }
    public String toString(){
        return this.name+", page " + this.page;
    }
    public void intoPageInBook(){
        System.out.println(name+"'s page in book is "+page);
    }
}