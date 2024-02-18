package sak.smaugkem;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.sak.smaugkem.Model.Encapsulation;
import com.sak.smaugkem.Model.Key;
import com.sak.smaugkem.Model.Smaug_128;
import com.sak.smaugkem.Model.Smaug_192;
import com.sak.smaugkem.Model.Smaug_256;
import com.sak.smaugkem.SmaugKEM;
import com.sak.smaugkem.Utils;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}