package android.layout.picsartapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.layout.picsartapplication.R;
import android.layout.picsartapplication.UserProfileActivity;
import android.layout.picsartapplication.model.Post;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.Holder> {


    ArrayList<Post> posts = new ArrayList<>();
    Context context;
    LayoutInflater inflater;

    public CustomAdapter(ArrayList<Post> posts, Context context) {
        this.posts = posts;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = inflater.inflate(R.layout.recycler_user_post, viewGroup, false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
    Post post = posts.get(i);
    holder.prflImage.setImageResource(post.getProfile().getProfilePicture());
    holder.userName.setText(post.getUser().getUserName());
    holder.like.setText(post.getLike() + "");
    holder.comment.setText(post.getCommentCounter() + "");
    holder.postImage.setImageResource(post.getImagePost());
    holder.remixes.setText(post.getRemixes() + "");
    holder.layout.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, UserProfileActivity.class);
            context.startActivity(intent);
        }
    });
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    class Holder extends RecyclerView.ViewHolder {

        LinearLayout layout; // intent to another layout
        ImageView prflImage;
        TextView userName;
        ImageView postImage;
        TextView like;
        TextView comment;
        TextView remixes;

        public Holder(@NonNull View itemView) {
            super(itemView);
            prflImage = itemView.findViewById(R.id.prf_pic);
            userName = itemView.findViewById(R.id.userName);
            like = itemView.findViewById(R.id.like_count_id);
            comment = itemView.findViewById(R.id.comment_count_id);
            postImage = itemView.findViewById(R.id.post);
            remixes = itemView.findViewById(R.id.remix_count_id);
            layout = itemView.findViewById(R.id.user_post_layout); //intent to another layout
        }
    }
}
