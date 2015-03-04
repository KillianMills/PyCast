package killianmills.pycast;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class ConnectionSettings extends Activity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection_settings);
    }

}