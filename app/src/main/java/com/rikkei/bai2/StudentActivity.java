package com.rikkei.bai2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String EXTRA_FULLNAME = "fullname";

    private String fullName;

    private TextView tvFullName;
    private EditText etBorn;
    private EditText etBirthday;
    private EditText etGender;
    private EditText etClass;
    private EditText etCourse;

    public static Intent getStudentIntent(Context context, String fullName) {
        Intent intent = new Intent(context, StudentActivity.class);
        intent.putExtra(EXTRA_FULLNAME, fullName);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        initData();
        initView();
    }

    private void initData() {
        fullName = getIntent().getStringExtra(EXTRA_FULLNAME);
    }

    private void initView() {
        tvFullName = findViewById(R.id.text_fullname);
        etBorn = findViewById(R.id.edit_text_born);
        etBirthday = findViewById(R.id.edit_text_birthday);
        etGender = findViewById(R.id.edit_text_gender);
        etClass = findViewById(R.id.edit_text_class);
        etCourse = findViewById(R.id.edit_text_cource);
        findViewById(R.id.button_next).setOnClickListener(this);

        tvFullName.setText(fullName);
    }

    @Override
    public void onClick(View v) {
        String born = etBorn.getText().toString();
        String birthday = etBirthday.getText().toString();
        String gender = etGender.getText().toString();
        String classs = etClass.getText().toString();
        String course = etCourse.getText().toString();
        Student student = new Student(fullName, born, birthday, gender, classs, course);

        Intent intent = StudentInforActivity.getStudentInforIntent(this, student);
        startActivity(intent);
        finish();
    }
}
