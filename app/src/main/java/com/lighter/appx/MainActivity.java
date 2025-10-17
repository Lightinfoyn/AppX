package com.lighter.appx;

// Android core classes
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * MainActivity - the first screen of AppX.
 *
 * Story-like explanation:
 *  - When the app opens, Android creates an instance of MainActivity.
 *  - onCreate() is called by the system. Think of it as "build the scene".
 *  - setContentView(...) tells Android which XML layout to inflate into UI objects.
 *  - findViewById(...) finds the visual elements so we can talk to them from Java code.
 *  - We set a click listener on the button, so when the user taps, we change the TextView.
 */
public class MainActivity extends AppCompatActivity {

    // Fields refer to UI elements (we'll connect them in onCreate)
    private TextView textViewMessage;
    private Button buttonSayHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Always call the parent method first
        super.onCreate(savedInstanceState);

        // Inflate activity_main.xml and make its content visible
        setContentView(R.layout.activity_main);

        // --- Link Java variables to the actual UI elements (created from XML) ---
        textViewMessage = findViewById(R.id.textViewMessage);
        buttonSayHello = findViewById(R.id.buttonSayHello);

        // --- Set the behavior when the button is clicked ---
        buttonSayHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                 When user taps the button, this code runs.
                 We change the text of the TextView to a friendly greeting.
                */
                textViewMessage.setText(getString(R.string.hello_message));
            }
        });
    }
}
