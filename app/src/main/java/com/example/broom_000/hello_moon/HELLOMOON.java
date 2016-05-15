package com.example.broom_000.hello_moon;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class HELLOMOON extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hellomoon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hellomoon, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
      public class HelloMoonActivity extends FragmentActivity {
          /** called when activity is first created. */
          @Override
          public void onCreate (Bundle savedInstanceState);
          setContentView(R.layout.activity_hello_moon);
      }

public class AudioPlayer {
}
private MediaPlayer mPlayer;
    public void stop() {
        if (mPlayer != null)
            mplayer.release();
        mplayer= null;
    }
mPlayer.release(); mPlayer = null;
public void play(Context c){mPlayer=MediaPlayer.create(c,R.raw.one_small_step);
        mPlayer.start();
        }
        }
public voide play (Context c) {
        stop();
        mPlayer = MeidaPlayer.create(c,R.raw.one_small_step);

        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener();
        public void onCompleteion(MediaPlayer mp){
        stop ();
        }
mPlayer.start();)