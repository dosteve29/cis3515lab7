package edu.temple.androidfragments;


import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import java.util.Locale;


/**
 * A simple {@link Fragment} subclass.
 */
public class CanvasFragment extends Fragment {

    private FrameLayout frameLayout;

    public CanvasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_canvas, container, false);
        frameLayout = view.findViewById(R.id.canvasLayout); //this is the layout of the fragment
        return view;
    }

    public void updateBackgroundColor(int position){
        String[] parseColors;
        if (Locale.getDefault().getLanguage().equals("en")){
            parseColors = getResources().getStringArray(R.array.Colors);
        } else{
            parseColors = getResources().getStringArray(R.array.parseColors);
        }
        frameLayout.setBackgroundColor(Color.parseColor(parseColors[position]));

    }
}
