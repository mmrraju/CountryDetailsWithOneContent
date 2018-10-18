package com.example.raju.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView=findViewById(R.id.image_view_id);
        textView=findViewById(R.id.text_view_id);


        Bundle bundle=getIntent().getExtras();

        if(bundle!=null)
        {
            String countryName= bundle.getString("name");
            showDetails(countryName);
        }

    }

    void showDetails(String countryName) {
        if(countryName.equals("Bangladesh"))
        {
            imageView.setImageResource(R.drawable.national);
            textView.setText(R.string.bangladesh_text);
        }
        if(countryName.equals("India"))
        {
            imageView.setImageResource(R.drawable.tajmahal);
            textView.setText(R.string.india_text);
        }
        if(countryName.equals("Pakistan"))
        {
            imageView.setImageResource(R.drawable.lake);
            textView.setText(R.string.pakistan_text);
        }
    }
}
