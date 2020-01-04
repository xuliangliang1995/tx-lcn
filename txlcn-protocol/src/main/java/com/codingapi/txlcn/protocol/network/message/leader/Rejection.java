package com.codingapi.txlcn.protocol.network.message.leader;

import com.codingapi.txlcn.protocol.Peer;
import com.codingapi.txlcn.protocol.network.Connection;
import com.codingapi.txlcn.protocol.network.message.Message;

/**
 * Notifies the peer ,which started the election, that this peer rejected its election
 */
public class Rejection implements Message {

    private static final long serialVersionUID = -4458007227538796558L;

    @Override
    public void handle(Peer peer, Connection connection) {
        peer.handleRejection(connection);
    }

}