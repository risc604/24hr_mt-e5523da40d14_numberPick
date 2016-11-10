package com.microlife.software.a24hr_mt_nPicker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.microlife.software.a24hr_mt_nPicker.R;

public class CreateUserProfileActivity extends AppCompatActivity
{
    ImageButton saveButton;
    EditText    etName, etBirthday;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user_profile);

        saveButton = (ImageButton) findViewById(R.id.imgbtnSave);
        etName = (EditText) findViewById(R.id.etPFName);
        etBirthday = (EditText) findViewById(R.id.etPFBirthday);


        saveButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent mainIntent = new Intent(getBaseContext(), MainActivity.class);
                mainIntent.putExtra(MainActivity.EXTRAS_USER_NAME, etName.getText().toString());

                startActivity(mainIntent);
            }
        });
        //*/
    }


}
