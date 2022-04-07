package com.pool.l2.featurs8.fp.designing;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AssetClient {
	public static void main(String[] args) {
		final List<Asset> assets = Arrays.asList(new Asset(AssetType.BOND, 1000), new Asset(AssetType.BOND, 2000),
				new Asset(AssetType.STOCK, 3000), new Asset(AssetType.STOCK, 4000));
		int totalAssetValues = totalAssetValues(assets);
		System.out.println(totalAssetValues);
		int totalAssetBondValues = totalBondAssetValues(assets);
		int totalAssetStockalues = totalStockAssetValues(assets);

		Predicate<Asset> isStock = stack -> stack.getType() == AssetType.STOCK;
		Predicate<Asset> isBond = stack -> stack.getType() == AssetType.BOND;

		Predicate<Asset> stockFilter = assetTypeFilter(AssetType.STOCK);
		Predicate<Asset> bondFilter = assetTypeFilter(AssetType.BOND);
		//for all BOND+STOCK COUNT
		int totalAsseValuesNofiltering=bydamicFilteringAndCountTotal(assets,asset->true);
		
		int totalAsseValuesDynamicfiltering=bydamicFilteringAndCountTotal(assets,stockFilter);
	}

	private static int bydamicFilteringAndCountTotal(List<Asset> assets, Predicate<Asset> assetFilter) {
		return assets.stream().filter(assetFilter).mapToInt(Asset::getValue).sum();
	}
	private static int totalStockAssetValues(List<Asset> assets) {
		return assets.stream().mapToInt(asset -> asset.getType() == AssetType.STOCK ? asset.getValue() : 0).sum();
	}

	private static int totalBondAssetValues(List<Asset> assets) {
		return assets.stream().mapToInt(asset -> asset.getType() == AssetType.BOND ? asset.getValue() : 0).sum();
	}

	private static int totalAssetValues(final List<Asset> assets) {

		return assets.stream().mapToInt(Asset::getValue).sum();
	}

	public static Predicate<Asset> assetTypeFilter(AssetType assetType) {
		return asset -> asset.getType() == assetType;
	}
}
