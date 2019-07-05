package com.example.image_demo_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    private ImageButton imageButton;
    private ImageView imageView;
    private int count = 0;
    private Switch aSwitch;
    private Button button;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = findViewById(R.id.imageButton);
        imageView = findViewById(R.id.imageView);
        aSwitch = findViewById(R.id.switch1);
        radioButton1 = findViewById(R.id.radioBtn1);
        radioButton2 = findViewById(R.id.radioBtn2);
        checkBox = findViewById(R.id.showImageButton);
        button = findViewById(R.id.refresh);
    }

    public void onImageButtonClick(View view) {
        if (count % 2 == 0) {
            imageView.setImageResource(R.drawable.tnt);
            imageButton.setImageResource(R.drawable.boom);
        } else {
            imageView.setImageResource(R.drawable.boom);
            imageButton.setImageResource(R.drawable.tnt);
        }
        count++;
    }

    public void onRefresh(View view){

        if(aSwitch.isChecked()) {
            imageView.setVisibility(View.INVISIBLE);
        }
        else if(!aSwitch.isChecked()) {
            imageView.setVisibility(View.VISIBLE);
        }

        if(radioButton1.isChecked()){
            imageButton.setClickable(true);
        }
        else {
            imageButton.setClickable(false);
        }

        if(checkBox.isChecked()) {
            imageButton.setVisibility(View.VISIBLE);
//            checkBox.setChecked(true);
        }
        else if (!checkBox.isChecked()) {
            imageButton.setVisibility(View.INVISIBLE);
//            checkBox.setChecked(false);
        }
    }
}