package course2.ch9.hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		List<String> p1Address = new ArrayList<>(List.of("konya", "two", "three"));
		List<String> p2Address = new ArrayList<>(List.of("istanbul", "two", "three"));
		List<String> p3Address = new ArrayList<>(List.of("ankara", "two", "three"));
		List<Integer> p1Phones = new ArrayList<>(List.of(1257683));
		List<Integer> p2Phones = new ArrayList<>(List.of(1236));
		List<Integer> p3Phones = new ArrayList<>(List.of(1235));

		Person person1 = new Person("eda", "tutas", p1Address, p1Phones);
		Person person2 = new Person("ayse ", "kar", p2Address, p2Phones);
		Person person3 = new Person("enes", "akkoca", p3Address, p3Phones);

		List<Person> personList = new ArrayList<>(List.of(person1, person2, person3));

		System.out.println("Person List");
		System.out.println(personList);
		System.out.println();
		System.out.println("SurName Siralama ");
		System.out.println();
		Comparator<Person> personLastName = (b1, b2) -> b1.getSurName().compareTo(b2.getSurName());
		Collections.sort(personList, personLastName);
		for (Person b : personList)
			System.out.println(b.getSurName());

		System.out.println();
		System.out.println("*************************");

		System.out.println("Key - Value ");
		System.out.println();
		Map<String, Person> map = new HashMap<>();
		map.put(person1.getName(), person1);
		map.put(person2.getName(), person2);
		map.put(person3.getName(), person3);

		map.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));
//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Bir isim giriniz...");
//
//		String name = scan.next();
//		System.out.println(name);

	}

}
