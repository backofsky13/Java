public class TestBook{
    public static void main(String[] args) {
        Book b1 = new Book("RoadToTheDream", 98);
        Book b2 = new Book("Realist", 113);
        Book b3 = new Book("GoodForBrain");
        b3.setPage(137);
        System.out.println(b2);
        b1.intoPageInBook();
        b2.intoPageInBook();
        b3.intoPageInBook();


    }
}