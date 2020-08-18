package com.app.george;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
// orismos splash gia background kata tin ekkinisi tis efarmogis
public class Splash extends Activity{
	MediaPlayer ourSong;
	//methodos dimiourgias tou splash kai prepei na enimerothei to manifesto gia tin nea activity kai orismos proteraiotitas tis
	@Override
	protected void onCreate(Bundle GeorgeLoveApps) {
		// TODO Auto-generated method stub
		super.onCreate(GeorgeLoveApps);
		setContentView(R.layout.splash);
		MediaPlayer ourSong=MediaPlayer.create(Splash.this, R.raw.splashsound);
		ourSong.start();
		Thread timer=new Thread(){
			public void run(){
				try{
					sleep(5000);
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
				finally{
					Intent openStartingPoint=new Intent("com.app.george.MainActivity");
					startActivity(openStartingPoint);
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ourSong.release();
		finish();
	}
	
	

}
