package okky.tugaskomponengui_143040025;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class StudyKasus extends AppCompatActivity {
    private String[] arrDataKota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_kasus);

        this.arrDataKota = new String[]{
                "Bandung","Jakarta", "Surabaya", "Malang"
        };

        Spinner s = (Spinner) findViewById(R.id.SpinnerK);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrDataKota);
        s.setAdapter(adapter);

    }
}
