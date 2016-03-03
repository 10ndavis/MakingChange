package com.example.android.makingchange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //MAIN MENU BUTTONS
        final Button MainMenu_BtnSignIn = (Button) findViewById(R.id.mainmenu_button_signin);
        final Button MainMenu_BtnSignUp = (Button) findViewById(R.id.mainmenu_button_signup);
        final Button MainMenu_BtnBack = (Button) findViewById(R.id.mainmenu_button_back);
        final Button MainMenu_BtnOK = (Button) findViewById(R.id.mainmenu_button_ok);
        final ImageView MainMenu_LogoImage = (ImageView) findViewById(R.id.mainmenu_LogoImageView);
        //SIGN IN BUTTONS
        final TextView SignIn_UserNameView = (TextView) findViewById(R.id.signin_txtusername);
        final EditText SignIn_UserNameField = (EditText) findViewById(R.id.signin_username);
        final TextView SignIn_PasswordView = (TextView) findViewById(R.id.signin_txtpassword);
        final EditText SignIn_PasswordField = (EditText) findViewById(R.id.signin_password);
        //SIGN UP BUTTONS
        final TextView SignUp_UserNameView = (TextView) findViewById(R.id.signup_txtusername);
        final EditText SignUp_UserNameField = (EditText) findViewById(R.id.signup_username);
        final TextView SignUp_PasswordView = (TextView) findViewById(R.id.signup_txtpassword);
        final EditText SignUp_PasswordField = (EditText) findViewById(R.id.signup_password);
        final TextView SignUp_PasswordView2 = (TextView) findViewById(R.id.signup_txtpassword2);
        final EditText SignUp_PasswordField2 = (EditText) findViewById(R.id.signup_password2);
        final TextView SignUp_EmailView = (TextView) findViewById(R.id.signup_txtemail);
        final EditText SignUp_EmailField = (EditText) findViewById(R.id.signup_email);

        //OnClick Listener for Sign In Button
        MainMenu_BtnSignIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainMenu_BtnSignIn.setVisibility(View.GONE);
                MainMenu_BtnSignUp.setVisibility(View.GONE);
                MainMenu_BtnBack.setVisibility(View.VISIBLE);
                MainMenu_BtnOK.setVisibility(View.VISIBLE);
                //LogoImage.setVisibility(View.GONE);
                SignIn_UserNameField.setVisibility(View.VISIBLE);
                SignIn_UserNameView.setVisibility(View.VISIBLE);
                SignIn_PasswordField.setVisibility(View.VISIBLE);
                SignIn_PasswordView.setVisibility(View.VISIBLE);


            }
        });
        //OnClick Listener for Sign Up Button

        MainMenu_BtnSignUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainMenu_BtnSignIn.setVisibility(View.GONE);
                MainMenu_BtnSignUp.setVisibility(View.GONE);
                MainMenu_BtnBack.setVisibility(View.VISIBLE);
                MainMenu_BtnOK.setVisibility(View.VISIBLE);
                MainMenu_LogoImage.setVisibility(View.GONE);
                SignUp_UserNameField.setVisibility(View.VISIBLE);
                SignUp_UserNameView.setVisibility(View.VISIBLE);
                SignUp_PasswordField.setVisibility(View.VISIBLE);
                SignUp_PasswordView.setVisibility(View.VISIBLE);
                SignUp_PasswordField2.setVisibility(View.VISIBLE);
                SignUp_PasswordView2.setVisibility(View.VISIBLE);
                SignUp_EmailField.setVisibility(View.VISIBLE);
                SignUp_EmailView.setVisibility(View.VISIBLE);
            }
        });
        //OnClick Listener for Back Button

        MainMenu_BtnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainMenu_BtnSignIn.setVisibility(View.VISIBLE);
                MainMenu_BtnSignUp.setVisibility(View.VISIBLE);
                MainMenu_BtnBack.setVisibility(View.GONE);
                MainMenu_BtnOK.setVisibility(View.GONE);
                MainMenu_LogoImage.setVisibility(View.VISIBLE);
                SignIn_UserNameField.setVisibility(View.GONE);
                SignIn_UserNameView.setVisibility(View.GONE);
                SignIn_PasswordField.setVisibility(View.GONE);
                SignIn_PasswordView.setVisibility(View.GONE);
                SignUp_UserNameField.setVisibility(View.GONE);
                SignUp_UserNameView.setVisibility(View.GONE);
                SignUp_PasswordField.setVisibility(View.GONE);
                SignUp_PasswordView.setVisibility(View.GONE);
                SignUp_PasswordField2.setVisibility(View.GONE);
                SignUp_PasswordView2.setVisibility(View.GONE);
                SignUp_EmailField.setVisibility(View.GONE);
                SignUp_EmailView.setVisibility(View.GONE);
            }
        });
        //OnClick Listener for Confirm Button

        MainMenu_BtnOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainMenu_BtnSignIn.setVisibility(View.VISIBLE);
                MainMenu_BtnSignUp.setVisibility(View.VISIBLE);
                MainMenu_BtnBack.setVisibility(View.GONE);
                MainMenu_BtnOK.setVisibility(View.GONE);
                MainMenu_LogoImage.setVisibility(View.VISIBLE);
                SignIn_UserNameField.setVisibility(View.GONE);
                SignIn_UserNameView.setVisibility(View.GONE);
                SignIn_PasswordField.setVisibility(View.GONE);
                SignIn_PasswordView.setVisibility(View.GONE);
                SignUp_UserNameField.setVisibility(View.GONE);
                SignUp_UserNameView.setVisibility(View.GONE);
                SignUp_PasswordField.setVisibility(View.GONE);
                SignUp_PasswordView.setVisibility(View.GONE);
                SignUp_PasswordField2.setVisibility(View.GONE);
                SignUp_PasswordView2.setVisibility(View.GONE);
                SignUp_EmailField.setVisibility(View.GONE);
                SignUp_EmailView.setVisibility(View.GONE);
            }
        });



    }


};
