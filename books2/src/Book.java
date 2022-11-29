
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

            if (yearOfPublishing < 1950 || yearOfPublishing > 2050) {
                throw new IllegalAccessException("Invalid publishing year parameter: " + yearOfPublishing);
            }
            this.yearOfPublishing = yearOfPublishing;
        }

        public String getAuthor(){
            return this.Author.toString();
        }

        public String toString()
        {
            return "Название книги: " + this.bookTitle + ", автор: " +  this.getAuthor() + ", год издания: " +this.yearOfPublishing;
        }

    }
