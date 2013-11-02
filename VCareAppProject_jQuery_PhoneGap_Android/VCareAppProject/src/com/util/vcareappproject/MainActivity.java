package com.util.vcareappproject;

import org.apache.cordova.*;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
    	
    	 super.onCreate(savedInstanceState);
         // Set by <content src="index.html" /> in config.xml
         super.loadUrl(Config.getStartUrl());
         //super.loadUrl("file:///android_asset/www/index.html")
    	
    }


   
    
}
