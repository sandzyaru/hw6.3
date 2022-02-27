package com.example.hw6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw6.databinding.ItemTrackListBinding;

import java.util.ArrayList;


public class TrackListAdapter extends RecyclerView.Adapter<TrackListAdapter.TrackListViewHolder> {
    private ArrayList<Track> tracks;
    private OnClickListener onClickListener;
    public  TrackListAdapter(ArrayList<Track> tracks, OnClickListener onClickListener){
        this.onClickListener=onClickListener;
        this.tracks=tracks;
    }


    @NonNull
    @Override
    public TrackListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TrackListViewHolder(ItemTrackListBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull TrackListViewHolder holder, int position) {
        holder.bind(tracks.get(position));
    }

    @Override
    public int getItemCount() {
        return tracks.size();
    }

    class TrackListViewHolder extends RecyclerView.ViewHolder {
        private ItemTrackListBinding binding;
        public TrackListViewHolder(@NonNull ItemTrackListBinding itemView) {
            super(itemView.getRoot());
            binding=itemView;

        }

        public void bind(Track track) {
            binding.trackName.setText(track.getTrackName());
            binding.singer.setText(track.getSinger());
            binding.length.setText(track.getLength());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onClickListener.onClick(tracks.get(getLayoutPosition()));
                }
            });

        }
    }
}
