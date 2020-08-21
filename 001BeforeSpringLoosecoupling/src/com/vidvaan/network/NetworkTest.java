package com.vidvaan.network;

import com.vidvaan.container.NetworkContainer;

public class NetworkTest {
public static void main(String[] args) {
	NetworkContainer networkContainer = new  NetworkContainer();
	Network network=(Network) networkContainer.getObject("network");
	network.calls();
	network.sms();
	network.data();
}
}
