package org.myself.customalertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv_helloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv_helloWorld = findViewById(R.id.tv_helloWorld);
        tv_helloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog();
            }
        });
    }

    private void showCustomDialog() {
        View view = LayoutInflater.from(this).inflate(R.layout.activity_custom_dialog, null);

        Button buttonYes, buttonNo;
        buttonYes = view.findViewById(R.id.btn_yes);
        buttonNo = view.findViewById(R.id.btn_no);

        final Dialog dialog = new AlertDialog.Builder(this)
                .setView(view)
                .show();

        buttonYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Yes", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        buttonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "No", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
    }
}
