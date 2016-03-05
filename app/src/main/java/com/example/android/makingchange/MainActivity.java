package com.example.android.makingchange;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }

    public void MenuMove(View v) throws Exception {
        switch (v.getId()) {

            case R.id.mainmenu_button_back:
                setContentView(R.layout.activity_main);
                break;

            case R.id.mainmenu_button_ok:
                setContentView(R.layout.activity_main);
                //SignIn.signin(SignIn_UserNameField.getText().toString(),SignIn_PasswordField.getText().toString());
                break;

            case R.id.mainmenu_button_signin:
                setContentView(R.layout.signin);
                break;

            case R.id.mainmenu_button_signup:
                setContentView(R.layout.signup);
                break;
        }


    }


}
