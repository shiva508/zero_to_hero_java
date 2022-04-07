package com.pool.l3.rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.pool.l3.rmi.remoteinterface.StudentPoolRemoteInterface;

public class StudentPoolRemoteClient {
	public static void main(String[] args) throws RemoteException {
		try {
			StudentPoolRemoteInterface stub = (StudentPoolRemoteInterface) Naming.lookup("rmi://localhost:5000/shiva");
			System.out.println(stub.add(508, 408));
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
}
