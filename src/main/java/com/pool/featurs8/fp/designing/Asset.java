package com.pool.featurs8.fp.designing;

public class Asset {
	private final AssetType type;
	private final int value;

	public Asset(AssetType type, int value) {
		this.type = type;
		this.value = value;
	}

	public AssetType getType() {
		return type;
	}

	public int getValue() {
		return value;
	}

}
