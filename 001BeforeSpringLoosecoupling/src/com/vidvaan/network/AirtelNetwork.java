package com.vidvaan.network;

public class AirtelNetwork implements Network {

	@Override
	public void sms() {
		sop("Airtel msg");

	}

	@Override
	public void calls() {
		sop("Airtel calls");


	}

	@Override
	public void data() {
		sop("Airtel data");


	}
	public static void sop(Object obj) {
		System.out.println(obj);
	}

}
