package com.huawei.librarya;

import android.util.Log;

import androidx.annotation.NonNull;

public class LibraryA {
    private static final String TAG = "LibraryA";
    public LibraryA() {
        Log.d(TAG, "LibraryA: init");
    }
    public String getModuleName(){
        return  this.getClass().getName();
    }

}
