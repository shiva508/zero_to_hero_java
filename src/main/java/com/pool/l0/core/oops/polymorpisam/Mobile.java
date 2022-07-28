package com.pool.l0.core.oops.polymorpisam;

public class Mobile {
	public static void main(String[] args) {
		HeadSet headSet=new HeadSet();
		headSet.listenMusic("Narmal Headset");
		headSet.playVideo();
		headSet.staticCall();
		System.out.println("===========================");
		BluetoothHeadset bluetoothHeadset=new BluetoothHeadset();
		bluetoothHeadset.listenMusic("Bluetooth Headset");
		bluetoothHeadset.playVideo();
		bluetoothHeadset.staticCall();
		System.out.println("===========================");
		HeadSet headSetBluetooth=new BluetoothHeadset();
		headSetBluetooth.listenMusic("Bluetooth Headset");
		headSetBluetooth.playVideo();
		headSetBluetooth.staticCall();
	}

}
