public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Author author1 = new Author("Бьёрн", "Страуструп");
        Author author2 = new Author("Брайан", "Керниган");
        Book book1 = new Book(author2,2010, "Язык программирования Си");
        Book book2 = new Book(author1,2007, "Язык программирования C++");
        System.out.println(book2.toString());
        System.out.println(book1.toString());
    }
}