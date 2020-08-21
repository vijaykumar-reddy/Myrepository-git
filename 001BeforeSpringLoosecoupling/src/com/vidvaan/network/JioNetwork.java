package com.vidvaan.network;

public class JioNetwork implements Network {

	@Override
	public void sms() {
		sop("Jio msg");

	}

	@Override
	public void calls() {
		sop("Jio calls");


	}

	@Override
	public void data() {
		sop("Jio data");


	}
	public static void sop(Object obj) {
		System.out.println(obj);
	}

}
