package com.hfad.criminalintent;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i( MainActivity.TAG , "OnDestroyeView_FRAG");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i( MainActivity.TAG , "OnDestroye_FRAG");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i( MainActivity.TAG , "OnDetach_FRAG");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        Log.i( MainActivity.TAG , "OnCreateView_FRAG");
        // Inflate the layout for this fragment
        return inflater.inflate( R.layout.fragment_blank, container, false );


    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach( context );
        Toast.makeText( getActivity(), "OnAttach", Toast.LENGTH_SHORT ).show();
        Log.i( MainActivity.TAG , "OnAttach_FRAG");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        Toast.makeText( getActivity(), "Fragment_onCreate", Toast.LENGTH_SHORT ).show();
        Log.i( MainActivity.TAG , "OnCreate_FRAG");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated( savedInstanceState );
        Toast.makeText( getActivity(), "OnActivityCreated_FRAG", Toast.LENGTH_SHORT ).show();
        Log.i( MainActivity.TAG , "OnActivity_Created_FRAG");
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText( getActivity(), "OnStart_FRAG", Toast.LENGTH_SHORT ).show();
        Log.i( MainActivity.TAG , "OnStart_FRAG");
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText( getActivity(), "OnResume_FRAG", Toast.LENGTH_SHORT ).show();
        Log.i( MainActivity.TAG , "OnResume_FRAG");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i( MainActivity.TAG , "OnPause_FRAG");
    }

    @Override
    public void onStop() {
        super.onStop();
         Log.i( MainActivity.TAG , "OnStop_FRAG");
    }
}
