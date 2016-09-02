package de.kazkazi.simple.examples;

import java.util.Calendar;
import java.util.Date;

import de.kazkazi.simple.lib.annotations.Endpoint;

public class Time {

	@Endpoint
	public static Date getTime() {
		return Calendar.getInstance().getTime();
	}
	
	@Endpoint
	public static long getCurrentTimeMillis() {
		return System.currentTimeMillis();
	}
}
