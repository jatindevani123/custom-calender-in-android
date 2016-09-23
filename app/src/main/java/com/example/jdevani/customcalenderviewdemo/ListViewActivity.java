package com.example.jdevani.customcalenderviewdemo;

import java.util.ArrayList;

import com.example.jdevani.customcalenderviewdemo.R;
import com.example.jdevani.customcalenderviewdemo.adapter.AndroidListAdapter;
import com.example.jdevani.customcalenderviewdemo.util.CalendarCollection;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

public class ListViewActivity extends Activity implements OnClickListener {

	private ListView lv_android;
	private AndroidListAdapter list_adapter;
	private Button btn_calender;



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_view);
		
		CalendarCollection.date_collection_arr=new ArrayList<CalendarCollection>();
		CalendarCollection.date_collection_arr.add(new CalendarCollection("2016-09-01","John Birthday","0"));
		CalendarCollection.date_collection_arr.add(new CalendarCollection("2016-09-04","Client Meeting at 5 p.m.","0"));
		CalendarCollection.date_collection_arr.add(new CalendarCollection("2016-09-06","A Small Party at my office","1"));
		CalendarCollection.date_collection_arr.add(new CalendarCollection("2016-09-02","Marriage Anniversary","1"));
		CalendarCollection.date_collection_arr.add(new CalendarCollection("2016-09-11","Live Event and Concert of sonu","1"));
		CalendarCollection.date_collection_arr.add(new CalendarCollection("2016-09-15","Ganesh Visrjan","0"));

	
		getWidget();
	}

	
	
	public void getWidget(){
		btn_calender = (Button) findViewById(R.id.btn_calender);
		btn_calender.setOnClickListener(this);
		
		lv_android = (ListView) findViewById(R.id.lv_android);
		list_adapter=new AndroidListAdapter(ListViewActivity.this,R.layout.list_item, CalendarCollection.date_collection_arr);
		lv_android.setAdapter(list_adapter);
		
	}



	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_calender:
			startActivity(new Intent(ListViewActivity.this,CalenderActivity.class));
			
			break;

		default:
			break;
		}
		
	}
	
}
