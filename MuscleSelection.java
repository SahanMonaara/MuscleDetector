package sabra.muscledetector;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MuscleSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_selection);
        thingspeak();

    }
    public void thingspeak(){
        Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse("https://thingspeak.com/users/sign_up"));
        startActivity(intent);
    }
}
