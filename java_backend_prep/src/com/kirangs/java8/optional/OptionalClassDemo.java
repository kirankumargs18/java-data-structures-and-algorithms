package com.kirangs.java8.optional;

import java.util.Optional;

//Optional is single value container, value can be null or non null
//Optional introduced to avoid null checks and null pointer exception
//Optional also supports filter and map operations
public class OptionalClassDemo {

	public static void main(String[] args) throws Exception {

//		Optional<Object> optional = Optional.empty();
//		System.out.println(optional);
//
//		String email = "kiran@gmail.com";
//		Optional<String> emailOptional = Optional.of(email); // not recommended to use, throws null pointer exception if
//																// value is null
//		System.out.println(emailOptional);
//
//		Optional<String> optional2 = Optional.ofNullable(email);
//		System.out.println(optional2);

//		System.out.println(optional2.get()); // throws no such element exception

		// to avoid no such element exception
//		if (optional2.isPresent()) {
//			System.out.println(optional2.get());
//		} else {
//			System.out.println("No value present");
//		}

		String email = "kiran@gmail.com";
		Optional<String> emailOptional = Optional.ofNullable(null);
		String defaultEmail = emailOptional.orElse("deafult@gmail.com");
		System.out.println(defaultEmail);

		String emailDefault = emailOptional.orElseGet(() -> "default@gmail.com");

		System.out.println(emailDefault);

		emailOptional.orElseThrow(() -> new Exception("Element not found"));

	}

}
