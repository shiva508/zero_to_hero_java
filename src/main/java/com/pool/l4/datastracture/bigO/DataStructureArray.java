package com.pool.l4.datastracture.bigO;

public class DataStructureArray {
	public static void main(String[] args) {
		String[] dataStructure = new String[100];
		insertDataInto(dataStructure, "A");
		insertDataInto(dataStructure, "B");
		insertDataIntoIndex(dataStructure, "C", 0);
		showDataStucture(dataStructure);

	}

	private static void showDataStucture(String[] dataStructure) {
		for (int i = 0; i < dataStructure.length; i++) {
			System.out.println(dataStructure[i]);
		}
	}

	private static void insertDataIntoIndex(String[] dataStructure, String inputData, int index) {
		for (int i = index; i < dataStructure.length - 1; i++) {
			String newValue = "";
			String oldValue = dataStructure[i];
			if (i == index) {
				newValue = inputData;
			} else {
				newValue = dataStructure[i - 1];
			}
			System.out.println("newValue:" + newValue);
			System.out.println("oldValue:" + oldValue);
			dataStructure[i] = newValue;
			dataStructure[i + 1] = oldValue;

		}

//
//		for (int i = index; i < dataStructure.length; i++) {
//			if (i == index) {
//				if (dataStructure[i] == null) {
//					dataStructure[i] = inputData;
//				} else {
//					String oldValue = dataStructure[i];
//					dataStructure[i] = inputData;
//					dataStructure[i + 1] = oldValue;
//				}
//			} else if (i > index) {
//				String oldValue = dataStructure[i];
//				dataStructure[i + 1] = oldValue;
//			}
//		}
	}

	private static void insertDataInto(String[] dataStructure, String inputData) {
		for (int i = 0; i < dataStructure.length; i++) {
			if (dataStructure[i] == null) {
				System.out.println(dataStructure[i] == null);
				dataStructure[i] = inputData;
				break;
			}
		}
		System.out.println(dataStructure.length);
	}
}
