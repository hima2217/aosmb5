package com.example.aosmb5;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    LinearFragment linearFragment = new LinearFragment();
    ConstraintFragment constraintFragment = new ConstraintFragment();
    Fragment relativeFragment = new RelativeFragment();
    EditText textView;

    private static final String TAG = "MyApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_container);
    }

    public void onClickk1(View view){
        FragmentTransaction fTrans = getSupportFragmentManager().beginTransaction();
        Bundle bundle = new Bundle();
        String textL = String.valueOf(((TextView) relativeFragment
                .getView()
                .findViewById(R.id.textView4))
                .getText());
        Log.i("ппп111",textL);
        bundle.putString("key2", textL);

        constraintFragment.setArguments(bundle);

        fTrans.replace(R.id.fragment_container_view, constraintFragment).addToBackStack(null).commit();
        ;
    }
    public void onClickk2(View view){
        FragmentTransaction fTrans = getSupportFragmentManager().beginTransaction();


        fTrans.replace(R.id.fragment_container_view, linearFragment).addToBackStack(null).commit();
        ;
    }

}