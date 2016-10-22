package truemd.com.androidasynchronoushttpclientloopj.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import truemd.com.androidasynchronoushttpclientloopj.R;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button) Button btnLogin;
    @BindView(R.id.button2) Button btnGet;
    @BindView(R.id.button3) Button btnPost;
    @BindView(R.id.button4) Button btnMultipartpost;
    @BindView(R.id.textView) TextView resp;

    @OnClick(R.id.button)
    public void onClick1(Button button) {
        Log.e("Login:","OnClick");

        resp.setText("Login Pressed");
    }

    @OnClick(R.id.button2)
    public void onClick2(Button button) {
        Log.e("Get:","OnClick");

        resp.setText("Get Pressed");

    }

    @OnClick(R.id.button3)
    public void onClick3(Button button) {
        Log.e("Post:","OnClick");

        resp.setText("Post Pressed");

    }

    @OnClick(R.id.button4)
    public void onClick4(Button button) {
        Log.e("MPost:","OnClick");

        resp.setText("MPost Pressed");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }
}
