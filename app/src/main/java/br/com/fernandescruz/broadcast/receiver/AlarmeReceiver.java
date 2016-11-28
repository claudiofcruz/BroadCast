package br.com.fernandescruz.broadcast.receiver;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.provider.Settings;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

import br.com.fernandescruz.broadcast.AlarmeActivity;
import br.com.fernandescruz.broadcast.R;

/**
 * Created by claudiocruz on 21/11/16.
 */

public class AlarmeReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Alarme disparado",
                Toast.LENGTH_SHORT).show();
        enviarNotificacao(context);
    }

    private void enviarNotificacao(Context context){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);

        builder.setContentIntent(PendingIntent.getActivity(context,
                0, new Intent(context, AlarmeActivity.class),
                        PendingIntent.FLAG_UPDATE_CURRENT));
        builder.setContentTitle("Alarme Disparado");
        builder.setContentText("Seu alarme foi disparado com sucesso.");
        builder.setTicker("Nova mesagem!!");
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setAutoCancel(true);

        builder.setVibrate(new long[]{150,300,150,600});

        Uri som = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        Ringtone toque = RingtoneManager.getRingtone(context,som);
        toque.play();

        NotificationManager manager = (NotificationManager)
                context.getSystemService(Context.NOTIFICATION_SERVICE);


        manager.notify(100,builder.build());


    }


}
