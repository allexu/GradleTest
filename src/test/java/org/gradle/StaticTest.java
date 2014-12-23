package org.gradle;

import static org.junit.Assert.assertEquals;

public class StaticTest {
	public static void main (String [] args) {
		Person person = new Person("Larry");
		System.out.println("Larry" +  person.getName());
        assertEquals("Larry", person.getName());
	}
}
