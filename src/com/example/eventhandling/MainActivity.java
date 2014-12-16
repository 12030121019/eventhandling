package com.example.eventhandling;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       click= (Button) findViewById(R.id.btnClick);
       OnClickListener listener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
		}
	};
       
       
       click.setText("Proceed");
       click.setText(getResources().getString(R.string.caption));
       click.setTextColor(getResources().getColor(R.color.dk_blue));
       click.setTextColor(Color.GREEN);
       click.setBackgroundColor(Color.YELLOW);
       click.setTextSize((float)12.3);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
