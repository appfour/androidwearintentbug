package example.com.testapplication;

import android.content.*;
import android.net.*;
import android.os.*;
import android.support.wearable.activity.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends WearableActivity {

    private Button mButtonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonView = (Button) findViewById(R.id.button);

        mButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.google.com";
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}
