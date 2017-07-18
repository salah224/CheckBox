package com.example.android.checkbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox check1, check2, check3;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addlisener();
        addmessage();
        addmessage1();
        addmessage2();
    }
    //show messagewhe checked
    public void addmessage(){
        check1 = (CheckBox)findViewById(R.id.checkBox);
        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox)view).isChecked()){
                    Toast.makeText(MainActivity.this, "Cat is selected", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
    //show messagewhe checked
    public void addmessage1(){
        check2 = (CheckBox)findViewById(R.id.checkBox2);
        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox)view).isChecked()){
                    Toast.makeText(MainActivity.this, "Dog is selected", Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    //show messagewhe checked
    public void addmessage2(){
        check3 = (CheckBox)findViewById(R.id.checkBox3);
        check3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox)view).isChecked()){
                    Toast.makeText(MainActivity.this, "Pig is selected", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
    public void addlisener(){
        check1 = (CheckBox)findViewById(R.id.checkBox);
        check2 = (CheckBox)findViewById(R.id.checkBox2);
        check3 = (CheckBox)findViewById(R.id.checkBox3);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer result = new StringBuffer();
                result.append("Cat : ").append(check1.isChecked());
                result.append("\nDog : ").append(check2.isChecked());
                result.append("\nPig : ").append(check3.isChecked());

                Toast.makeText( MainActivity.this, result.toString(),Toast.LENGTH_LONG).show();




            }
        });


    }
}
