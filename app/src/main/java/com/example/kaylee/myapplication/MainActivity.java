package com.example.kaylee.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image);
        editText = (EditText) findViewById(R.id.edit);
        final SoftKeyboardStateHelper softKeyboardStateHelper = new SoftKeyboardStateHelper(editText);
        softKeyboardStateHelper.addSoftKeyboardStateListener(new SoftKeyboardStateHelper.SoftKeyboardStateListener() {
            @Override
            public void onSoftKeyboardOpened(int keyboardHeightInPx) {
                    imageView.setImageDrawable(getDrawable(R.mipmap.ic_launcher_round));
            }

            @Override
            public void onSoftKeyboardClosed() {
                imageView.setImageDrawable(getDrawable(R.drawable.a));
            }
        });
    }
}
