package com.example.minilist;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.minilist.databinding.ActivitySettingsBinding;

public class SettingsActivity extends AppCompatActivity {

    public final static String SETTINGS_TEXT_COLOR = "text_color";
    public final static String SETTINGS_TEXT_SIZE = "text_size";

    private SettingsPresenter presenter;
    private ActivitySettingsBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySettingsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        presenter = new SettingsPresenter(this);

        binding.radioTextSize.setOnCheckedChangeListener((view, check) -> presenter.changeSize(view));
        binding.radioTextColor.setOnCheckedChangeListener((view, check) -> presenter.changeColor(view));

        binding.radio16.toggle();
        binding.radioBlack.toggle();
    }
}