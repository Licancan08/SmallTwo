package licancan.com.smalltwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ChangeNewsActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView change_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_news);
        initView();
    }

    private void initView() {
        change_back = findViewById(R.id.change_back);
        change_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.change_back:
                finish();
                break;
        }
    }
}
