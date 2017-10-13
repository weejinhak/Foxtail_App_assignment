package cc.foxtail.phonenumber;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {

    private Button button[] = new Button[12];
    private int[] buttonIds = {R.id.button0, R.id.button1, R.id.button2, R.id.button3, R.id.button4,
            R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9,
            R.id.button10, R.id.button11};
    private ImageButton buttonback;
    private TextView phoneNumberTextView;
    private StringBuilder phoneText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.phonenumber_layout);

        buttonback = (ImageButton) findViewById(R.id.button18);
        buttonback.setVisibility(View.INVISIBLE);
        phoneNumberTextView = (TextView) findViewById(R.id.phoneNumberTextView);
        phoneText = new StringBuilder();

        for (int i = 0; i < buttonIds.length; i++) {
            final int index;
            index = i;
            button[index] = (Button) findViewById(buttonIds[index]);
            button[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(phoneText.length()>12){
                        Toast.makeText(getApplicationContext(),"번호가너무길어!",Toast.LENGTH_SHORT).show();
                    }
                    phoneText.append(button[index].getText());
                    phoneNumberTextView.setText(phoneText);
                    buttonback.setVisibility(View.VISIBLE);
                }
            });
        }

        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneText.delete(phoneText.length() - 1, phoneText.length());
                phoneNumberTextView.setText(phoneText);
                if (phoneText.length() == 0) {
                    buttonback.setVisibility(View.INVISIBLE);
                }
            }
        });

    }


}
