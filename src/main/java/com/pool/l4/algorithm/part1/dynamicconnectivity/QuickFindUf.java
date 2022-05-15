package com.pool.l4.algorithm.part1.dynamicconnectivity;

public class QuickFindUf {
	private int[] id;

	public QuickFindUf(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}

	public boolean isConnected(int p, int q) {
		return id[p] == id[q];
	}

	public void union(int p, int q) {
		int pId = id[p];
		int qId = id[q];
		for (int i = 0; i < id.length; i++) {
			if (id[i] == pId) {
				id[i] = qId;
			}
		}
	}

	public static void main(String[] args) {
		QuickFindUf quickFindUf = new QuickFindUf(10);
		quickFindUf.union(3, 4);
		quickFindUf.union(4, 8);
		quickFindUf.union(9, 4);
		quickFindUf.union(2, 1);
		quickFindUf.union(8, 9);
		for (int i = 0; i < quickFindUf.id.length; i++) {
			System.out.println(i + "=" + quickFindUf.id[i]);

		}
	}
}
