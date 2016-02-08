package com.example.picture;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
MediaPlayer oursong;
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button2);
        b2=(Button)findViewById(R.id.button1);
        oursong=MediaPlayer.create(MainActivity.this,R.raw.srinivasa);
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				   oursong.start();
				   Toast.makeText(getApplicationContext(),"start",Toast.LENGTH_LONG).show();
				      	
			}
		});
        b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				oursong.stop();
				Toast.makeText(getApplicationContext(),"stop",Toast.LENGTH_LONG).show();
			}
		});
     
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
   
    @Override
    public void onResume() {
        super.onResume();
        oursong.start();
        Toast.makeText(getApplicationContext(),"resume",Toast.LENGTH_LONG).show();
    }   
    public void onPause() {
        super.onPause();
        oursong.pause();
        Toast.makeText(getApplicationContext(),"pause",Toast.LENGTH_LONG).show();
    }   
    
}
