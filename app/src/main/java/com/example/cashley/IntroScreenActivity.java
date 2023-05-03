package com.example.cashley;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.cashley.databinding.ActivityIntroScreenBinding;

import java.util.ArrayList;
import java.util.List;

public class IntroScreenActivity extends AppCompatActivity {

    ViewPager2 iScreenPager;
    IntroScreenVpAdapter introScreenVpAdapter;
    ActivityIntroScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        binding = ActivityIntroScreenBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_intro_screen);

        List<IntroScreenItems> iList = new ArrayList<>();
        iList.add(new IntroScreenItems(getString(R.string.organize_yo), getString(R.string.welcome_aif), R.drawable.intro1));
        iList.add(new IntroScreenItems(getString(R.string.connect_you), getString(R.string.aif_works_b), R.drawable.intro2));
        iList.add(new IntroScreenItems(getString(R.string.planning_au), getString(R.string.aif_keeps_a), R.drawable.intro3));

        iScreenPager = findViewById(R.id.view_pager2);
        iScreenPager.setOffscreenPageLimit(2); // This sets the offscreen page limit to 2

        introScreenVpAdapter = new IntroScreenVpAdapter(this,iList);
        iScreenPager.setAdapter(introScreenVpAdapter);
    }
}