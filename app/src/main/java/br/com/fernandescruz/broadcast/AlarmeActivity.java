package br.com.fernandescruz.broadcast;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.fernandescruz.broadcast.receiver.AlarmeReceiver;

public class AlarmeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarme);
    }

    private EditText etTempo;

    public void configurar(View view) {

        etTempo = (EditText)findViewById(R.id.edTempo);

        String tempo = etTempo.getText().toString();

        if(!tempo.equals("")){

            Intent i = new Intent(this, AlarmeReceiver.class);

            PendingIntent pi = PendingIntent.getBroadcast(
                    this.getApplicationContext(),
                    1234, i, 0);

            AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

            alarmManager.set(AlarmManager.RTC_WAKEUP,
                    System.currentTimeMillis() + (Integer.parseInt(tempo) * 1000),
                    pi);

            Toast.makeText(this, "Configurado para daqui" + tempo + " segundos.",
                    Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Informe um tempo.",
                    Toast.LENGTH_SHORT).show();
        }


    }
}
