package cc.foxtail.phonenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.phonenumber_layout);

        final Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);
        Button btn5 = (Button) findViewById(R.id.button5);
        Button btn6 = (Button) findViewById(R.id.button6);
        Button btn7 = (Button) findViewById(R.id.button7);
        Button btn8 = (Button) findViewById(R.id.button8);
        Button btn9 = (Button) findViewById(R.id.button9);

        ImageButton btn10= (ImageButton) findViewById(R.id.button10);
        ImageButton btn11= (ImageButton) findViewById(R.id.button11);
        ImageButton btn12= (ImageButton) findViewById(R.id.button12);
        ImageButton btn13= (ImageButton) findViewById(R.id.button13);
        ImageButton btn14= (ImageButton) findViewById(R.id.button14);
        ImageButton btn15= (ImageButton) findViewById(R.id.button15);
        final TextView phoneNumberTextView= (TextView) findViewById(R.id.phoneNumberTextView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
