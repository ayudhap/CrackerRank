package com.example.crackerrank.entity;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class MainData {
    public static String[][] data = new String[][] {
            {"Selamat datang di Basic Java", "Easy", "Basic Java"},
            {"Selamat datang di Basic Java II", "Easy", "Basic Java"},
            {"Java STDIN", "Easy", "Basic Java"},
            {"Java If-Else", "Easy", "Basic Java"},
    };

    @NonNull
    public static ArrayList<Main> getListData() {
        ArrayList<Main> list = new ArrayList<>();
        for (String[] aData : data) {
            Main main = new Main();
            main.setTitle(aData[0]);
            main.setDifficulty(aData[1]);
            main.setSkills(aData[2]);
            list.add(main);
        }
        return list;
    }
}
