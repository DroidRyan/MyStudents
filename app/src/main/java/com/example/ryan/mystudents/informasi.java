package com.example.ryan.mystudents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class informasi extends AppCompatActivity {

    private TextView txttentang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi);

        txttentang = (TextView) findViewById(R.id.etxtentang);
        txttentang.setText("Created By : Ryan Ilham Abrori \n" +
                "https://enotes-me.blogspot.com \n" +
                "iam.ilhamabrori@gmail.com \n");
        // proses menambahkan Links pada TextView
        Linkify.addLinks(txttentang, Linkify.ALL);
    }
}
