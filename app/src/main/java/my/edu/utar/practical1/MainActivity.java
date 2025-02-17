package my.edu.utar.practical1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        TextView text = new TextView(this);
        text.setText("Please enter your name");
        EditText edit = new EditText(this);

        TextView text2 = new TextView(this);
        text.setText("Select your colors:");

        TextView text3 = new TextView(this);
        text.setText("Select your course:");


        LinearLayout ll = new LinearLayout(this);
        LinearLayout ll2 = new LinearLayout(this);
        LinearLayout ll3 = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.addView(text);
        ll.addView(edit);
        setContentView(ll);
    }
}