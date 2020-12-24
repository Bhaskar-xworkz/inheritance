package com.xworkz.computers.computerTypes;

public class Laptop extends Desktop {

	private boolean bluetoothAvalaibility = true;
	private boolean wifiAvalaibility = true;

	public boolean isBluetoothAvalaible() {
		return bluetoothAvalaibility;
	}

	public boolean isWifiAvalaible() {
		return wifiAvalaibility;
	}
	
	public void connectivity() {
		if (this.bluetoothAvalaibility==true) {
			System.out.println("bluetooth available");
			
		}
	}

	
}
