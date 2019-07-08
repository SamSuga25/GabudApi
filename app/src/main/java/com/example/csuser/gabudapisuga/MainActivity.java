package com.example.csuser.gabudapisuga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.csuser.gabudapisuga.ServiceGenerator;
import com.example.csuser.gabudapisuga.BoredService;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    private ImageView iconImage;
    private TextView boredText;
    private BoredService service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iconImage = findViewById(R.id.image_icon);
        boredText = findViewById(R.id.text_bored);
        service = ServiceGenerator.createService(BoredService.class);

        Button moreButton = findViewById(R.id.button_more);
        moreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moreBored();
            }
        });
    }
    private void moreBored() {
        Call<Bored> boredResponse = service.getRandomBored();
        boredResponse.enqueue(new Callback<Bored>() {
            @Override
            public void onResponse(Call<Bored> call, Response<Bored> response) {
                Bored bored = response.body();
                Picasso.get().load(bored.getType()).into(iconImage);
                boredText.setText(bored.getActivity());
            }

            @Override
            public void onFailure(Call<Bored> call, Throwable t) {
                Log.e(TAG, t.toString());
                String message = "Failed to get more, please check your connection.";
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
