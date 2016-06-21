package app.zuil.com.glidedemo;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * 只能加载本地视频，只能加载一个图片，不能播放
 * 网络视频无法加载
 */

public class VideoActivity extends AppCompatActivity {
    private ImageView imageView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        imageView = (ImageView) findViewById( R.id.image_video );
        String files = Environment.getExternalStorageDirectory().getAbsolutePath() + "/yueyu.mkv" ;
        Glide.with( this ).load( files ).into( imageView ) ;
    }
}
