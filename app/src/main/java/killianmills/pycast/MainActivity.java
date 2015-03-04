package killianmills.pycast;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    Button connect;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //For 4 buttons on main menu
        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton4();
    }

    // CONNECTION SETTINGS
    public void addListenerOnButton1() {

        final Context context = this;

        connect = (Button) findViewById(R.id.connectionButton);

        connect.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, ConnectionSettings.class);
                startActivity(intent);

            }

        });

    }

    // GENERAL MODE
    public void addListenerOnButton2() {

        final Context context = this;

        connect = (Button) findViewById(R.id.generalButton);

        connect.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, GeneralMode.class);
                startActivity(intent);

            }

        });

    }

    // PRESENTATION MODE
    public void addListenerOnButton3() {

        final Context context = this;

        connect = (Button) findViewById(R.id.presentationButton);

        connect.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, PresentationMode.class);
                startActivity(intent);

            }

        });

    }

    // ABOUT
    public void addListenerOnButton4() {

        final Context context = this;

        connect = (Button) findViewById(R.id.aboutButton);

        connect.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, About.class);
                startActivity(intent);

            }

        });

    }

}
