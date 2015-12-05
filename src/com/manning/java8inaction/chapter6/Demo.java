package com.manning.java8inaction.chapter6;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		//2.34+2.3008
		BigDecimal bg= new BigDecimal(String.valueOf(2.34))
		.add(new BigDecimal(String.valueOf(2.3008)));
		System.out.println(bg);
		List<String> names = Arrays.asList("Kiran", "Bharat", "Vimal", null, null, "Ram");
		int count = 0;
		for (String name : names) {
			if (name != null) {
				count = count + name.length();
			}
		}
		System.out.println(count);

		count = names.parallelStream()
					 .filter(name -> name != null)
					 .map(String::length)
					 .reduce(0, (a, b) -> a + b);

		System.out.println(count);

	}
}
