package com.example.bernardo.dialogs;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {
    public interface OnNameListener{
        void onContactClicked(String name, String age, String phoneNumber);
    }
    private OnNameListener mListener;
    public FragmentA() {
        // Required empty public constructor;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View contentView = inflater.inflate(R.layout.fragment_a,container,false);
        Button firstButton = contentView.findViewById(R.id.buttonFirst);
        firstButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                mListener.onContactClicked("Tadeu", "23", "91234231");
            }
        });
        Button secondButton = contentView.findViewById(R.id.buttonSecond);
        secondButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                mListener.onContactClicked("Guy", "21", "32423423432");
            }
        });
        return contentView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mListener = (OnNameListener) context;
    }
}
