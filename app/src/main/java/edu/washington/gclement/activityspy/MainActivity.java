package edu.washington.gclement.activityspy;

import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

//    private Resource res = getResources();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        logActivity("Create");
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e("ActivitySpy", getString(R.string.notify_close));
        logActivity("Destroy");
    }

    @Override
    protected void onPause(){
        super.onPause();
        logActivity("Pause");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        logActivity("Restart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        logActivity("Resume");
    }

    @Override
    protected void onStart(){
        super.onStart();
        logActivity("Start");
    }

    @Override
    protected void onStop(){
        super.onStop();
        logActivity("Stop");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    private void logActivity(String act){
        Log.i("ActivitySpy", getString(R.string.dev_event, act));
    }
}
