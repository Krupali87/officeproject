package com.app.poultryfarm.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.app.poultryfarm.databinding.ActivityAddSupplierBinding;

public class AddSupplierActivity extends AppCompatActivity {

    private ActivityAddSupplierBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddSupplierBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnsubmitsupplier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DashboardActivity.class);
                startActivity(intent);
            }
        });


    }
}