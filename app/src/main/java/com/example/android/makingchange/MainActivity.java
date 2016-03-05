package com.example.android.makingchange;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Hides titlebar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //Sets content view to activity main
        setContentView(R.layout.activity_main);

    }

    public void MenuMove(View v) throws Exception {
        //Switch statement to check name of button
        switch (v.getId()) {

            case R.id.mainmenu_button_back:
                setContentView(R.layout.activity_main);
                break;

            case R.id.mainmenu_button_ok:
/*                //Checks if view is on signin page
                if (findViewById(R.id.signinview).isShown()) {
                   // SignIn.signin(findViewById(R.id.signin_username).toString(), Security.hashPassword(findViewById(R.id.signin_password).toString()));
                }else if (findViewById(R.id.signupview).isShown()){
                    //SignUp.signup(findViewById(R.id.signin_username).toString(), Security.hashPassword(findViewById(R.id.signin_password).toString()));
                }*/
                setContentView(R.layout.activity_main);
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
