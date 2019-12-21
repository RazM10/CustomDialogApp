package org.myself.customalertdialog;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

public class CustomDialog extends Dialog implements android.view.View.OnClickListener{

    public CustomDialog(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog);
    }

    @Override
    public void onClick(View v) {

    }
}
