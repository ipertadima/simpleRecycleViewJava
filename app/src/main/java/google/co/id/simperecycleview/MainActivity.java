package google.co.id.simperecycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<MovieModel> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MainAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
        prepareMovieData();
        initRecycle();
    }

    private void bindView() {
        recyclerView = findViewById(R.id.rv_main);
    }

    private void initRecycle() {
        mAdapter = new MainAdapter(movieList);
        recyclerView.setAdapter(mAdapter);

        //Untuk Linear Layout Vertical
        //RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

        //Untuk Linear Layout Horizontal
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);

        //Untuk Grid Layout
        //RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(MainActivity.this, 2);
       // RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(MainActivity.this, 2, GridLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
    }

    private void prepareMovieData() {
        MovieModel movie = new MovieModel("Mad Max: Fury Road", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new MovieModel("Inside Out", "Animation, Kids & Family", "2015");
        movieList.add(movie);

        movie = new MovieModel("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        movieList.add(movie);

        movie = new MovieModel("Shaun the Sheep", "Animation", "2015");
        movieList.add(movie);

        movie = new MovieModel("The Martian", "Science Fiction & Fantasy", "2015");
        movieList.add(movie);

        movie = new MovieModel("Mission: Impossible Rogue Nation", "Action", "2015");
        movieList.add(movie);

        movie = new MovieModel("Up", "Animation", "2009");
        movieList.add(movie);

        movie = new MovieModel("Star Trek", "Science Fiction", "2009");
        movieList.add(movie);

        movie = new MovieModel("The LEGO Movie", "Animation", "2014");
        movieList.add(movie);

        movie = new MovieModel("Iron Man", "Action & Adventure", "2008");
        movieList.add(movie);

        movie = new MovieModel("Aliens", "Science Fiction", "1986");
        movieList.add(movie);

        movie = new MovieModel("Chicken Run", "Animation", "2000");
        movieList.add(movie);

        movie = new MovieModel("Back to the Future", "Science Fiction", "1985");
        movieList.add(movie);

        movie = new MovieModel("Raiders of the Lost Ark", "Action & Adventure", "1981");
        movieList.add(movie);

        movie = new MovieModel("Goldfinger", "Action & Adventure", "1965");
        movieList.add(movie);

        movie = new MovieModel("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movieList.add(movie);
    }
}
