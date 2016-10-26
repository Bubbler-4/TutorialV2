package hanjo.tutorialv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private TextView textView;
    private Integer i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        i = 0;
        textView.setText(String.format(Locale.US, "%d", i));

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        i += 1;
        textView.setText(String.format(Locale.US, "%d", i));
    }
}
