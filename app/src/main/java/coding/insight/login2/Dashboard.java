package coding.insight.login2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class Dashboard extends AppCompatActivity {
    public void openMedhistory(){
        Intent intent =new Intent(this, MedicalHistory.class);
        startActivity(intent);
    }
    public void hpls(){
        Intent intent =new Intent(this, Hospital.class);
        startActivity(intent);
    }
    public void con(){
        Intent intent =new Intent(this, EContact.class);
        startActivity(intent);
    }
    public void heart(){
        Intent intent =new Intent(this, heartrate.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        LinearLayout emergency = (LinearLayout) findViewById(R.id.EmergencyContacts);
        LinearLayout hospital = (LinearLayout) findViewById(R.id.Hospitals);
        LinearLayout med = (LinearLayout) findViewById(R.id.MedHistory);
        LinearLayout hr = (LinearLayout) findViewById(R.id.LiveHeart);
        hr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                heart();

//                Toast.makeText(Dashboard.this,"Hospital",Toast.LENGTH_SHORT).show();
            }});
        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hpls();
//                Toast.makeText(Dashboard.this,"Hospital",Toast.LENGTH_SHORT).show();
        }});
        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(Dashboard.this,"Emergency",Toast.LENGTH_SHORT).show();
                con();
            }});
        med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(Dashboard.this,"MedHistory",Toast.LENGTH_SHORT).show();
                openMedhistory();
            }});

    }
}