package com.pool.l3.generics.book.daimond;

import com.pool.l3.generics.book.GenericMemoryCell;

public class BoxingSimulator {
	public static void main(String[] args) {
		GenericMemoryCell<Integer> memoryCell = new GenericMemoryCell<>();
		memoryCell.write(408);
		System.out.println(memoryCell.read());
	}
}
