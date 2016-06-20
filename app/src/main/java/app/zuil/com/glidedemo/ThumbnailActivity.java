package app.zuil.com.glidedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.DrawableRequestBuilder;
import com.bumptech.glide.Glide;

/**
 * 缩略图
 */
public class ThumbnailActivity extends AppCompatActivity {

    String url = "http://o7rvuansr.bkt.clouddn.com/big1.jpg" ;
    String ur2 = "http://f.hiphotos.baidu.com/imgad/pic/item/5366d0160924ab18ead18f4832fae6cd7a890b8d.jpg" ;
    private ImageView imageView1 , imageView2  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thumbnail);

        imageView1 = (ImageView) findViewById( R.id.image_thum1 );
        imageView2 = (ImageView) findViewById( R.id.image_thum2 );

        findViewById( R.id.bt1 ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.with( ThumbnailActivity.this ).load( url ).thumbnail( 0.1f ).into( imageView1 ) ;
            }
        });

        //用其它图片作为缩略图
        findViewById( R.id.bt2 ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawableRequestBuilder<Integer> thumbnailRequest = Glide
                        .with( ThumbnailActivity.this )
                        .load(R.mipmap.ic_launcher);
                Glide.with( ThumbnailActivity.this ).load( ur2 ).thumbnail( thumbnailRequest ).into( imageView2 ) ;
            }
        });


    }
}
