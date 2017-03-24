package okky.tugaskomponengui_143040025;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView    list;
    String  []  titles;
    String  []  description;
    int     []  imgs = {
            R.drawable.satu,R.drawable.dua,R.drawable.tiga,R.drawable.empat,R.drawable.lima,R.drawable.enam,
            R.drawable.tujuh,R.drawable.delapan
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //get resources
        Resources res = getResources();

        //initialisation array in resources
        titles      = res.getStringArray(R.array.titles);
        description = res.getStringArray(R.array.description);

        //initialisation id in xml
        list        = (ListView) findViewById(R.id.list1);

        //get myadapter
        MyAdapter adapter = new MyAdapter(this, titles, imgs, description);
        list.setAdapter(adapter);

        //move activity
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int
                    position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this,
                                ButtonActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this,
                                EditTextActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this,
                                CheckBoxActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this,
                                RadioButtonActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this,
                                SpinnerActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(MainActivity.this,
                                PickerActivity.class));
                        break;
                    case 6:
                        startActivity(new Intent(MainActivity.this,
                                StudyKasus.class));
                        break;
                    case 7:
                        startActivity(new Intent(MainActivity.this,
                                TugasKeDua.class));
                        break;
                }
            }
        });
    }

    //class custome arrayadapter
    class MyAdapter extends ArrayAdapter<String>{
        Context     context;
        int[]       imgs;
        String[]    myTitles;
        String[]    myDescription;

        MyAdapter(Context c, String[] titles, int[] imgs, String[] description){
            super(c, R.layout.row, R.id.text1, titles);
            this.context        = c;
            this.imgs           = imgs;
            this.myDescription  = description;
            this.myTitles       = titles;
        }
        public View getView(int position, View convertView, ViewGroup parent){
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row                = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images        = (ImageView) row.findViewById(R.id.icon);
            TextView myTitle        = (TextView) row.findViewById(R.id.text1);
            TextView myDescription  = (TextView) row.findViewById(R.id.text2);
            images.setImageResource(imgs[position]);
            myTitle.setText(titles[position]);
            myDescription.setText(description[position]);
            return row;
        }
    }
}
