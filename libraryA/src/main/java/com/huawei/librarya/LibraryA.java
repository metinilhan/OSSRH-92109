package com.huawei.librarya;

import android.util.Log;


public class LibraryA {
    private static final String TAG = "LibraryA";
    public LibraryA() {
        Log.d(TAG, "LibraryA: init");
    }
    public String getModuleName(){
        return  this.getClass().getSimpleName();
    }

}
