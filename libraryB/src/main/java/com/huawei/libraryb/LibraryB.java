package com.huawei.libraryb;

import android.util.Log;

public class LibraryB {
    private static final String TAG = "LibraryB";
    public LibraryB(){
        Log.d(TAG, "LibraryB: init");
    }
    public String getModuleName(){
        return  this.getClass().getSimpleName();
    }
}
