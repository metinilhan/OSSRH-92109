package com.example.camerapermisson;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;

import com.example.camerapermisson.databinding.ActivityMainBinding;
import com.huawei.librarya.LibraryA;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        LibraryA libraryA = new LibraryA();
        binding.txtMain.setText(libraryA.getModuleName());

    }

}