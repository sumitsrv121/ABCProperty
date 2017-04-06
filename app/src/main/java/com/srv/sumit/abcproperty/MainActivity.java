package com.srv.sumit.abcproperty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText myEmail;
    EditText myPassword;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ButtonClick(View view){
       myEmail= (EditText) findViewById(R.id.myemail);
        myPassword= (EditText) findViewById(R.id.mypassword);
        String email=myEmail.getText().toString();
        String pass=myPassword.getText().toString();

        String oemail="admin";
        String opass="admin";

        if(email.equals(oemail) && pass.equals(opass)){
            intent=new Intent(this,Navigation.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this,"ERROR!!! Please Enter a Valid Credentials",Toast.LENGTH_LONG).show();
        }
    }
}
