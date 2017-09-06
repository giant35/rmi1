/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi1.server;

import org.junit.Test;
import static org.junit.Assert.*;
import rmi1.api.Bid;

/**
 *
 * @author sihai
 */
public class HuobiExchangeTest {
    
    public HuobiExchangeTest() {
    }

    @Test
    public void testGetTopBid() throws Exception {
        HuobiExchange ex = new HuobiExchange();
        Bid b = ex.getTopBid();
        System.out.println(b);
    }
    
}
