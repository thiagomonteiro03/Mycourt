package android.example.mycourt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int pts_a=0;
int pts_b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void three_pts_a (View view)
    {
        pts_a = pts_a + 3;
        display_a(pts_a);
    }

    public void two_pts_a (View view)
    {
        pts_a = pts_a + 2;
        display_a(pts_a);
    }

    public void free_throw_a (View view)
    {
        pts_a++;
        display_a(pts_a);
    }

    public void three_pts_b (View view)
    {
        pts_b = pts_b + 3;
        display_b(pts_b);
    }

    public void two_pts_b (View view)
    {
        pts_b = pts_b + 2;
        display_b(pts_b);
    }

    public void free_throw_b (View view)
    {
        pts_b++;
        display_b(pts_b);
    }
    public void reset_pts (View view)
    {
        pts_a=0;
        pts_b=0;
        display_a(pts_a);
        display_b(pts_b);
    }

    private void display_a(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_a_pts);
        quantityTextView.setText("" + number);
    }
    private void display_b(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_b_pts);
        quantityTextView.setText("" + number);
    }
}
