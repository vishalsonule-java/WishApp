package com.nt.test;

import com.nt.wish.WishMessageGenerator;

public class ClientApp {

	public static void main(String[] args) {
		
		WishMessageGenerator wmsg=new WishMessageGenerator();
		String str=wmsg.wish();
		System.out.println(str);
	}

}
