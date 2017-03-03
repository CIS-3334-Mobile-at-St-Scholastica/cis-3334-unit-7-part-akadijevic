package css.cis3334.heartratetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {

   TextView tvDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tvDetails = (TextView) findViewById(R.id.textViewDetails);

        Intent intent = getIntent();
        String value = intent.getStringExtra("Details");
        tvDetails.setText("Heart Rate Details \n" + value);


    }
}
