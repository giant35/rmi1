/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi1.client;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmi1.api.Exchange;

/**
 *
 * @author sihai
 */
public class App {

    public static void main(String[] argv) throws RemoteException, NotBoundException {
        Registry reg = LocateRegistry.getRegistry();
        Exchange exchange = (Exchange) reg.lookup("exchange");
        System.out.println(exchange.getTopBid());
    }
}
