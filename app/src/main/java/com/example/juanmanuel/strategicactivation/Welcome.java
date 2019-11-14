package com.example.juanmanuel.strategicactivation;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Juan Manuel and Rodrigo Ramirez on 14/11/2017.
 */

public class Welcome {


    public static void myWelcome(Context context) {
        /* Show Message at APK Opend */
        Toast.makeText(context, "Bienvenido a Strategic Activation",Toast.LENGTH_LONG).show();
    }
    public static void myNotification(Context context){
         /* Show Message at APK Opend */
        Toast.makeText(context, "Notificacion Activada",Toast.LENGTH_SHORT).show();

    }
    public static void DisableNotification(Context context){
         /* Show Message at APK Opend */
        Toast.makeText(context, "Notificacion Desactivada",Toast.LENGTH_SHORT).show();
    }
}

