package com.sras.sras_androidclient;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

    public static final String PREFERENCES = "Preferences";

    private String mHost;
    private String mUser;
    private String mPass;

    //public ConnectionManager mConnectionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences settings = getSharedPreferences(PREFERENCES, 0);
        mHost = settings.getString("host", "");
        mUser = settings.getString("user", "");
        mPass = settings.getString("pass", "");

        if (mHost.contains("host") && mUser.contains("host") && mPass.contains("host"))
        {
            Intent intent = new Intent(getApplicationContext(), ResourceListActivity.class);
            startActivity(intent);
        }
        else
        {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
        }
    }
}
