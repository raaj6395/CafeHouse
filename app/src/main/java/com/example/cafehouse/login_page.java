package com.example.cafehouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login_page extends AppCompatActivity {

    EditText et_email_login,et_pass_login;
    Button login_button,signup_button;
    TextView tvskip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        EditText et_email_login= findViewById(R.id.et_email_login);
        EditText et_pass_login= findViewById(R.id.et_pass_login);
        Button login_button=findViewById(R.id.login_button);
        Button signup_button=findViewById(R.id.signup_button);
        TextView tvskip = findViewById(R.id.tvskip);

        tvskip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(login_page.this,menu.class);
                startActivity(intent);
            }
        });

        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(login_page.this,signup2.class);
                startActivity(intent);
            }
        });

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( ( et_email_login.getText().toString().trim().equals("")) ||
                        ( et_pass_login.getText().toString().trim().equals("")) )
                {
                    Toast.makeText(getApplicationContext(), "All field Required", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent i = new Intent(login_page.this,menu.class);
                    startActivity(i);
                }
            }
        });






    }
}