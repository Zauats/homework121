package com.example.homework121;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView name;
    EditText email;
    TextView total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        total = findViewById(R.id.total);
    }

    public void okClick(View view) {
        email.setText("");
        name.setText("");
        total.setText("Подписка оформлена");
    }

    public  void clearClick(View view) {
        email.setText("");
        name.setText("");
        total.setText("Поля очищены");
    }
}
