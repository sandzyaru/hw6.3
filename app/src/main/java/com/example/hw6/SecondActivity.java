package com.example.hw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.hw6.databinding.ActivitySecondBinding;
import com.example.hw6.databinding.ItemTrackListBinding;

public class SecondActivity extends AppCompatActivity {
     private ActivitySecondBinding binding;
     private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        String text=getIntent().getStringExtra("key");
        textView = findViewById(R.id.blank_space);
        textView.setText(text);

    }
}