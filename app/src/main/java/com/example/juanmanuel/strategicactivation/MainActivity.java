package com.example.juanmanuel.strategicactivation;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View;
import android.support.v4.app.NotificationCompat;
import android.app.NotificationManager;
import android.graphics.drawable.BitmapDrawable;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton,radioButton1;
    private Button next;
    private Button next2;
    private Button next3;
    TextView TV;
    RadioButton Ra1;
    private static final int NOTIF_ALERTA_ID = 1;
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TV = (TextView) findViewById(R.id.textView3);
        String font_path = "fonts/IndieFlower.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(),font_path);
        TV.setTypeface(TF);
        Ra1 = (RadioButton) findViewById(R.id.radioButton4);
        Ra1.setTypeface(TF);
        Welcome.myWelcome(context);
        radioButton=(RadioButton)findViewById(R.id.radioButton4);
        radioButton1=(RadioButton)findViewById(R.id.radioButton5);
        radioButton1.setTypeface(TF);
        next=(Button)findViewById(R.id.button);
        next.setTypeface(TF);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioButton.isChecked()){
                    Intent intent = new Intent(context, Main2Activity.class);
                    startActivity(intent);
                }else if(radioButton1.isChecked()){
                    Intent intent = new Intent(context, Main3Activity.class);
                    startActivity(intent);
                }

            }
        });


        next2 = (Button) findViewById(R.id.button2);
        next3 = (Button) findViewById(R.id.button3);
        next2.setTypeface(TF);
        next3.setTypeface(TF);
        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Main4Activity.class);
                startActivity(intent);
            }
        });
        next2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Welcome.myNotification(context);
                new Thread()
                {
                    public void run()
                    {
                        try
                        {
                            //espera de 3 segundos para que de tiempo a ver el progress
                            //Add 60 seconds whait for show Notification
                            Thread.sleep(60000);
                            NotificationCompat.Builder mBuilder =
                                    new NotificationCompat.Builder(MainActivity.this)
                                            .setSmallIcon(android.R.drawable.stat_sys_warning)
                                            .setLargeIcon((((BitmapDrawable)getResources()
                                                    .getDrawable(R.mipmap.ic_launcher)).getBitmap()))
                                            .setContentTitle("¡Es Hora!")
                                            .setContentText("No pierdas tiempo y toma tu descanso")
                                            .setContentInfo("4")
                                            .setTicker("Alerta!");

                            NotificationManager mNotificationManager =
                                    (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                            mNotificationManager.notify(NOTIF_ALERTA_ID, mBuilder.build());


                        }
                        catch (Exception ex)
                        {

                        }
                    }

                }.start();
            }


        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
