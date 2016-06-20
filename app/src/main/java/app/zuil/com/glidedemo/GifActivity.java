package app.zuil.com.glidedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class GifActivity extends AppCompatActivity {

    String url = "http://o91woxvtr.bkt.clouddn.com/liuyan.gif" ;
    private ImageView imageView1 , imageView2  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif);
        imageView1 = (ImageView) findViewById( R.id.image_gif1 ) ;
        imageView2 = (ImageView) findViewById( R.id.image_gif2 ) ;

        Glide.with( this ).load( url ).into( imageView1 ) ;
        Glide.with( this ).load( url ).asGif().into( imageView2 ) ;
    }
}
