package com.example.hw6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw6.databinding.FragmentTrackListBinding;

import java.util.ArrayList;


public class TrackListFragment extends Fragment implements OnClickListener {
private FragmentTrackListBinding binding;
private ArrayList <Track> tracks;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentTrackListBinding.inflate(LayoutInflater.from(getContext()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LoadData();
        TrackListAdapter adapter=new TrackListAdapter(tracks, this);
        binding.recyclerTrackList.setAdapter(adapter);
    }

     public void onClick(Track track) {
        Intent intent= new Intent(requireActivity(),SecondActivity.class);
        intent.putExtra("key",track.getTrackName());
        startActivity(intent);
    }

    private void LoadData() {
        tracks= new ArrayList<>();
        tracks.add(new Track("Twilight","GRAVECHILL","1:56"));
        tracks.add(new Track("Softcore","The Neighbourhood","3:28"));
        tracks.add(new Track("The Search","NF","4:08"));
        tracks.add(new Track("Chlorine","twenty one pilots","5:24"));
        tracks.add(new Track("Hometown","twenty one pilots","3:54"));
        tracks.add(new Track("Shy Away","twenty one pilots","2:55"));
        tracks.add(new Track("Life Goes On","Oliver Tree","2:41"));
        tracks.add(new Track("PlayaPhonk","KERAUNOS","2:25"));
        tracks.add(new Track("Белая Ночь","Черниговская хата","3:58"));
        tracks.add(new Track("Homegrown","Haux","4:02"));

    }
}