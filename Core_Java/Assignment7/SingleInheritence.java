package Assignment7;

public class SingleInheritence {
    // Single Inheritance Example
    class Book {
        String title;
        int publicationYear;

        Book(String title, int publicationYear) {
            this.title = title;
            this.publicationYear = publicationYear;
        }

        void displayInfo() {
            System.out.println("Book: " + title + " (" + publicationYear + ")");
        }
    }

    class Author extends Book {
        String authorName;
        String bio;

        Author(String title, int year, String authorName, String bio) {
            super(title, year);
            this.authorName = authorName;
            this.bio = bio;
        }

        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("Author: " + authorName + " - " + bio);
        }
    }

    public class SingleInheritanceDemo {
        public static void main(String[] args) {
            Author a = new Author("Java Basics", 2023, "John Doe", "Tech Writer");
            a.displayInfo();
        }
    }

}
