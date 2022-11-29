
    public class Book {
        private String bookTitle;
        private int yearOfPublishing;
        private Author Author;

        public Book(Author authorName, int yearOfPublishing, String bookTitle) {
            this.Author = authorName;
            this.yearOfPublishing = yearOfPublishing;
            this.bookTitle = bookTitle;
        }

        public String getBookTitle() {
            return this.bookTitle;
        }

        public int getYearOfPublishing() {
            return this.yearOfPublishing;
        }

        public void setYearOfPublishing(int yearOfPublishing) throws IllegalAccessException {

//            if (yearOfPublishing < 1950 || yearOfPublishing > 2050) {
//                throw new IllegalAccessException("Invalid publishing year parameter: " + yearOfPublishing);
//            }
            this.yearOfPublishing = yearOfPublishing;
        }

        public String getAuthor(){
            return this.Author.toString();
        }

        public String toString()
        {
            return "Название книги: " + this.bookTitle + ", автор: " +  this.Author.toString() + ", год издания: " +this.yearOfPublishing;
        }
        @Override
        public boolean equals(Object other) {
            if (this.getClass() != other.getClass() ) {
                return false;
            }
            if (this.yearOfPublishing != ((Book) other).yearOfPublishing)
                return false;
            Book book2 = (Book) other;
            return (Author.equals(book2.Author) && bookTitle.equals(book2.bookTitle));
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(bookTitle, yearOfPublishing, Author);
        }
    }
