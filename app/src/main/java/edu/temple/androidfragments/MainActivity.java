package edu.temple.androidfragments;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends Activity implements PaletteFragment.OnColorSelectedListener{

    //the two fragments
    PaletteFragment paletteFragment;
    CanvasFragment canvasFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // add fragments
        FragmentManager fragmentManager = getFragmentManager();

        paletteFragment = (PaletteFragment) fragmentManager.findFragmentById(R.id.paletteLayout);
        if (paletteFragment == null){
            paletteFragment = new PaletteFragment();
            fragmentManager.beginTransaction().add(R.id.frag1, paletteFragment).commit();
        }

        canvasFragment = (CanvasFragment) fragmentManager.findFragmentById(R.id.canvasLayout);
        if (canvasFragment == null){
            canvasFragment = new CanvasFragment();
            fragmentManager.beginTransaction().add(R.id.frag2, canvasFragment).commit();
        }
    }

    @Override
    public void onColorSelected(int position) {
        //when user clicks the color, update the canvas fragment background color
        canvasFragment.updateBackgroundColor(position);
    }
}
