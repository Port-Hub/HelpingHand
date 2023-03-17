package coding.insight.login2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MedicalHistory extends AppCompatActivity {
    public void gohome(){
        Intent intent =new Intent(this, Dashboard.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_history);
        de.hdodenhof.circleimageview.CircleImageView home = (de.hdodenhof.circleimageview.CircleImageView) findViewById(R.id.profile_image2);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gohome();
            }});
    }
}