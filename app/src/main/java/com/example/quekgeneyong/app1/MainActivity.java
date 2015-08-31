package com.example.quekgeneyong.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView jokeQuestionText = (TextView) findViewById(R.id.joke_question_text);
        final TextView punchlineText = (TextView) findViewById(R.id.punchline_text);
        Button showPunchLineButton = (Button) findViewById(R.id.show_punchline_button);

        jokeQuestionText.setText("Dad, did you get a haircut?");
        punchlineText.setText("No, I got them all cut");
        punchlineText.setVisibility(View.INVISIBLE);

        showPunchLineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                punchlineText.setVisibility(View.VISIBLE);
                log.dl("SST","The Button was clicked!");

            }
        }

    }
}

