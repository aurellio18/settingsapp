package com.example.aurelliof.ui.settings;

import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.aurelliof.R;

public class SettingsFragment extends Fragment {

    private AppCompatActivity root;

    @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.fragment_settings);

       TextView text1 = root.findViewById(R.id.textView);
       TextView text2 = root.findViewById(R.id.textView3);
       TextView text3 = root.findViewById(R.id.textView4);
       TextView text4 = root.findViewById(R.id.textView5);
       TextView text5 = root.findViewById(R.id.textView6);
       TextView text6 = root.findViewById(R.id.textView7);
       TextView text7 = root.findViewById(R.id.textView8);
       TextView text8 = root.findViewById(R.id.textView9);
       TextView text9 = root.findViewById(R.id.textView10);
       TextView text10 = root.findViewById(R.id.textView11);
   }



    private void setContentView(int fragment_settings) {
    }
}
