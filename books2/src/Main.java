public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Author author1 = new Author("Бьёрн", "Страуструп");
        Author author2 = new Author("Брайан", "Керниган");
        Author author3 = new Author("Бьёрн", "Страуструп");
        Book book1 = new Book(author2,2010, "Язык программирования Си");
        Book book2 = new Book(author1,2007, "Язык программирования C++");
        Book book3 = new Book(author1,2007, "Язык программирования C++");
        System.out.println(book2.toString());
        System.out.println(book1.toString());
        System.out.println(author1.equals(author3)== true ? "objects are equals" : "objects are different");
        System.out.println(author1.equals(author2)== true ? "objects are equals" : "objects are different");
        System.out.println(book1.equals(book2)== true ? "objects are equals" : "objects are different");
        System.out.println(book3.equals(book2) == true ? "objects are equals" : "objects are different");
        System.out.println(author1.hashCode() == author3.hashCode() ? "objects are equals" : "objects are different");
        System.out.println(author1.hashCode() == author2.hashCode() ? "objects are equals" : "objects are different");
        System.out.println(book1.hashCode() == book2.hashCode() ? "objects are equals" : "objects are different");
        System.out.println(book3.hashCode() == book2.hashCode() ? "objects are equals" : "objects are different");

    }
}