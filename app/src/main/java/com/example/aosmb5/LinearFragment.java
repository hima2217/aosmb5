package com.example.aosmb5;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class LinearFragment extends Fragment {

    public LinearFragment() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Жизненный цикл LinearFragment", "Вызов onCreate");
        Toast.makeText(getActivity(), "Вызов onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("Жизненный цикл LinearFragment", "Вызов onCreateView");
        Toast.makeText(getActivity(), "Вызов onCreateView", Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.linerlayout, container, false);
    }

    public void clickButton(){

        Log.i("Тест","Работает!");
    }


}