/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi1.server;

import java.io.IOException;
import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import rmi1.api.Exchange;

/**
 *
 * @author sihai
 */
public class App {

    private static final Logger LOG = Logger.getLogger(App.class.getName());
    
    public static void main(String[] argv) throws NamingException, RemoteException, IOException{
        Exchange ex = (Exchange) UnicastRemoteObject.exportObject(new HuobiExchange(),0);
        Registry reg = LocateRegistry.getRegistry();
        try {
            reg.bind("exchange", ex);
        } catch (AlreadyBoundException | AccessException ex1) {
            LOG.log(Level.SEVERE, null, ex1);
        }
        System.out.println("wait connet" + ex.getTopBid());
        System.in.read();
    }
}
