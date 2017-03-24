package okky.tugaskomponengui_143040025;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpinnerActivity extends AppCompatActivity {

        private String[] arrDataJurusan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        this.arrDataJurusan = new String[]{
                "Teknik Informatika", "Teknik Pangan", "Teknik Industri", "Teknik Mesin",
                "Teknik Planologi", "Teknik Lingkungan"
        };

        Spinner s = (Spinner) findViewById(R.id.SpinnerT);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrDataJurusan);
        s.setAdapter(adapter);

    }
}
