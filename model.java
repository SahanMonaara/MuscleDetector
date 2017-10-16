package sabra.muscledetector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class model extends AppCompatActivity {
    Spinner sp;
    adapter customadapter;
    String[] muscles={"Biceps","Tricep","Neck","Calf","Abdominal","Quadriceps"};
    int[] images={R.drawable.biceps,R.drawable.triceps,R.drawable.neck,R.drawable.calf,R.drawable.abdominals,R.drawable.quadriceps};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model);
        sp=(Spinner)findViewById(R.id.spinner);
        customadapter=new adapter(this,muscles,images);
        sp.setAdapter(customadapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), muscles[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
