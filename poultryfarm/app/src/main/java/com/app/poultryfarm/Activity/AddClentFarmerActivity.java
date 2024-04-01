package com.app.poultryfarm.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.app.poultryfarm.databinding.ActivityAddClentFarmerBinding;

public class AddClentFarmerActivity extends AppCompatActivity {

    private ActivityAddClentFarmerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddClentFarmerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DashboardActivity.class);
                startActivity(intent);
            }
        });



    }
}