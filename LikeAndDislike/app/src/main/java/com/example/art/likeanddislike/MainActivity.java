package com.example.art.likeanddislike;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {
    private ImageSwitcher sw;

    private Button dlike,like;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = (ImageSwitcher) findViewById(R.id.imgsw);
        dlike = (Button) findViewById(R.id.dlike);
        like = (Button) findViewById(R.id.like);
        sw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageView;
            }
        });
        dlike.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sw.setImageResource(R.drawable.dl1);
            }
        });

        like.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sw.setImageResource(R.drawable.l1);
            }
        });
    }
}
