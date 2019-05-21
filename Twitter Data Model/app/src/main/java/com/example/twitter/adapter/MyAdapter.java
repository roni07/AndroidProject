package com.example.twitter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.junit.Test;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Holder> {

    ArrayList<Post> postDataSet = new ArrayList<>();
    Context context;
    LayoutInflater layoutInflater;

    public MyAdapter(ArrayList<Post> postDataSet, Context context) {
        this.postDataSet = postDataSet;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = layoutInflater.inflate(R.layout.post_recycler_view, viewGroup, false);
        Holder holder = new Holder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        Post post = postDataSet.get(i);
        holder.profilePicture.setImageResource(post.Profile_Img);
        holder.userName.setText(post.User_Name);
        holder.description.setText(post.Description_Post);
        holder.postPicture.setImageResource(post.Image_Post);
    }

    @Override
    public int getItemCount() {
        return postDataSet.size();
    }

    class Holder extends RecyclerView.ViewHolder {

        ImageView profilePicture;
        TextView userName;
        TextView description;
        ImageView postPicture;

        public Holder(@NonNull View itemView) {
            super(itemView);
            profilePicture = itemView.findViewById(R.id.image1);
            userName = itemView.findViewById(R.id.name);
            description = itemView.findViewById(R.id.caption);
            postPicture = itemView.findViewById(R.id.imagePost);
        }
    }
}
