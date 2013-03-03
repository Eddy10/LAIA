package org.sferadev.laia;

import org.sferadev.laia.AboutActivity;
import org.sferadev.laia.R;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class LaiaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laia);
    }

    public void click_what(View v) {
    	Intent intent = new Intent(this, WhatActivity.class);
	        this.startActivity(intent);
	}
    
    public void click_howto(View v) {
    	Intent intent = new Intent(this, HowtoActivity.class);
	        this.startActivity(intent);
	}
    
    public void click_activities(View v) {
    	Intent intent = new Intent(this, ActivitiesActivity.class);
	        this.startActivity(intent);
	}
    
    public void click_manifest(View v) {
    	Intent intent = new Intent(this, ManifestActivity.class);
	        this.startActivity(intent);
	}
    
    public void click_layouts(View v) {
    	Intent intent = new Intent(this, LayoutsActivity.class);
	        //this.startActivity(intent);
	}
    
    public void click_values(View v) {
    	Intent intent = new Intent(this, ValuesActivity.class);
	        //this.startActivity(intent);
	}
    
    public void click_menu(View v) {
    	Intent intent = new Intent(this, MenuActivity.class);
	        //this.startActivity(intent);
	}
    
    public void click_debug(View v) {
    	Intent intent = new Intent(this, DebugActivity.class);
	        //this.startActivity(intent);
	}
    
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_laia, menu);
		return true;
	}
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
           case R.id.exit:
                finish();
                return true;
                
           case R.id.about:
   			Intent intent = new Intent(this, AboutActivity.class);
   	        this.startActivity(intent);
   	        break;
   			
   		}
        
        return false;
    }
    
}
