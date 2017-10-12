package cc.foxtail.phonenumber;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.LogPrinter;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import static android.R.attr.id;
public class MainActivity extends FragmentActivity {


    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnStar;
    private Button btnSharp;

    private ImageButton btnback;
    private TextView phoneNumberTextView;
    private StringBuilder phontext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.phonenumber_layout);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn0 = (Button) findViewById(R.id.button0);
        btnStar= (Button) findViewById(R.id.buttonStar);
        btnSharp= (Button) findViewById(R.id.buttonSharp);


        btnback= (ImageButton) findViewById(R.id.buttonBack);
        btnback.setVisibility(View.INVISIBLE);
        phoneNumberTextView= (TextView) findViewById(R.id.phoneNumberTextView);
        phontext = new StringBuilder();

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
