/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi1.api;

import java.rmi.Remote;

/**
 *
 * @author sihai
 */
public interface Exchange extends Remote{
    Bid getTopBid() throws java.rmi.RemoteException;
}
