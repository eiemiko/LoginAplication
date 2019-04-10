package br.com.etecia.loginaplication;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_log = findViewById(R.id.btn_log);
        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                    TextView txt_user = findViewById(R.id.txt_user);
                    TextView txt_pass = findViewById(R.id.txt_pass);
                    TextView txtteste = findViewById(R.id.txtteste);
                    String username = txt_user.getText().toString();
                    String password = txt_pass.getText().toString();

                        if (username.equals("etecia") & password.equals("etecia")){
                            System.out.println("logado com sucesso");

                            Intent intentGoHome = new Intent(MainActivity.this, HomeActivity.class);
                            startActivity(intentGoHome);
                        }
                        else{
                            System.out.println("erro");
                            //txtteste.setText("Login ou Senha incorretos");
                            alert("Deu ruim");
                        }
            }

        });
    }
    private void alert (String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }
}