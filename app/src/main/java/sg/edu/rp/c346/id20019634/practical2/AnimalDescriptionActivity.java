package sg.edu.rp.c346.id20019634.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AnimalDescriptionActivity extends AppCompatActivity {

    TextView tvAnimalName, tvDescription, tvUrl;
    ImageView ivAnimal;
    Button btnHome;

    float fontSize = 20f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_description);

        tvAnimalName = findViewById(R.id.textViewName);
        tvDescription = findViewById(R.id.textViewDetails);
        tvUrl = findViewById(R.id.textViewUrl);
        ivAnimal = findViewById(R.id.imageViewAnimal);
        btnHome = findViewById(R.id.buttonHome);

        registerForContextMenu(tvDescription);

        Intent intent = getIntent();
        String animal = intent.getStringExtra("Animal");
        String description = intent.getStringExtra("Description");
        String url = intent.getStringExtra("url");
        String output = "";

        int imagevalue = intent.getIntExtra("picture", 0);

        if (animal != null) {
            output += description;
        } else {
            output = "Error";
        }

        tvAnimalName.setText(animal);
        ivAnimal.setImageResource(imagevalue);
        tvDescription.setText(output);
        tvUrl.setText(url);

        tvUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentUrl = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intentUrl);
                Toast.makeText(AnimalDescriptionActivity.this, "Proceeding to Website...", Toast.LENGTH_SHORT).show();
            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,0,0,"Font Size +");
        menu.add(0,1,1,"Font Size -");

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if (item.getItemId() == 0) {
            fontSize += 2f;
            tvDescription.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize);

        } else {
            fontSize -= 2f;
            tvDescription.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize);
        }

        return super.onContextItemSelected(item);

    }
}