package com.rikkei.bai2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class StudentInforActivity extends AppCompatActivity {

    private static final String EXTRA_STUDENT = "student";

    private Student student;

    private TextView tvFullname;
    private TextView tvBorn;
    private TextView tvBirthday;
    private TextView tvGender;
    private TextView tvClass;
    private TextView tvCourse;

    public static Intent getStudentInforIntent(Context context, Student student) {
        Intent intent = new Intent(context, StudentInforActivity.class);
        intent.putExtra(EXTRA_STUDENT, student);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);
        initData();
        initView();
    }

    private void initData() {
        student = getIntent().getParcelableExtra(EXTRA_STUDENT);
    }

    private void initView(){
        tvFullname = findViewById(R.id.text_fullname);
        tvBorn = findViewById(R.id.text_born);
        tvBirthday = findViewById(R.id.text_birthday);
        tvGender = findViewById(R.id.text_gender);
        tvClass = findViewById(R.id.text_class);
        tvCourse = findViewById(R.id.text_course);

        tvFullname.setText(student.getFullname());
        tvBorn.setText(student.getBorn());
        tvBirthday.setText(student.getBirthday());
        tvGender.setText(student.getGender());
        tvClass.setText(student.getClasss());
        tvCourse.setText(student.getCourse());
    }
}
