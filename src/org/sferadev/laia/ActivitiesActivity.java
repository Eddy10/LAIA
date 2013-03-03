package org.sferadev.laia;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;


public class ActivitiesActivity extends Activity {
	
	String Url1 = "file:///android_asset/activities1.png";
	String Url3 = "file:///android_asset/activities3.png";
	String Url4 = "file:///android_asset/activities4.png";
	String Url5 = "file:///android_asset/activities5.png";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activities);
	

	WebView wv1 = (WebView) findViewById(R.id.activities1);
	wv1.loadUrl(Url1);
	
	WebView wv3 = (WebView) findViewById(R.id.activities3);
	wv3.loadUrl(Url3);
	
	WebView wv4 = (WebView) findViewById(R.id.activities4);
	wv4.loadUrl(Url4);
	
	WebView wv5 = (WebView) findViewById(R.id.activities5);
	wv5.loadUrl(Url5);
	
	
	
}

}