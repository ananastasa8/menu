package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        TextView headerView = findViewById(R.id.selectedMenuItem);
        if(item.isChecked()){
            item.setChecked(false);
        }
        else item.setChecked(true);
        switch(id){
            case R.id.call_settings:
                headerView.setText("Call");

                return true;
            case R.id.camera_settings:
                headerView.setText("Camera");
                return true;
            case R.id.video_settings:
                headerView.setText("Video");
                return true;
            case R.id.email_settings:
                headerView.setText("Email");

                return true;
            case R.id.add_settings:
                headerView.setText("Add");
                return true;
            case R.id.copy_settings:
                headerView.setText("Copy");
                return true;
            case R.id.paste_settings:
                headerView.setText("Paste");
                return true;
            case R.id.help_settings:
                headerView.setText("Help");
                return true;
        }

        //headerView.setText(item.getTitle());
        return super.onOptionsItemSelected(item);
    }
}