package pkru.nackchainaeramit.patsiri.mypkru2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static pkru.nackchainaeramit.patsiri.mypkru2.R.id.btnLogin;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit
    private EditText userEditText, passwordEditText;
    private TextView textView;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //Statement
        setContentView(R.layout.activity_main); //Statement

        //Initial View
        initialView();

        //Controller
        controller();


    }   // Main Method

    private void controller() {
        textView.setOnClickListener(this);
        button.setOnClickListener(this);
    }

    private void initialView() {
        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);
        textView = (TextView) findViewById(R.id.txtNewRegister);
        button = (Button) findViewById(R.id.btnLogin);
    }

    @Override
    public void onClick(View v) {

        //For TextView
        if (v == textView) {
            //Intent to NewRegister
            Intent intent = new Intent(MainActivity.this,NewRegisterActivity.class);
            startActivity(intent);
        }

        //for Button
        if (v == button) {
        }


    }
}   // Main Class นี่คือ คลาสหลัก
