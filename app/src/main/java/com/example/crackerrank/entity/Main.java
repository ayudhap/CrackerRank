package com.example.crackerrank.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class Main implements Parcelable {
    private String title, difficulty, skills;

    public Main(String title, String difficulty, String skills) {
        this.title = title;
        this.difficulty = difficulty;
        this.skills = skills;
    }

    public Main() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.difficulty);
        dest.writeString(this.skills);
    }

    public void readFromParcel(Parcel source) {
        this.title = source.readString();
        this.difficulty = source.readString();
        this.skills = source.readString();
    }

    protected Main(Parcel in) {
        this.title = in.readString();
        this.difficulty = in.readString();
        this.skills = in.readString();
    }

    public static final Parcelable.Creator<Main> CREATOR = new Parcelable.Creator<Main>() {
        @Override
        public Main createFromParcel(Parcel source) {
            return new Main(source);
        }

        @Override
        public Main[] newArray(int size) {
            return new Main[size];
        }
    };
}
