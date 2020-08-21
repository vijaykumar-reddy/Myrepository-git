package com.vidvaan.network;

public class IdeaNetwork implements Network {

	@Override
	public void sms() {
		sop("idea msg");

	}

	@Override
	public void calls() {
		sop("idea calls");


	}

	@Override
	public void data() {
		sop("idea data");


	}
	public static void sop(Object obj) {
		System.out.println(obj);
	}

}
