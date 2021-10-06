package premji.org.demoplusieursactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import premji.org.demoplusieursactivities.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
{
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnProduits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ProductsActivity.class);
                i.putExtra("id",12);
                i.putExtra("age",18);
                i.putExtra("cash",200);
                i.putExtra("texte", binding.editMessage.getText().toString());
                startActivity(i);
            }
        });

        binding.btnFAQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, FAQActivity.class);
                startActivity(i);
            }
        });
    }
}