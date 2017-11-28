package licancan.com.smalltwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CheapActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView cheap_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheap);
        initView();
    }

    private void initView() {
        cheap_back = findViewById(R.id.cheap_back);
        cheap_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.cheap_back:
                finish();
                break;
        }
    }

}
