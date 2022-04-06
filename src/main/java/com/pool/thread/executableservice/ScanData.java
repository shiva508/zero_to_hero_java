package com.pool.thread.executableservice;

import java.util.Date;

public class ScanData {
	private String scanName;
	private Date scanCreatedDate;

	public ScanData() {

	}

	public String getScanName() {
		return scanName;
	}

	public void setScanName(String scanName) {
		this.scanName = scanName;
	}

	public Date getScanCreatedDate() {
		return scanCreatedDate;
	}

	public void setScanCreatedDate(Date scanCreatedDate) {
		this.scanCreatedDate = scanCreatedDate;
	}

	@Override
	public String toString() {
		return "ScanData [scanName=" + scanName + ", scanCreatedDate=" + scanCreatedDate + "]";
	}

}
