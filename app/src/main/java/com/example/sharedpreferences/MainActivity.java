package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = getPreferences(MODE_PRIVATE);
        editText = findViewById(R.id.edtText);
    }

    public void salvar(View view) {
        String txt = editText.getText().toString();

        SharedPreferences.Editor e = sp.edit();
        e.putString("txt",txt);
        e.commit();
    }

    public void recuperar(View view) {
        String txt = sp.getString("txt","");
        editText.setText(txt);
    }
}