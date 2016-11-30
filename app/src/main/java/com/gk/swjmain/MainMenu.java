package com.gk.swjmain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

import com.gk.simpleworkoutjournal.R;
import com.gk.simpleworkoutjournal.WorkoutJournal;

public class MainMenu extends Activity  {
	private static final String APP_NAME = "Gym Train";
    private static final boolean DEBUG_FLAG = false;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	if ( DEBUG_FLAG ) Log.v(APP_NAME, "MainMenu :: onCreate()");

        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, WorkoutJournal.class));


    }


    
}
