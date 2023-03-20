package coding.insight.login2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


public class Dashboard extends AppCompatActivity {
    public static final String ACCOUNT_SID = "AC669861b72f743084da66fb7741b656a9";
    public static final String AUTH_TOKEN = "889a052bb9fd48de8e3e694a14bd2743";
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