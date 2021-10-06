package premji.org.demodesignlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String MY_TAG = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(MY_TAG, "On create");
    }

    @Override
    protected void onStart()
    {
        super.onStart();

        Log.i(MY_TAG, "On start");
    }

    @Override
    protected void onStop()
    {
        super.onStop();

        Log.i(MY_TAG, "On stop");
    }

    @Override
    protected void onResume()
    {
        super.onResume();

        Log.i(MY_TAG, "On resume");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();

        Log.i(MY_TAG, "On restart");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();

        Log.i(MY_TAG, "On destroy");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.i("yo", "On pause");
    }
}