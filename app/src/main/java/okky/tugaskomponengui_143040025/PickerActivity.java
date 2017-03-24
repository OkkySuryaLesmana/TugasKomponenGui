package okky.tugaskomponengui_143040025;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class PickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker);

        findViewById(R.id.buttonDatePicker).setOnClickListener(new
            View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Calendar newCalendar = Calendar.getInstance();
                    DatePickerDialog datePickerDialog = new
                            DatePickerDialog(PickerActivity.this, new DatePickerDialog.OnDateSetListener() {

                        public void onDateSet(DatePicker view, int year, int
                                monthOfYear, int dayOfMonth) {
                            Calendar newDate = Calendar.getInstance();
                            newDate.set(year, monthOfYear, dayOfMonth);
                            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd MMMM yyyy", Locale.US);
                                    Toast.makeText(PickerActivity.this,dateFormatter.format(newDate.getTime()),Toast.LENGTH_SHORT).show();
                        }
                    },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH),
                            newCalendar.get(Calendar.DAY_OF_MONTH));                 datePickerDialog.show();
                }
            });

        findViewById(R.id.buttonTimePicker).setOnClickListener(new
                View.OnClickListener() {
                @Override
                    public void onClick(View v) {
                        Calendar newCalendar = Calendar.getInstance();
                        TimePickerDialog timePickerDialog = new
                        TimePickerDialog(PickerActivity.this, new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay, int
                            minute) {
                                String nowTime = ""+hourOfDay +":"+ minute ;
                                Toast.makeText(PickerActivity.this,nowTime,Toast.LENGTH_SHORT).show();
                            }
                        },newCalendar.get(Calendar.HOUR_OF_DAY),
                                newCalendar.get( Calendar. MINUTE ) ,
                                DateFormat. is24HourFormat ( PickerActivity.this ));
                                timePickerDialog.show();
                            }
                        }) ;
        }
}
