package com.microlife.software.a24hr_mt_nPicker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.microlife.software.a24hr_mt_nPicker.R;

public class LoginActivity extends Activity
{
    private final static String TAG = LoginActivity.class.getSimpleName();

    Button  loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Log.d(TAG, "LoginActivity create.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = (Button)findViewById(R.id.loginbutton);
        loginButton.setText("Create your profile");
        loginButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //Utils.shortFileName("log");
                //Intent mainIntent = new Intent(getBaseContext(), leftSideMenu.class);
                Intent profileIntent = new Intent(getBaseContext(), CreateUserProfileActivity.class);
                startActivity(profileIntent);
            }
        });

        //waitForMe(10);
    }


    @Override
    protected void onStart()
    {
        super.onStart();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
    }

    public void logbtnonClick()
    {
        //Intent mainIntent = new Intent(getBaseContext(), leftSideMenu.class);
        //startActivity(mainIntent);
    }


    /*
    public void waitForMe(final int secDelay)
    {
        Thread waitThread = new Thread()
        {
            @Override
            public void run()
            {
                //super.run();
                try
                {
                    synchronized(this)
                    {
                        wait(secDelay * 1000);
                        //Thread.sleep(10*1000);
                    }
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };

        waitThread.start();
    }
    */
}
