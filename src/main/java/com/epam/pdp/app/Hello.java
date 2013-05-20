package com.epam.pdp.app;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
	String sayHello() throws RemoteException;
}
