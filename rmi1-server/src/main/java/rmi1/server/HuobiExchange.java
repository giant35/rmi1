/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi1.server;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.time.LocalDateTime;
import java.util.logging.Logger;
import rmi1.api.Bid;
import rmi1.api.Exchange;

/**
 *
 * @author sihai
 */
public class HuobiExchange implements Exchange {

    private static final Logger LOG = Logger.getLogger(HuobiExchange.class.getName());

    public HuobiExchange() throws RemoteException {
        super();
    }

    @Override
    public Bid getTopBid() throws RemoteException {
        LOG.info("getTopBid enter...");
        Bid ret = new Bid();
        ret.setDate(LocalDateTime.now());
        ret.setBid(100);
        ret.setPrice(BigDecimal.ONE);
        return ret;
    }

}
