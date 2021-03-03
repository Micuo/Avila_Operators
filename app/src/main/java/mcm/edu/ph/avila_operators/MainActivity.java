package mcm.edu.ph.avila_operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;
        display = findViewById(R.id.displayTxt);

        int birthYear = 2003;
        int birthMonth = 5;
        int birthDay = 17;

        int currentYear = 2021;
        int currentMonth = 3;
        int currentDay = 3;

        int ageInYears, ageInMonths, ageInDays;

        ageInYears = currentYear - birthYear;
        ageInMonths = currentMonth - birthMonth;
        ageInDays = currentDay - birthDay;

        display.setText("My precise age is"+
                String.valueOf(ageInYears)+
                "Years\n"+
                String.valueOf(ageInMonths)+
                "Months\n"+
                String.valueOf(ageInDays)+
                "Days\n");

    }
}