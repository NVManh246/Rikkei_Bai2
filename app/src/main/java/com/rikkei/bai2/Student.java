package com.rikkei.bai2;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {
    private String fullname;
    private String born;
    private String birthday;
    private String gender;
    private String classs;
    private String course;

    public Student(String fullname, String born, String birthday,
                   String gender, String classs, String course) {
        this.fullname = fullname;
        this.born = born;
        this.birthday = birthday;
        this.gender = gender;
        this.classs = classs;
        this.course = course;
    }

    protected Student(Parcel in) {
        fullname = in.readString();
        born = in.readString();
        birthday = in.readString();
        gender = in.readString();
        classs = in.readString();
        course = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public String getFullname() {
        return fullname;
    }

    public String getBorn() {
        return born;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public String getClasss() {
        return classs;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(fullname);
        dest.writeString(born);
        dest.writeString(birthday);
        dest.writeString(gender);
        dest.writeString(classs);
        dest.writeString(course);
    }
}
