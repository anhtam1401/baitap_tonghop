package com.example.tonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText eUser,ePassword;
    ImageView btnSignup;
    ImageButton btnLogin;
    String ten , mk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Anhxa();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (eUser.getText().length() != 0 && ePassword.getText().length() !=0){
                    if (eUser.getText().toString().equals(ten) && ePassword.getText().toString().equals(mk)){
                        Toast.makeText(Login.this,"Bạn đã đăng nhập thành công",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this,Home.class);
                        startActivity(intent);
                    }else if (eUser.getText().toString().equals("anhtam") && ePassword.getText().toString().equals("12345")){
                        Toast.makeText(Login.this,"Bạn đã đăng nhập thành công",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this,Home.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(Login.this,"Sai mật khẩu",Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(Login.this,"Vui lòng nhập đầy đủ thông tin",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view  ) {
                Intent ok = new Intent(Login.this, Signup.class);
                startActivity(ok);
            }
        });

    }
    private void Anhxa(){
        eUser = (EditText) findViewById(R.id.editUser);
        ePassword = (EditText) findViewById(R.id.editPassword);
        btnLogin = (ImageButton) findViewById(R.id.buttonSignin);
        btnSignup =(ImageView) findViewById(R.id.buttonSignup);
    }
}