package com.vishal.com.shopify;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class admin_login extends AppCompatActivity {

    private Button admin_btn;
    private EditText admin_name, admin_pass;
    private ProgressDialog loadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        admin_btn = (Button) findViewById(R.id.admin_button);
        admin_name = (EditText) findViewById(R.id.admin_name);
        admin_pass = (EditText) findViewById(R.id.admin_pass);

        loadingBar = new ProgressDialog(this);

        admin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                login();
            }
        });
    }
    public void login()
    {
        String user = admin_name.getText().toString().trim();
        String password = admin_pass.getText().toString().trim();

        loadingBar.setTitle("Admin");
        loadingBar.setMessage("Please Wait...");
        loadingBar.setCanceledOnTouchOutside(false);
        loadingBar.show();

        // Admin Name and Password...

        if(user.equals("vishal")&& password.equals("admin"))
        {
            loadingBar.dismiss();
            startActivity(new Intent(getBaseContext(), AdminCategoryActivity.class));
            Toast.makeText(getBaseContext(), "Welcome Admin...", Toast.LENGTH_SHORT).show();
        }
        else {
            loadingBar.dismiss();
            Toast.makeText(getBaseContext(), "Not an Admin Wrong Details...", Toast.LENGTH_SHORT).show();

        }
    }

}
