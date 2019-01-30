package com.rikkei.bai2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etFullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFullName = findViewById(R.id.edit_text_fullname);
        findViewById(R.id.button_next).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String fullName = etFullName.getText().toString();
        Intent intent = StudentActivity.getStudentIntent(this, fullName);
        startActivity(intent);
        finish();
    }
}
