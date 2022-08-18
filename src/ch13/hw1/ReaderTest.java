package ch13.hw1;



public class ReaderTest {
public static void main(String[] args) {

			
			Author author1 = new Author("J.R.R.Tolkien");

			Book book1 = new Book(author1, "The Return of the King", 418, BookType.FANTASY, false, 150);
			book1.author = author1;

			Reader reader1 = new Reader("Eda", 24, 'W');

			reader1.book = book1;

			System.out.println("Name: " + reader1.name + "\nAge: " + reader1.age + "\nSex: " + reader1.sex );
			
			System.out.println("\n****************************************************************************************** ");
			
			System.out.println("\nBook : " + book1.title + "\nBook's Author : " + author1.name +  "\nHard Cover : " + book1.isHardCover + "\nType : " + reader1.book.bookType + "\nPage : " + reader1.book.page +"\nCurrent Page : " + reader1.book.currentPage);
			

		}

}
