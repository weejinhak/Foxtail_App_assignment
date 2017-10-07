package cc.foxtail.phonenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.LogPrinter;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.phonenumber_layout);

        final Button btn1 = (Button) findViewById(R.id.button1);
        final Button btn2 = (Button) findViewById(R.id.button2);
        final Button btn3 = (Button) findViewById(R.id.button3);
        final Button btn4 = (Button) findViewById(R.id.button4);
        final Button btn5 = (Button) findViewById(R.id.button5);
        final Button btn6 = (Button) findViewById(R.id.button6);
        final Button btn7 = (Button) findViewById(R.id.button7);
        final Button btn8 = (Button) findViewById(R.id.button8);
        final Button btn9 = (Button) findViewById(R.id.button9);
        final Button btn0 = (Button) findViewById(R.id.button0);
        final Button btnStar= (Button) findViewById(R.id.buttonStar);
        final Button btnSharp= (Button) findViewById(R.id.buttonSharp);


        final ImageButton btn10= (ImageButton) findViewById(R.id.button10);
        final ImageButton btn11= (ImageButton) findViewById(R.id.button11);
        final ImageButton btn12= (ImageButton) findViewById(R.id.button12);
        final ImageButton btn13= (ImageButton) findViewById(R.id.button13);
        final ImageButton btn14= (ImageButton) findViewById(R.id.button14);
        final ImageButton btn15= (ImageButton) findViewById(R.id.button15);
        final ImageButton btnback= (ImageButton) findViewById(R.id.buttonBack);
        btnback.setVisibility(View.INVISIBLE);
        final TextView phoneNumberTextView= (TextView) findViewById(R.id.phoneNumberTextView);
        final StringBuilder phontext = new StringBuilder();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phontext.append(btn1.getText());
                phoneNumberTextView.setText(phontext);
                btnback.setVisibility(View.VISIBLE);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phontext.append(btn2.getText());
                phoneNumberTextView.setText(phontext);
                btnback.setVisibility(View.VISIBLE);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                phontext.append(btn3.getText());
                phoneNumberTextView.setText(phontext);
                btnback.setVisibility(View.VISIBLE);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                phontext.append(btn4.getText());
                phoneNumberTextView.setText(phontext);
                btnback.setVisibility(View.VISIBLE);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                phontext.append(btn5.getText());
                phoneNumberTextView.setText(phontext);
                btnback.setVisibility(View.VISIBLE);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                phontext.append(btn6.getText());
                phoneNumberTextView.setText(phontext);
                btnback.setVisibility(View.VISIBLE);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                phontext.append(btn7.getText());
                phoneNumberTextView.setText(phontext);
                btnback.setVisibility(View.VISIBLE);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                phontext.append(btn8.getText());
                phoneNumberTextView.setText(phontext);
                btnback.setVisibility(View.VISIBLE);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                phontext.append(btn9.getText());
                phoneNumberTextView.setText(phontext);
                btnback.setVisibility(View.VISIBLE);
            }
        });
        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                phontext.append(btn0.getText());
                phoneNumberTextView.setText(phontext);
                btnback.setVisibility(View.VISIBLE);
            }
        });
        btnStar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                phontext.append(btnStar.getText());
                phoneNumberTextView.setText(phontext);
                btnback.setVisibility(View.VISIBLE);
            }
        });
        btnSharp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                phontext.append(btnSharp.getText());
                phoneNumberTextView.setText(phontext);
                btnback.setVisibility(View.VISIBLE);
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phontext.delete(phontext.length()-1,phontext.length());
                Log.d(String.valueOf(phontext.length()), String.valueOf(phontext.length()));
                phoneNumberTextView.setText(phontext);
                if(phontext.length()==0){
                    btnback.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}
