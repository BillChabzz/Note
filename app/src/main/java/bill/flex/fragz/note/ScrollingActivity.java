package bill.flex.fragz.note;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

public class ScrollingActivity extends AppCompatActivity {

    private FloatingActionMenu menu1;
    private FloatingActionButton fab1;
    private FloatingActionButton fab2;
    private FloatingActionButton fab3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        menu1 = (FloatingActionMenu)findViewById(R.id.menu1);
        fab1 =(FloatingActionButton)findViewById(R.id.fab1);
        fab2 =(FloatingActionButton)findViewById(R.id.fab2);
        fab3 =(FloatingActionButton)findViewById(R.id.fab3);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(ScrollingActivity.this, TabActivity.class);
                startActivity(m);
            }
        });

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(ScrollingActivity.this, ScrollingActivity.class);
                startActivity(n);
            }
        });
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(ScrollingActivity.this, Main2Activity.class);
                startActivity(b);
            }
        });

    }
}
