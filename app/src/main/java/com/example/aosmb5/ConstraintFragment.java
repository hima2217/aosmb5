package com.example.aosmb5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class ConstraintFragment extends Fragment {

    public ConstraintFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.constraintleyout, container, false);
        Bundle bundle = getArguments();
        if (bundle != null) {
            TextView textView = (TextView) view.findViewById(R.id.textView4);
            textView.setText(bundle.getString("keylog2"));
        }
        view.findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                //bundle.putString("keylog3", String.valueOf(((TextView) view
                        //.findViewById(R.id.textView4))
                        //.getText()));
                bundle.putString("keylog3","gfhfghfgh");
                Navigation.findNavController(view).navigate(R.id.action_FragmentConstraint_to_FragmentLinear,bundle);
            }
        });
        return view;

    }
}