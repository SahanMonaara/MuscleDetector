package sabra.muscledetector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class login_Activity extends AppCompatActivity {
    private static Button button_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        final EditText email = (EditText)findViewById(R.id.email);
        final EditText password = (EditText)findViewById(R.id.password);
        final Button login = (Button)findViewById(R.id.login);

        login.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                if(!loginEmail(email.getText().toString())){
                    email.setError("Invalid Email");
                    email.requestFocus();

                }else if(!loginPassword(email.getText().toString())){
                    password.setError("Invalid Password");
                    password.requestFocus();


                }else{
                    Toast.makeText(login_Activity.this, "Login Sucess!!", Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent("sabra.muscledetector.MuscleSelection");
                    startActivity(intent);

                }
            }

        });

    }

    private boolean loginPassword(String password) {
        if(password!=null && password.length()>9){
            return true;
        }else{
            return false;
        }
    }

    private boolean loginEmail(String email) {
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\\\.+[a-z]+";

        Pattern pattern = Pattern.compile(email);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
        
    }

}
