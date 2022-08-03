package com.pool.l2.featurs8.stream.sort;

import java.util.Comparator;

public class GameComparator implements Comparator<Game> {
	@Override
	public int compare(Game o1, Game o2) {
		return o1.getUserName().compareTo(o2.getUserName());
	}
}
