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

                intentAnimal.putExtra("Animal", "Habor Seal");
                intentAnimal.putExtra("Description", "Harbor seals belong to the scientific order Pinnipedia, which includes seals, sea lions, and walruses. Seals differ from sea lions in a number of ways, including having shorter, stouter flippers, and no visible earflaps." +
                        "\n\nHarbor seals swim with alternate back-and-forth movements of their hind flippers. Harbor seals can remain submerged for up to 28 minutes and dive to depths of 90 m (295 ft); however, they routinely forage in shallower waters." +
                        "\n\nHarbor seals are generally solitary and rarely interact with one another. An exception to this is the strong mother-pup bond maintained until the pup is weaned. When hauled out, adults maintain a meter or more (3 or more ft) between them. Harbor seals are not highly communicative, but if threatened a seal may respond by snorting, growling, lunging, scratching, or other aggressive gestures.");
                intentAnimal.putExtra("url", "https://seaworld.org/animals/facts/mammals/harbor-seal/");

                Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.gentoo_penguin);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                intentAnimal.putExtra("picture", byteArray);

                startActivity(intentAnimal);
            }
        });

        ivHammer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAnimal = new Intent(MainActivity.this, AnimalDescriptionActivity.class);

                intentAnimal.putExtra("Animal", "Hammerhead Shark");
                intentAnimal.putExtra("Description", "Hammerhead sharks long, rectangular heads serve multiple purposes, including granting the sharks 360-degree vision as well as better hunting abilities." +
                        "\n\nThe long heads of the hammerhead shark allow the sharks to spread out their special sensory organs, giving them a hunting advantage over other sharks." +
                        "\n\nHammerhead sharks tend to swim at an angle to decrease drag and increase their swimming efficiency and they prefer warm coastal waters.");
                intentAnimal.putExtra("url", "https://a-z-animals.com/animals/hammerhead-shark/");

                Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.gentoo_penguin);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                intentAnimal.putExtra("picture", byteArray);

                startActivity(intentAnimal);
            }
        });

        ivHooded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAnimal = new Intent(MainActivity.this, AnimalDescriptionActivity.class);

                intentAnimal.putExtra("Animal", "Hooded Seal");
                intentAnimal.putExtra("Description", "Hammerhead sharks long, rectangular heads serve multiple purposes, including granting the sharks 360-degree vision as well as better hunting abilities." +
                        "\n\nThe long heads of the hammerhead shark allow the sharks to spread out their special sensory organs, giving them a hunting advantage over other sharks." +
                        "\n\nHammerhead sharks tend to swim at an angle to decrease drag and increase their swimming efficiency and they prefer warm coastal waters.");
                intentAnimal.putExtra("url", "https://seaworld.org/animals/facts/mammals/hooded-seal/");

                Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.gentoo_penguin);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                intentAnimal.putExtra("picture", byteArray);

                startActivity(intentAnimal);
            }
        });

        ivGreyReef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAnimal = new Intent(MainActivity.this, AnimalDescriptionActivity.class);

                intentAnimal.putExtra("Animal", "Grey Reef Shark");
                intentAnimal.putExtra("Description", "They share many characteristics with other reef shark species, including a wide, circular snout positioned directly in front of relatively large eyes" +
                        "\n\nWhile they have many classic features seen among related shark species, they can be quickly identified by the dark lining along the back side of their tail fin." +
                        "\n\nWhile these sharks often migrate short distances as they seek prey, they are very loyal to their home turf and seldom leave an area once they are established.");
                intentAnimal.putExtra("url", "https://a-z-animals.com/animals/grey-reef-shark/");

                Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.gentoo_penguin);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                intentAnimal.putExtra("picture", byteArray);

                startActivity(intentAnimal);
            }
        });

        ivGreatWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAnimal = new Intent(MainActivity.this, AnimalDescriptionActivity.class);

                intentAnimal.putExtra("Animal", "Great White Shark");
                intentAnimal.putExtra("Description", "The Great White Shark is a large species of shark found mainly found inhabiting the temperate and tropical coastal waters worldwide." +
                        "\n\nThey are the largest predatory fish species in the world known to grow to lengths of 8 meters or more and weighing over 2 tonnes." +
                        "\n\nAlthough surprisingly little is still known about their biology and population sizes, it is widely agreed within the scientific community that Great White Shark population numbers are decreasing worldwide as they are threatened by both hunting and habitat loss throughout much of their natural range.");
                intentAnimal.putExtra("url", "");

                Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.gentoo_penguin);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                intentAnimal.putExtra("picture", byteArray);

                startActivity(intentAnimal);
            }
        });

        ivHarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAnimal = new Intent(MainActivity.this, AnimalDescriptionActivity.class);

                intentAnimal.putExtra("Animal", "Grey Reef Shark");
                intentAnimal.putExtra("Description", "" +
                        "\n\n" +
                        "\n\n");
                intentAnimal.putExtra("url", "");

                Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.gentoo_penguin);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                intentAnimal.putExtra("picture", byteArray);

                startActivity(intentAnimal);
            }
        });

    }

}