package apps.allcolorlife.holamundoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {

    private Handler wait = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

       wait.postDelayed(new Runnable() {
           @Override
           public void run() {
            try {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }catch (Exception E){
                E.printStackTrace();
            }
           }
       },3000);

    }

    protected void onPause(){
    super.onPause();
        Toast.makeText(this, "Sucedio el evento onPause()", Toast.LENGTH_SHORT).show();
    finish();
    }


}
