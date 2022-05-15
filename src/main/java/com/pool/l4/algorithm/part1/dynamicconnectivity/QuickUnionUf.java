package com.pool.l4.algorithm.part1.dynamicconnectivity;

public class QuickUnionUf {
	int id[] = null;

	public QuickUnionUf(int N) {
		id = new int[N];
		id[0] = 0;
		id[1] = 1;
		id[2] = 9;
		id[3] = 4;
		id[4] = 9;
		id[5] = 6;
		id[6] = 6;
		id[7] = 7;
		id[8] = 8;
		id[9] = 9;

	}

	public int root(int i) {
		while (i != id[i]) {
			i = id[i];
		}

		return i;
	}

	public boolean isConnected(int p, int q) {
		return root(p) == root(q);
	}

	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}

	public static void main(String[] args) {
		QuickUnionUf quickUnionUf = new QuickUnionUf(10);
		quickUnionUf.union(2, 9);
		for (int i = 0; i < quickUnionUf.id.length; i++) {
			System.out.println(quickUnionUf.id[i]);
		}
		System.out.println(quickUnionUf.isConnected(2, 9));
	}
}
