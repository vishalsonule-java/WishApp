package com.nt.wish;

import java.time.LocalTime;

public class WishMessageGenerator {
public String wish() {
	LocalTime lt=LocalTime.now();
	int hour=lt.getHour();
	if(hour<12)
		return "good morning";
	else if(hour<17)
		return "good afternone";
	else if(hour<20)
		return "good evening";
	else
		return "good night";
}
}
