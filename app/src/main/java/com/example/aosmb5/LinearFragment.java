package com.example.aosmb5;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

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
        View view = inflater.inflate(R.layout.linerlayout, container, false);
        Bundle bundle = getArguments();
        if (bundle != null) {
            TextView textView = (TextView) view.findViewById(R.id.editTextTextPersonName6);
            textView.setText(bundle.getString("keylog3"));
        }
        view.findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                //bundle.putString("keylog1", String.valueOf(((TextView) view
                       // .findViewById(R.id.editTextTextPersonName5))
                       // .getText()));
                bundle.putString("keylog1","gfhfghfgh");
                Navigation.findNavController(view).navigate(R.id.action_FragmentLinear_to_FragmentRelative,bundle);

            }
        });
        return view;

    }





}
