package css.cis3334.heartratetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    TextView tvDetailRange;
    TextView tvDetailPulse;
    String range;
    String pulse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tvDetailRange = (TextView) findViewById(R.id.textViewDetailsRange);
        tvDetailPulse = (TextView) findViewById(R.id.textViewDetailsPulse);

        Bundle extras = getIntent().getExtras();

       range = extras.getSerializable("DetailsRange").toString();
        pulse = extras.getSerializable("DetailsPulse").toString();

        tvDetailRange.setText("Range Details: \n" + range);
        tvDetailPulse.setText("Pulse Details: \n" + pulse);



    }
}
