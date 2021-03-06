package com.myapp.utils;

import static com.myapp.utils.AppUtils.convertIntToIntegerArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.myapp.model.Address;
import com.myapp.model.Student;
import com.myapp.model.ZipList;
import com.myapp.model.Employee;
import com.myapp.model.Product;
import com.myapp.model.ProductDto;

public class DataStaticFactory {

	public static List<Product> getAllProducts() {
		return Arrays.asList(new Product(1, "samsung", 22000f), new Product(2, "sony", 25000f),
				new Product(3, "nokia", 29000f), new Product(4, "motorola", 32000f), new Product(5, "LG", 12000f));
	}

	public static List<ProductDto> getAllProductDto() {
		return Arrays.asList(new ProductDto(1, "samsung", 22000f), new ProductDto(2, "sony", 25000f),
				new ProductDto(3, "nokia", 29000f), new ProductDto(4, "motorola", 32000f),
				new ProductDto(5, "LG", 12000f));
	}

	public static Map<Integer, Product> getAllProductsWithId() {
		Map<Integer, Product> aMap = new HashMap<>();
		aMap.put(1, new Product(1122, "TV", 22500f));
		aMap.put(2, new Product(2233, "FRIDGE", 45300f));
		aMap.put(3, new Product(2132, "WASHING MACHINE", 11500f));
		aMap.put(4, new Product(4544, "STABLIZER", 34123f));
		aMap.put(5, new Product(3213, "MIXTURE", 3345f));
		aMap.put(6, new Product(787, "LAPTOP", 22322f));
		aMap.put(7, new Product(4232, "MOBILE", 67676f));
		return aMap;
	}

	public static List<String> getAllFruits() {
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("pineapple");
		fruits.add("chiku");
		fruits.add("dragon fruit");
		return fruits;
	}

	public static List<Employee> getAllEmployees() {
		return Arrays.asList(
				new Employee(1, "Ram", "IT", new Address("Bhubaneswar", "Odissa", "India", 751003), 25000l),
				new Employee(2, "Sam", "Mechanical", new Address("Bombay", "Maharastra", "India", 571103), 55000l),
				new Employee(3, "John", "Electrical", new Address("Hydrabad", "Telengana", "India", 690013), 75000l),
				new Employee(4, "Hritik", "Computer", new Address("Bangalore", "Karnataka", "India", 560054), 253000l),
				new Employee(5, "Arindam", "Electronics", new Address("Puri", "Odissa", "India", 560059), 253000l));
	}

	public List<Integer> getAllZips() {
		List<Integer> zips = Arrays.asList(560054, 751003, 590034, 781906, 558933, 748943);
		return zips;
	}

	public List<List<Student>> getStudentList() {
		return null;
	}

	public List<Set<Student>> getStudentSet() {
		return null;
	}

	public static int[] getOnedimensionArrayInt() {
		int[] arr = { 1, 2, 3, 1, 3, 4, 5, 8, 1, 2, 3, 3, 5 };
		return arr;
	}

	public static Integer[] getOnedimensionArrayInteger() {
		int[] intArr = { 1, 2, 3, 1, 3, 4, 5, 8, 1, 2, 3, 3, 5 };
		Integer[] arr = convertIntToIntegerArray(intArr);
		return arr;
	}

	public static String[] getOnedimensionArrayString() {
		String[] arr = { "a", "b", "c", "a", "a", "c", "d", "e", "f", "f" };
		return arr;
	}

	public static String[][] getTwodimensionArrayString() {
		String[][] arr = { { "a", "b", "c" }, { "a", "b", "a" }, { "a", "c", "c" }, { "b", "b", "b" },
				{ "c", "b", "c" }, { "b", "b", "c" }, { "a", "b", "a" } };
		return arr;
	}

	public static int[][] getTwodimensionArrayInt() {
		int[][] arr = { { 1, 2, 3 }, { 1, 1, 1 }, { 3, 2, 2 }, { 2, 2, 2 }, { 3, 3, 3 }, { 2, 3, 1 }, { 3, 1, 1 } };

		// To boxed array
		// Integer[] what = Arrays.stream(data).boxed().toArray(Integer[]::new);
		// Integer[] ever = IntStream.of(data).boxed().toArray(Integer[]::new);

		return arr;
	}

	/*
	 * public static Integer[][] getTwodimensionArrayInteger() { int[][] arr = { {
	 * 1, 2, 3 }, { 1, 1, 1 }, { 3, 2, 2 }, { 2, 2, 2 }, { 3, 3, 3 }, { 2, 3, 1 }, {
	 * 3, 1, 1 } };
	 * 
	 * return null; }
	 */

}
