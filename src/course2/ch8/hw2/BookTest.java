package course2.ch8.hw2;

import java.util.function.BinaryOperator;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book("The Cat in the Hat", "Dr", "Seuss", 450);
		Book book2 = new Book("Harry Potter and The Sorcerers Stone", "JK", "Rowling", 411);
		BinaryOperator<Integer> op = BinaryOperator.maxBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));

		System.out.println(op.apply(book1.getPages(), book2.getPages()));
	}
}
