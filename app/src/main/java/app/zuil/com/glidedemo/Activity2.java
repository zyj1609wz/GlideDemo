package app.zuil.com.glidedemo;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;

public class Activity2 extends AppCompatActivity {

    String url = "http://o7rvuansr.bkt.clouddn.com/big1.jpg" ;
    ImageView imageView1 , imageView2 , imageView3 ;
    private static int width  ;
    private static int height ;

    private SimpleTarget target ;
    private ViewGroup.LayoutParams params ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        imageView1 = (ImageView) findViewById( R.id.image1 );
        imageView2 = (ImageView) findViewById( R.id.image2 );
        imageView3 = (ImageView) findViewById( R.id.image3 );
        params = imageView2.getLayoutParams() ;

        //测量图片的
        // 宽高
        width = params.width ;
        height = params.height ;

        //加载第二张图
        findViewById( R.id.bt1 ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.with( Activity2.this).load( url ).into( imageView1 ) ;
            }
        });

        //加载第二张图
        findViewById( R.id.bt2 ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.with( Activity2.this).load( url ).diskCacheStrategy( DiskCacheStrategy.SOURCE ).into( imageView2 ) ;
            }
        });

        //加载第三张图
        findViewById( R.id.bt3 ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.with( Activity2.this).load( url ).into( imageView3 ) ;
            }
        });

        target = new SimpleTarget<Bitmap>( width , height ) {
            @Override
            public void onResourceReady(Bitmap bitmap, GlideAnimation glideAnimation) {
                //图片加载完成
                imageView2.setImageBitmap(bitmap);
            }
        };
    }
}
