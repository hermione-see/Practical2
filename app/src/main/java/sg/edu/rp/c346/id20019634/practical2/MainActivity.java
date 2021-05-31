package sg.edu.rp.c346.id20019634.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {

    TextView tvGalapagos, tvGentoo, tvGrey, tvHooded, tvHorn, tvGreatWhite, tvHammer, tvGreyReef, tvHabor, tvHarp;
    ImageView ivGalapagos, ivGentoo, ivGrey, ivHooded, ivHorn, ivGreatWhite, ivHammer, ivGreyReef, ivHabor, ivHarp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvGalapagos = findViewById(R.id.textViewGalapagos);
        tvGentoo = findViewById(R.id.textViewGentoo);
        tvGreatWhite = findViewById(R.id.textViewGreatWhite);
        tvGrey = findViewById(R.id.textViewGrey);
        tvGreyReef = findViewById(R.id.textViewGreyReef);
        tvHabor = findViewById(R.id.textViewHabor);
        tvHammer = findViewById(R.id.textViewHammer);
        tvHarp = findViewById(R.id.textViewHarp);
        tvHooded = findViewById(R.id.textViewHooded);
        tvHorn = findViewById(R.id.textViewHorn);

        ivGalapagos = findViewById(R.id.imageViewGalapagos);
        ivGentoo = findViewById(R.id.imageViewGentoo);
        ivGreatWhite = findViewById(R.id.imageViewGreatWhite);
        ivGrey = findViewById(R.id.imageViewGrey);
        ivGreyReef = findViewById(R.id.imageViewGreyReef);
        ivHooded = findViewById(R.id.imageViewHooded);
        ivHorn = findViewById(R.id.imageViewHorn);
        ivHammer = findViewById(R.id.imageViewHammer);
        ivHabor = findViewById(R.id.imageViewHabor);
        ivHarp = findViewById(R.id.imageViewHarp);

        ivGalapagos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAnimal = new Intent(MainActivity.this, AnimalDescriptionActivity.class);

                intentAnimal.putExtra("Animal", "Galapagos Penguin");
                intentAnimal.putExtra("Description", "The Galapagos penguin species has adapted closely to the annual environmental cycles of the Galapagos Islands. The timing of its breeding, molting, and feeding is all based on changes in this cycle." +
                        "\n\nThe Galapagos penguin molts twice per year. Each molt takes approximately two weeks to complete." +
                        "\n\nPenguins likely evolved around the Antarctic-New Zealand region some 30 to 40 million years ago, when both landmasses were practically connected with each other. One group of penguins later split off from the others and traveled north, giving rise to the so-called banded penguins.");
                intentAnimal.putExtra("url", "https://a-z-animals.com/animals/galapagos-penguin/");

                Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.galapagospenguin);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                intentAnimal.putExtra("picture", byteArray);

                startActivity(intentAnimal);

            }
        });

        ivGentoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAnimal = new Intent(MainActivity.this, AnimalDescriptionActivity.class);

                intentAnimal.putExtra("Animal", "Gentoo Penguin");
                intentAnimal.putExtra("Description", "Gentoo Penguins are known to be the third-largest penguins in the world – after the emperor and king penguins." +
                        "\n\nGentoo Penguins, when diving in deep waters, often control and reduce their heartbeat considerably. It can very well go from 80 to 100 heartbeats per minute to 20 heartbeats per minute." +
                        "\n\nThese penguins use a variety of materials during their nesting period. The materials can range from molten feathers to pebbles." +
                        "\n\nThey are the only ones in the engine species that are known to be increasing in domain size as well as in numbers.");
                intentAnimal.putExtra("url", "https://a-z-animals.com/animals/gentoo-penguin/");

                Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.gentoo_penguin);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                intentAnimal.putExtra("picture", byteArray);

                startActivity(intentAnimal);

            }
        });

        ivHabor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAnimal = new Intent(MainActivity.this, AnimalDescriptionActivity.class);

                intentAnimal.putExtra("Animal", "Gentoo Penguin");
                intentAnimal.putExtra("Description", "The Gentoo Penguins are, much like the other penguin species, black in appearance from the back to the head." +
                        "\nThey also adorn a white belly and are most commonly distinguished by a white stripe that runs from eye-to-eye at the top of their heads." +
                        "\nGentoo Penguins are often relaxed and laid back. They are rarely aggressive. However, they do have some loud moments during their nesting period." +
                        "\nThey are the only ones in the engine species that are known to be increasing in domain size as well as in numbers." +
                        "\nThese penguins use a variety of materials during their nesting period. The materials can range from molten feathers to pebbles.");
                intentAnimal.putExtra("url", "https://a-z-animals.com/animals/gentoo-penguin/");

                startActivity(intentAnimal);
            }
        });

    }

}