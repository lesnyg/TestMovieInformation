package com.lesnyg.testmovieinformation.test3;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lesnyg.testmovieinformation.test12.Movie;
import com.lesnyg.testmovieinformation.R;
import com.lesnyg.testmovieinformation.test12.MovieInfoFragment;

import java.util.ArrayList;
import java.util.List;

public class MovieRecyclerAdapter extends RecyclerView.Adapter<MovieRecyclerAdapter.MovieHolder> {
    List<Movie> mList = new ArrayList<>();

    public MovieRecyclerAdapter(List<Movie> mList) {
        this.mList = mList;
    }

    @NonNull
    @Override
    public MovieHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_movie,viewGroup,false);
        MovieHolder movieHolder = new MovieHolder(view);
        return movieHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieHolder movieHolder, int i) {
        Movie movie = mList.get(i);
        movieHolder.movieimage.setImageResource(movie.getMovieImage());
        movieHolder.textTitle.setText(movie.getMovieTitle());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MovieHolder extends RecyclerView.ViewHolder {
        private ImageView movieimage;
        private TextView textTitle;
        public MovieHolder(@NonNull View itemView) {
            super(itemView);
            movieimage = itemView.findViewById(R.id.imageView_movie);
            textTitle = itemView.findViewById(R.id.text_title);
        }
    }
}
