package sg.edu.rp.c346.id20019634.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AnimalDescriptionActivity extends AppCompatActivity {

    TextView tvAnimalName, tvDescription, tvUrl;
    ImageView ivAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_description);

        tvAnimalName = findViewById(R.id.textViewName);
        tvDescription = findViewById(R.id.textViewDetails);
        tvUrl = findViewById(R.id.textViewUrl);
        ivAnimal = findViewById(R.id.imageViewAnimal);

        Intent intent = getIntent();
        String animal = intent.getStringExtra("Animal");
        String description = intent.getStringExtra("Description");
        String url = intent.getStringExtra("url");
        String output = "";

        Bundle extras = getIntent().getExtras();
        byte[] byteArray = extras.getByteArray("picture");

        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);

        if (animal != null) {
            output += description;
        } else {
            output = "Error";
        }

        tvAnimalName.setText(animal);
        ivAnimal.setImageBitmap(bmp);
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

    }
}