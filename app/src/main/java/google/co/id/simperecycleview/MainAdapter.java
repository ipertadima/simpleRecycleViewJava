package google.co.id.simperecycleview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {
    private List<MovieModel> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView movieName;

        public MyViewHolder(View itemView) {
            super(itemView);
            movieName = itemView.findViewById(R.id.tv_movie);
        }
    }

    public MainAdapter(List<MovieModel> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.viewholder_item_main, viewGroup, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        MovieModel movie = new MovieModel();
        myViewHolder.movieName.setText(movie.getTitle());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
