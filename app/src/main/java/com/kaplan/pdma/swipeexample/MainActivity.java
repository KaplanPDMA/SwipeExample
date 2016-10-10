package com.kaplan.pdma.swipeexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

import com.github.pwittchen.swipe.library.Swipe;
import com.github.pwittchen.swipe.library.SwipeListener;

public class MainActivity extends AppCompatActivity {

    private Swipe swipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipe = new Swipe();
        swipe.addListener(new SwipeListener() {
            @Override public void onSwipingLeft(final MotionEvent event) {
            }

            @Override public void onSwipedLeft(final MotionEvent event) {
                Toast.makeText(MainActivity.this, "Swiped left", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Activity3.class);
                startActivity(intent);
            }

            @Override public void onSwipingRight(final MotionEvent event) {
            }

            @Override public void onSwipedRight(final MotionEvent event) {
                Toast.makeText(MainActivity.this, "Swiped Right", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }

            @Override public void onSwipingUp(final MotionEvent event) {
            }

            @Override public void onSwipedUp(final MotionEvent event) {
            }

            @Override public void onSwipingDown(final MotionEvent event) {
            }

            @Override public void onSwipedDown(final MotionEvent event) {
            }
        });

    }

    @Override public boolean dispatchTouchEvent(MotionEvent event) {
        swipe.dispatchTouchEvent(event);
        return super.dispatchTouchEvent(event);
    }
}
