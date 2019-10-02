package com.hanet.testdagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;
import javax.inject.Named;

public class Main2Activity extends AppCompatActivity {

    @Inject
    Resources resources;

    @Named("B")
    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = findViewById(R.id.text);


        ((MyApplication) getApplication()).getAppComponent().inject(this);

        textView.setText(user.getName());

        textView.setBackgroundColor(resources.getColor(R.color.colorPrimaryDark));


    }

    public void navigation(View view) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
