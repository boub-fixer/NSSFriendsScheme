package ug.blogspot.boubandroid.nssfriendsscheme;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.*;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String memberNames[] = {"Tusiime Anitah",
            "Tusiime Boub",
            "Allen Pressy",
            "Azubed Baruku",
            "Kwesiga Apollo",
            "Kobusingye Nazra",
            "Katongole Tadeo"
    };

    String myQuotes[] = {"Life is 10% what happens to you and 90% how you react to it.",
            "Good, better, best. Never let it rest. 'Till your good is better and your better is best.",
            "With the new day comes new strength and new thoughts.",
            "In order to succeed, we must first believe that we can.",
            "Keep your eyes on the stars, and your feet on the ground."
    };

    TextView memberName;
    Button shuffleBtn;
    int RandomName;
    TextView quoteOfTheDay;
    int RandomQuote;
    RelativeLayout background;
    Button greenBtn;
    Button blueBtn;
    Button revertBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shuffleBtn = (Button) findViewById(R.id.shuffle);
        quoteOfTheDay = (TextView) findViewById(R.id.quote);
        memberName = (TextView) findViewById(R.id.winner);
        background=(RelativeLayout)findViewById(R.id.background);
        greenBtn=(Button)findViewById(R.id.greenBtn);
        blueBtn=(Button)findViewById(R.id.blueBtn);
        revertBtn=(Button)findViewById(R.id.revertBtn);


        shuffleBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Perform action on click
                Random rand2 = new Random();
                RandomName = rand2.nextInt(memberNames.length);
                memberName.setText(memberNames[RandomName]);

                Random rand = new Random();
                RandomQuote = rand.nextInt(myQuotes.length);
                quoteOfTheDay.setText(myQuotes[RandomQuote]);
            }
        });

        greenBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.parseColor("#B9F6CA"));
            }
        });

        blueBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.parseColor("#82B1FF"));
            }
        });

        revertBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.parseColor("#FCE4EC"));
            }
        });
    }
}

/*
public class MainActivity extends Activity
{

String memberNames[] = {"Tusiime Anitah",

"Tusiime Boub",

"Allen Pressy",

"Kwesiga Apollo",

"Kobusingye Nazra",

"Katongole Tadeo"

};



String myQuotes[] = {"Life is 10% what happens to you and 90% how you react to it.",

"Good, better, best. Never let it rest. 'Till your good is better and your better is best.",

"With the new day comes new strength and new thoughts.",

"In order to succeed, we must first believe that we can.",

"Keep your eyes on the stars, and your feet on the ground."

};



TextView myFavQuotes2;

Button main2;

int RandomNumber2;

TextView myFavQuotes;

int RandomNumber;

RelativeLayout background;

Button greenBtn;

Button blueBtn;

Button revertBtn;



@Override

protected void onCreate(Bundle savedInstanceState)
	{

super.onCreate(savedInstanceState);

setContentView(R.layout.main);



main2 = (Button) findViewById(R.id.button2); // link to button we id'd button.

myFavQuotes = (TextView) findViewById(R.id.quote); // link to textview we id'd quote.

myFavQuotes2 = (TextView) findViewById(R.id.quote2); // link to textview we id'd quote.

background=(RelativeLayout)findViewById(R.id.background);

greenBtn=(Button)findViewById(R.id.greenBtn);

blueBtn=(Button)findViewById(R.id.blueBtn);

revertBtn=(Button)findViewById(R.id.revertBtn);




main2.setOnClickListener(new View.OnClickListener() {

public void onClick(View v) {

// Perform action on click

Random rand2 = new Random();

RandomNumber2 = rand2.nextInt(memberNames.length);

myFavQuotes2.setText(memberNames[RandomNumber2]);


Random rand = new Random();

RandomNumber = rand.nextInt(myQuotes.length);

myFavQuotes.setText(myQuotes[RandomNumber]);

}

});



greenBtn.setOnClickListener(new View.OnClickListener() {


@Override

public void onClick(View view) {


//Click button code goes here

background.setBackgroundColor(Color.parseColor("#B9F6CA"));

}

});



blueBtn.setOnClickListener(new View.OnClickListener() {


@Override

public void onClick(View vew) {

background.setBackgroundColor(Color.parseColor("#82B1FF"));

}

});



revertBtn.setOnClickListener(new View.OnClickListener() {


@Override

public void onClick(View vew) {

background.setBackgroundColor(Color.parseColor("#FCE4EC"));

}

});

}

}
*/