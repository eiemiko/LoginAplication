package br.com.etecia.loginaplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_log = findViewById(R.id.btn_log);
        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView lbl_user = findViewById(R.id.lbl_user);
                TextView lbl_pass = findViewById(R.id.lbl_pass);
                String username = lbl_user.getText().toString();
                String password = lbl_pass.getText().toString();

            }
        });
    }
}