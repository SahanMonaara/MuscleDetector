package sabra.muscledetector;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT =4000;

    //declaring the spinner

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this,login_Activity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);

    }

}
