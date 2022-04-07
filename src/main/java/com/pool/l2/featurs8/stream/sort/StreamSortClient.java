package com.pool.l2.featurs8.stream.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortClient {
	public static void main(String[] args) {
		List<String> inputList = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
		List<String> naturalSortd= inputList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		List<String> naturalSortd1=inputList.stream().sorted((in1,in2)->in1.compareTo(in2)).collect(Collectors.toList());
		List<String> naturalSortd2=inputList.stream().sorted().collect(Collectors.toList());
		List<String> reverseOrder=inputList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		Game game2=new Game();
		game2.setUserName("Nithya").setUserLevel("2");
		Game game=new Game();
		game.setUserName("Shiva").setUserLevel("1");
		Game game3=new Game();
		game3.setUserName("Ravi").setUserLevel("3");
	}
}
