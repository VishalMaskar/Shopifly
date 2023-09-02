package com.vishal.com.shopify;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import com.github.clans.fab.FloatingActionButton;


public class CreatedByActivity extends AppCompatActivity {

    private FloatingActionButton mail,instagram,facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_created_by);

        mail = (FloatingActionButton) findViewById(R.id.mail);
        instagram=findViewById(R.id.instagram);
        facebook=findViewById(R.id.facebook);

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String repient="vishalmaskar2511.in@gmail.com";
                String recpients[]=repient.split(",");


                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL,recpients);


                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Choose an Email Client"));


            }
        });



        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.instagram.com/maskar_vishal/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://m.facebook.com/profile.php?id=100007050456632&ref=content_filter");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });
    }
}

