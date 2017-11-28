package licancan.com.smalltwo;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class IdeaTellActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView idea_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idea_tell);
        initView();
    }

    private void initView() {
        idea_back = findViewById(R.id.idea_back);
        idea_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.idea_back:
                finish();
                break;
        }
    }
}
