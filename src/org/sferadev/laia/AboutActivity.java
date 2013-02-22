package org.sferadev.laia;

import org.sferadev.laia.R;
import org.sferadev.laia.R.layout;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class AboutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		
	    }
	
    public void click_xda(View v) {
        String url = "http://adf.ly/JUo1E";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
	}
	
    public void click_github(View v) {
        String url = "http://adf.ly/JUo5V";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
	}

    public void click_paypal(View v) {
        String url = "http://adf.ly/3130464/donate-to-sferadev";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
	}
    

	
}
