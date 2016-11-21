package br.com.fernandescruz.broadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void logar(View v){
        Intent i = new Intent();
        i.setAction("android.app.action.ACTION_PASSWORD_SUCCEEDED");
        sendBroadcast(i);
    }

    public void broadCast(View v){
        Intent i = new Intent();
        i.setAction("orderedbroadcast");
        sendBroadcast(i);
    }

}
