package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtAdres;
    WebView tarayici;
    Button btnGit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tanımlamalar
        edtAdres = findViewById(R.id.edtUrl);
        tarayici = findViewById(R.id.webView);
        btnGit = findViewById(R.id.btnGit);

        btnGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String _url;
                _url = edtAdres.getText().toString();
                tarayici.loadUrl(_url);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (tarayici.canGoBack()){
            tarayici.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}