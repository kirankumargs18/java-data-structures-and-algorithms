package com.kirangs.java8.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableVsComparator {

	private static <T> void printList(List<T> list) {

		for (T t : list) {
			System.out.println(t);
		}
	}

	public static void main(String[] args) {

		List<Movie> list = new ArrayList<>();
		list.add(new Movie(8.3, "Force Awakens", 2015));
		list.add(new Movie(8.7, "Star Wars", 1977));
		list.add(new Movie(8.8, "Empire Strikes Back", 1980));
		list.add(new Movie(8.4, "Return of the Jedi", 1983));

		printList(list);

		System.out.println("After Sorting");

//		Collections.sort(list); // sorting field depends on compareTo method implementation comparable interface

//		// sorting using comparator (rating)
//		RatingCompare ratingCompare = new RatingCompare();
//		Collections.sort(list, ratingCompare);

//		// sorting using comparator (name)
//		NameCompare nameCompare = new NameCompare();
//		Collections.sort(list, nameCompare);

		// sorting using comparator (name)
		// Method1
//		YearCompare yearCompare = new YearCompare();
//		Collections.sort(list, yearCompare);

		// Method2
//		Comparator<Movie> MovieComparatorByYear = new Comparator<Movie>() {
//			@Override
//			public int compare(Movie movie1, Movie movie2) {
//				return movie1.getYear() - movie2.getYear();
//			}
//		};
//		Collections.sort(list, MovieComparatorByYear);

		// Method3
//		Collections.sort(list, (o1, o2) -> {
//			return o2.getYear() - o1.getYear();
//		});
		Collections.sort(list, (o1, o2) -> o1.getYear() - o2.getYear());
		printList(list);

	}

}

class YearCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {

		return o2.getYear() - o1.getYear();
	}

}

class NameCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class RatingCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {

		if (o1.getRating() > o2.getRating()) {
			return 1;
		} else if (o1.getRating() < o2.getRating()) {
			return -1;
		} else {
			return 0;
		}
	}
}
