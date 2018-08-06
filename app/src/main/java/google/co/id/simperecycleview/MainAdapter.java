package google.co.id.simperecycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {
    private List<MovieModel> moviesList;

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView movieName;

        MyViewHolder(View itemView) {
            super(itemView);
            movieName = itemView.findViewById(R.id.tv_movie);
        }
    }

    MainAdapter(List<MovieModel> moviesList) {
        this.moviesList = moviesList;
        notifyDataSetChanged();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.viewholder_item_main, viewGroup, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        MovieModel movie = moviesList.get(i);
        myViewHolder.movieName.setText(movie.getTitle());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
