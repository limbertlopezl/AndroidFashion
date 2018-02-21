package com.example.limbert.fashionapp;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import java.util.Timer;
        import java.util.TimerTask;

public class HomeScreen extends AppCompatActivity {
    Button swiming_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
        swiming_btn =findViewById(R.id.swiming_btn);

        swiming_btn.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(HomeScreen.this, DetailScreen.class);
                startActivity(intent);
            }
        });
    }


}