package com.sailing.www.multiscreendemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sailing.www.multiscreendemo.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.btn_to_index);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_to_index:
                Intent intent = new Intent(this,IndexActivity.class);
                startActivity(intent);
                break;
            default :
                break;
        }
    }
}
