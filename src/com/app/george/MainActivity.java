package com.app.george;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	// orismos antikeimenon kai metabliton
	int counter;
	Button add,sub;
	TextView display;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        counter=0;
        
        //sindesi twn antikeimenwn me to antistoixo compoment stin xml
        add=(Button)findViewById(R.id.bAdd);
        sub=(Button)findViewById(R.id.bSub);
        display=(TextView)findViewById(R.id.tvDisplay);
        
        // me to klik tou koumpiou add energopoieitai to event
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter++;
				display.setText("Total is "+ counter);
				
			}
		});
        
        //me to klik toy koumpiou sub energopeitai to event
        sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				display.setText("Total is "+ counter);
				
			}
		});
        
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
