package com.example.crackerrank.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crackerrank.R;
import com.example.crackerrank.entity.Main;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {
    private ArrayList<Main> mains;

    public MainAdapter(ArrayList<Main> mains) {
        this.mains = mains;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_main, parent, false);
        return new MainAdapter.MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        String title = mains.get(position).getTitle();
        String difficulty = mains.get(position).getDifficulty();
        String skills = mains.get(position).getSkills();

        holder.tvTitle.setText(title);
        holder.tvDifficulty.setText(difficulty);
        holder.tvSkills.setText(skills);
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }

    @Override
    public int getItemCount() {
        return mains.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {

        TextView tvTitle, tvDifficulty, tvSkills;
        Button btn;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvDifficulty = itemView.findViewById(R.id.tv_difficulty);
            tvSkills = itemView.findViewById(R.id.tv_skills);
            btn = itemView.findViewById(R.id.btn);
        }
    }
}
