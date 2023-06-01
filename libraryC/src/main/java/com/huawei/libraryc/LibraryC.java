package com.huawei.libraryc;

import android.util.Log;

public class LibraryC {
    private static final String TAG = "LibraryC";
    public LibraryC(){
        Log.d(TAG, "LibraryC: init");
    }
    public String getModuleName(){
        return  this.getClass().getSimpleName();
    }
}
