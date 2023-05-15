package com.example.cafehouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signup2 extends AppCompatActivity {

    EditText et_username_signup,phone_signup,et_pass_signup,et_email_signup;
    Button Register;
    TextView tv_upload,tv_already_signin;



    @Override
   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);

        Button Register=findViewById(R.id.Register);
        EditText et_username_signup= findViewById(R.id.et_username_signup);
        EditText et_pass_signup= findViewById(R.id.et_pass_signup);
        EditText phone_signup= findViewById(R.id.phone_signup);
        EditText et_email_signup= findViewById(R.id.et_email_signup);
        TextView tv_already_signin= findViewById(R.id.tv_already_signin);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( ( et_username_signup.getText().toString().trim().equals("")) ||
                        ( et_pass_signup.getText().toString().trim().equals("")) ||
                        ( phone_signup.getText().toString().trim().equals("")) ||
                        ( et_email_signup.getText().toString().trim().equals("")) )
                {
                    Toast.makeText(getApplicationContext(), "All field Required", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent i = new Intent(signup2.this,menu.class);
                    startActivity(i);
                }
            }
        });

        tv_already_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(signup2.this,login_page.class);
                startActivity(intent);
            }
        });
    }
}