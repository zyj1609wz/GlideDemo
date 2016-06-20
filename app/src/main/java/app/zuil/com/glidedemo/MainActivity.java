package app.zuil.com.glidedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.circle).setOnClickListener(this);
        findViewById(R.id.activity2).setOnClickListener(this);
        findViewById(R.id.priorityActivity).setOnClickListener(this);
        findViewById(R.id.thumbnailActivity).setOnClickListener(this);
        findViewById(R.id.gifActivity).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.circle:
                startActivity( new Intent( MainActivity.this , CircleImageActivity.class));
                break;
            case R.id.activity2 :
                startActivity( new Intent( MainActivity.this , Activity2.class));
                break;
            case R.id.priorityActivity :
                startActivity( new Intent( MainActivity.this , PriorityActivity.class));
                break;
            case R.id.thumbnailActivity :
                startActivity( new Intent( MainActivity.this , ThumbnailActivity.class));
                break;
            case R.id.gifActivity :
                startActivity( new Intent( MainActivity.this , GifActivity.class));
                break;
        }
    }
}
