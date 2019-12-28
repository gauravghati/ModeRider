package gauravghati.roadsafety;

import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
    Button button,button2;
    private LocationManager locationManager;
    private LocationListener locationListner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstactivity);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent= new Intent (Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:18.5204,73.8567"));
                startActivity(intent);
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             // In Toast.makeText(getApplicationContext(),"USER ID AND PASS IS CORRECT", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(FirstActivity.this,MainActivity.class);
                startActivity(intent);


            }
            });
        }s



    }


