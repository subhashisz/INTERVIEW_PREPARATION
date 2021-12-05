package com.myapp.streams;

import static com.myapp.utils.DataStaticFactory.getAllEmployees;
import static com.myapp.utils.DataStaticFactory.getAllFruits;
import static com.myapp.utils.DataStaticFactory.getAllProducts;
import static com.myapp.utils.DataStaticFactory.getAllProductsWithId;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.myapp.model.Employee;
import com.myapp.model.ProductDto;

public class StreamPracticesTwo {
	public static void main(String[] args) {

		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<String> stringList = Arrays.asList("a", "b", "c", "d", "e");

		// Fruits STREAM
		List<String> sortedFruitAsc1 = getAllFruits().stream().sorted((o1, o2) -> o1.compareTo(o2))
				.collect(Collectors.toList());
		List<String> sortedFruitAsc2 = getAllFruits().stream().sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());
		List<String> sortedFruitAsc3 = getAllFruits().stream().sorted().collect(Collectors.toList());
		List<String> sortedFruitDesc = getAllFruits().stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		List<String> sortedFruitDesc1 = getAllFruits().stream().map(String::toUpperCase).collect(Collectors.toList());

		// Employee STREAM
		List<Employee> sortedEmplyeeByNameAsc = getAllEmployees().stream()
				.sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
		List<Employee> sortedEmplyeeBySalaryAsc = getAllEmployees().stream()
				.sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
		List<Employee> sortedEmplyeeBySalaryDesc = getAllEmployees().stream()
				.sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());

		// Employee MAP
		List<String> employeeNameUpperCase = getAllEmployees().stream().map((o) -> o.getName().toUpperCase())
				.collect(Collectors.toList());

		List<Integer> squareList = integerList.stream().map(i -> i * 2).collect(Collectors.toList());
		List<Integer> squareList1 = integerList.stream().map(Integer::intValue).collect(Collectors.toList());

		List<String> stringList1 = stringList.stream().map(String::toUpperCase).collect(Collectors.toList());

		// Product MAP

		List<ProductDto> productDto = getAllProducts().stream()
				.map(o -> new ProductDto(o.getId(), o.getName(), o.getPrice())).collect(Collectors.toList());

		Long count = numberList.stream().count();
		Integer integerMax = numberList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		Integer integerMin = numberList.stream().min(Comparator.comparing(Integer::valueOf)).get();

		getAllFruits().forEach((o) -> {
			// System.out.println(o);
		});

		getAllProductsWithId().forEach((K, V) -> {
			System.out.println("ID: " + V.getId() + " Type: " + V.getName() + " Price: " + V.getPrice());
		});

	}

}
