package com.example.ivan.mosbyexploring.View;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ivan.mosbyexploring.Presnter.GreetingPresenter;
import com.example.ivan.mosbyexploring.R;
import com.example.ivan.mosbyexploring.View.Greeting;
import com.hannesdorfmann.mosby.mvp.MvpActivity;

public class MainActivity extends MvpActivity<Greeting, GreetingPresenter> implements Greeting {

    TextView greetingTxtv;
    Button sayHelloBtn;
    Button sayGoodbyeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        greetingTxtv = (TextView)findViewById(R.id.greeting_textv);
        sayHelloBtn = (Button)findViewById(R.id.say_hello_btn);
        sayGoodbyeBtn = (Button)findViewById(R.id.say_goodbye_btn);

        sayHelloBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.showHello();
            }
        });

        sayGoodbyeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.showGoodbye();
            }
        });
    }


    @NonNull
    @Override
    public GreetingPresenter createPresenter() {
        return new GreetingPresenter();
    }


    @Override
    public void showHello(String hello) {
        greetingTxtv.setText(hello);
    }

    @Override
    public void showGoodbye(String goodbye) {
        greetingTxtv.setText(goodbye);
    }
}
