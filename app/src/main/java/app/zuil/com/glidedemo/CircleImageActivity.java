package app.zuil.com.glidedemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

import app.zuil.com.glidedemo.view.GlideCircleTransform;
import app.zuil.com.glidedemo.view.GlideRoundTransform;

public class CircleImageActivity extends AppCompatActivity implements View.OnClickListener {
    RequestManager glideRequest ;
    private ImageView imageView;
    private Context context ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circleimage);
        imageView = (ImageView) findViewById(R.id.imageView);
        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);

        glideRequest = Glide.with(this);

        context = this ;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                glideRequest.load("https://www.baidu.com/img/bdlogo.png").into(imageView);
                break;
            case R.id.button2:
                glideRequest.load("https://www.baidu.com/img/bdlogo.png").transform(new GlideRoundTransform( context)).into(imageView);
                break;
            case R.id.button3:
                glideRequest.load("https://www.baidu.com/img/bdlogo.png").transform(new GlideRoundTransform(context, 16 )).into(imageView);
                break;
            case R.id.button4:
                glideRequest.load("https://www.baidu.com/img/bdlogo.png").transform(new GlideCircleTransform(context)).into(imageView);
                break;
        }
    }
}
