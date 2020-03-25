package maintoolbar_menu_activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;

import com.harry.example.fulltoolbar1.R;

public class AboutUS extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_u_s);
        toolbar=findViewById(R.id.sub_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("About us");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return true;
    }
}
