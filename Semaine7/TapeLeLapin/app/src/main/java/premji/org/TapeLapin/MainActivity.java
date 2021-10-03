package premji.org.TapeLapin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import premji.org.TapeLapin.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    List<Button> buttons = new ArrayList<>();
    int positionDuLapin;
    int flops = 0;
    int pafs = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        buttons.add(binding.b1);
        buttons.add(binding.b2);
        buttons.add(binding.b3);
        buttons.add(binding.b4);

        bougeLeLapin();

        for(Button b : buttons) {
            b.setOnClickListener(view -> {
                reagirClick(view);
            });
        }

    }

    private void reagirClick(View view)
    {
        Button bouttonDuLapin = buttons.get(positionDuLapin);
        if (view == bouttonDuLapin)
        {
            Log.i("TAPELAPIN", "Bravo tape le lapin");
            pafs++;
            binding.pafs.setText(pafs + " pafs");
            bougeLeLapin();
        }
        else
        {
            Log.i("TAPELAPIN", "Ouch tape une taupe");
            flops++;
            binding.flops.setText(flops + " flops");
        }
        int a = 0 ;
    }

    private void bougeLeLapin()
    {
        for (Button b : buttons)
        {
            b.setText("Taupe");
        }
        Random random = new Random();
        positionDuLapin = random.nextInt(4);
        Button b = buttons.get(positionDuLapin);
        b.setText("Lapin");
    }
}