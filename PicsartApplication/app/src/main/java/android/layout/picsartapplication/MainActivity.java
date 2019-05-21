package android.layout.picsartapplication;

import android.layout.picsartapplication.adapter.CustomAdapter;
import android.layout.picsartapplication.model.Post;
import android.layout.picsartapplication.model.Profile;
import android.layout.picsartapplication.model.User;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Post> posts = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createSamplePost();
        initRecyclerView();
    }

    void initRecyclerView(){
        recyclerView = findViewById(R.id.recycler1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        CustomAdapter customAdapter = new CustomAdapter(posts, this);
        recyclerView.setAdapter(customAdapter);
    }

    void createSamplePost(){
        Post post1 = new Post(R.drawable.post1_pic, 5, 12, new User("@lady"), new Profile(R.drawable.prf_pic), 5);
        Post post2 = new Post(R.drawable.post2, 10, 50, new User("@lady"), new Profile(R.drawable.prf_pic), 3);
        Post post3 = new Post(R.drawable.post3, 420, 123, new User("@disuza"), new Profile(R.drawable.prf_pic2), 9);
        Post post4 = new Post(R.drawable.post4, 300, 50, new User("@disuza"), new Profile(R.drawable.prf_pic2), 9);
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);
    }
}
