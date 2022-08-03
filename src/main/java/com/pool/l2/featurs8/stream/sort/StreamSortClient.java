package com.pool.l2.featurs8.stream.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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
		List<Game> games=new ArrayList<>();
		games.add(game2);
		games.add(game);
		games.add(game3);
		List<Game> sortedGames = games.stream().sorted(new GameComparator()).collect(Collectors.toList());
		System.out.println(sortedGames);
		Map<String, List<String>> grouping = games.stream().collect(Collectors.groupingBy(Game::getUserLevel, Collectors.mapping(Game::getUserName, Collectors.toList())));
		System.out.println(grouping);
		List<String> collect = games.stream().map(Game::getUserLevel).distinct().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(collect);
	}
}
