package org.sferadev.laia;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class ManifestActivity extends Activity {

	String Url1 = "file:///android_asset/manifest1.png";
	String Url2 = "file:///android_asset/manifest2.png";
	String Url3 = "file:///android_asset/manifest3.png";
	String Url4 = "file:///android_asset/manifest4.png";
	String Url5 = "file:///android_asset/manifest5.png";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_manifest);
		
		WebView wv1 = (WebView) findViewById(R.id.manifest1);
		wv1.loadUrl(Url1);
		
		WebView wv2 = (WebView) findViewById(R.id.manifest2);
		wv2.loadUrl(Url2);
		
		WebView wv3 = (WebView) findViewById(R.id.manifest3);
		wv3.loadUrl(Url3);
		
		WebView wv4 = (WebView) findViewById(R.id.manifest4);
		wv4.loadUrl(Url4);
		
		WebView wv5 = (WebView) findViewById(R.id.manifest5);
		wv5.loadUrl(Url5);
		
	}

}
