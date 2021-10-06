package premji.org.demoplusieursactivities;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProductsActivity extends AppCompatActivity
{
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState)
    {
        super.onPostCreate(savedInstanceState);
        setTitle("Produits");
        int monId = getIntent().getIntExtra("id", -1);
        int age = getIntent().getIntExtra("age", 0);
        Toast.makeText(this, "Mon id : " + monId, Toast.LENGTH_SHORT).show();
    }
}
