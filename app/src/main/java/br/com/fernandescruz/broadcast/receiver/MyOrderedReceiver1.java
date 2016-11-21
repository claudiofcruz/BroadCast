package br.com.fernandescruz.broadcast.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by claudiocruz on 21/11/16.
 */

public class MyOrderedReceiver1 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Receiver 1",Toast.LENGTH_SHORT).show();
    }
}
