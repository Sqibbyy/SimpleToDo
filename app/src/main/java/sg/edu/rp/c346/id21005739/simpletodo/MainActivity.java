package sg.edu.rp.c346.id21005739.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etElement;
    Button btn1;
    Button btn2;
    ListView lvThings;
    ArrayList<String>alThings;
    ArrayAdapter<String> aaThings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etElement.findViewById(R.id.editTextElement);
        btn1.findViewById(R.id.button1);
        btn2.findViewById(R.id.button2);
        lvThings.findViewById(R.id.listEvent);

        alThings = new ArrayList<>();

        aaThings = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alThings);
        lvThings.setAdapter(aaThings);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String things = etElement.getText().toString();
                alThings.add(things);
                aaThings.notifyDataSetChanged();
            }
        });
    }
}