package course2.ch9.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Person implements Comparable {
	private final String name;
	private final String surName;
	private List<String> address;
	private List<Integer> phones;

	public Person(String name, String surName, List<String> address, List<Integer> phones) {
		this.name = name;
		this.surName = surName;
		this.address = address;
		this.phones = phones;

	}

	public String getName() {
		return name;
	}

	public String getSurName() {
		return surName;
	}

	public void setAddress(ArrayList<String> address) {
		this.address = address;
	}

	public List<String> getAddress() {
		return address;
	}

	public List<Integer> getPhones() {
		return phones;
	}

	public void setPhones(ArrayList<Integer> phones) {
		this.phones = phones;
	}

	public int compareTo(Object o) {
		Person person = (Person) o;
		return surName.compareTo(person.getSurName());
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surName=" + surName + ", address=" + address + ", phones=" + phones + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, name, phones, surName);
	}

}
