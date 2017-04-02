package com.example.owner.lab6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Text;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button clearButton, deleteButton, rightBracketButton, leftBracketButton, oneButton, twoButton,
    threeButton, fourButton, fiveButton, sixButton, sevenButton, eightButton, nineButton, plusButton,
    minusButton, divideButton, multiplyButton, enterButton;
    TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tView = (TextView) findViewById(R.id.main_view);
        clearButton = (Button) findViewById(R.id.clear);
        deleteButton = (Button) findViewById(R.id.delete);
        rightBracketButton = (Button) findViewById(R.id.right_bracket);
        leftBracketButton = (Button) findViewById(R.id.left_bracket);
        oneButton = (Button) findViewById(R.id.one);
        twoButton = (Button) findViewById(R.id.two);
        threeButton = (Button) findViewById(R.id.three);
        plusButton = (Button) findViewById(R.id.plus);
    }

    public void updateOne(View view) {
        tView.setText(tView.getText() + "1");
    }

    public void clearView(View view) {
        tView.setText("0");
    }

    public void deleteView(View view) {
        CharSequence current = tView.getText();
        int len = tView.length();
        //tView.setText(current, 0, (len-1));
    }

    public void updateRightBracket(View view) {
        tView.append("(");
    }

    public void updateLeftBracket(View view) {
        tView.append(")");
    }

    public void updateTwo(View view) {
        tView.append("2");
    }

    public void updateThree(View view) {
        tView.append("3");
    }

    public void updatePlus(View view) {
        tView.append("+");
    }
}
