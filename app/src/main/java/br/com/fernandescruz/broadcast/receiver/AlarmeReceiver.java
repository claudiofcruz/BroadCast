package br.com.fernandescruz.broadcast.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.widget.Toast;

/**
 * Created by claudiocruz on 21/11/16.
 */

public class AlarmeReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Alarme disparado",
                Toast.LENGTH_SHORT).show();
        System.out.println("Alarme disparado");
    }
}
