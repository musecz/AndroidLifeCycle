package io.tailorweb.androidlifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends LoggingActivity {

    public MainActivity() {
        setActivityName("MainActivity");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button opaqueActivityButton = (Button) findViewById(R.id.opaqueButton);
        opaqueActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpaqueActivity.class);
                startActivity(intent);
            }
        });
        Button transparentActivityButton = (Button) findViewById(R.id.transparentButton);
        transparentActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TransparentActivity.class);
                startActivity(intent);
            }
        });

    }
}
