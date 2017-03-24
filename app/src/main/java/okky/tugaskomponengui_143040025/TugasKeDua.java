package okky.tugaskomponengui_143040025;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class TugasKeDua extends AppCompatActivity {

    String[] arrKota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas_ke_dua);

        this.arrKota = new String[]{
                "Bandung", "Jakarta", "Semarang", "Papua", "Makasar", "Yogyakarta", "Riau", "Palembang"
        };

        Spinner s = (Spinner) findViewById(R.id.spinnerTKD);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrKota);
        s.setAdapter(adapter);
    }
}
