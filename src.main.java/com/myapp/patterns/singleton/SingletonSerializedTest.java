package com.myapp.patterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonSerializedTest {
	public static void main(String[] args) {
		// create an SingletonSerialized object
		SingletonSerialized singletonSerialized = SingletonSerialized.getInstance();

		// creating output stream variables
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		// creating input stream variables
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		// creating SingletonSerialized object reference
		// to hold values after de-serialization
		SingletonSerialized deSerializeCustomer = null;

		try {
			// for writing or saving binary data
			fos = new FileOutputStream("Customer.ser");

			// converting java-object to binary-format
			oos = new ObjectOutputStream(fos);

			// writing or saving SingletonSerialized object's value to stream
			oos.writeObject(singletonSerialized);
			oos.flush();
			oos.close();

			System.out.println("Serialization: " + "Customer object saved to Customer.ser file\n");

			// reading binary data
			fis = new FileInputStream("Customer.ser");

			// converting binary-data to java-object
			ois = new ObjectInputStream(fis);

			// reading object's value and casting to Customer class
			deSerializeCustomer = (SingletonSerialized) ois.readObject();
			ois.close();

			System.out.println("De-Serialization: Customer object " + "de-serialized from Customer.ser file\n");
		} catch (IOException | ClassNotFoundException fnfex) {
			fnfex.printStackTrace();
		}

		// printing hash code of serialize SingletonSerialized object
		System.out.println("Hash code of the serialized " + "Customer object is " + singletonSerialized.hashCode());

		// printing hash code of de-serialize SingletonSerialized object
		System.out.println("\nHash code of the de-serialized " + "Customer object is " + deSerializeCustomer.hashCode());
	}
}