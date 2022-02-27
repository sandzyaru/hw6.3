package com.example.hw6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.hw6.databinding.ActivityMainBinding;
import com.example.hw6.databinding.FragmentTrackListBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction().add(R.id.frame1, new BackgroundFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.frame2, new TrackListFragment()).commit();
    }
}