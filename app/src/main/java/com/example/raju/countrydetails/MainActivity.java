package com.example.raju.countrydetails;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bangladesh_button, pakistan_button, india_button;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bangladesh_button=findViewById(R.id.bangladesh_button_id);
        india_button=findViewById(R.id.india_button_id);
        pakistan_button=findViewById(R.id.pakistan_button_id);


        bangladesh_button.setOnClickListener(this);
        india_button.setOnClickListener(this);
        pakistan_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.bangladesh_button_id)
        {
            intent=new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","Bangladesh");
            startActivity(intent);
        }
        if(v.getId()==R.id.india_button_id)
        {
            intent=new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","India");
            startActivity(intent);
        }
        if(v.getId()==R.id.pakistan_button_id)
        {
            intent=new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","Pakistan");
            startActivity(intent);
        }

    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialogBuilder ;

        alertDialogBuilder= new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setIcon(R.drawable.logout);
        alertDialogBuilder.setTitle(R.string.title_text);
        alertDialogBuilder.setMessage(R.string.message_text);

        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog= alertDialogBuilder.create();
        alertDialog.show();


    }
}
