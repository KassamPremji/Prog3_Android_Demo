package premji.org.demoplusieursactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import premji.org.demoplusieursactivities.databinding.ActivityFaqBinding;
import premji.org.demoplusieursactivities.databinding.ActivityMainBinding;

public class FAQActivity extends AppCompatActivity
{
    private ActivityFaqBinding binding;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setTitle("FAQ");

        binding = ActivityFaqBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.txtAffichage.setText(getIntent().getStringExtra("texte"));
        binding.btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FAQActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
