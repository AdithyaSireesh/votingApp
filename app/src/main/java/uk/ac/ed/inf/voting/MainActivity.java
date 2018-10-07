package uk.ac.ed.inf.voting;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer tally = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void upvote(View view) {

        textView = (TextView) (findViewById(R.id.total));

        tally++;
        textView.setText(String.valueOf(tally));
        /*if (tally == 0){

            textView.setTextColor(Color.parseColor("#FF0000"));
            tally=1;
        }else{
            textView.setTextColor(Color.parseColor("#0000FF"));
            tally=0;
        }*/
    }

    public void downvote(View view) {

        textView = (TextView) (findViewById(R.id.total));

        tally--;
        textView.setText(String.valueOf(tally));
    }
}
        /*if (tally == 0){
    }
    // Wire up the button to do stuff
    // .. get button
    // .. set what the button needs to do

}*/
