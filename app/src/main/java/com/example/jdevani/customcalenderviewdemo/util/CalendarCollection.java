package com.example.jdevani.customcalenderviewdemo.util;

import java.util.ArrayList;

public class CalendarCollection {
	public String date="";
	public String event_message="";
	public String type="";

	public static ArrayList<CalendarCollection> date_collection_arr;
	public CalendarCollection(String date,String event_message,String type){
	
		this.date=date;	
		this.event_message=event_message;
		this.type=type;

	}

}
