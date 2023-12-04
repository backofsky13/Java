package author;
public class TestAuthor {
    public static void main(String[] args) {
        author.Author a1 = new author.Author("Ivan Popov", "ivPopov@mail.ru", 'M');
        author.Author a2 = new author.Author("Mila Iovich", "MilaIovich@mail.ru", 'F');
        author.Author a3 = new author.Author("Jhon Uik","JonhUik@mail.ru", 'M');
        System.out.println(a3);
    }
}