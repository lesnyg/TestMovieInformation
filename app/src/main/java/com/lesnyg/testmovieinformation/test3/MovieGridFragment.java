package com.lesnyg.testmovieinformation.test3;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lesnyg.testmovieinformation.R;
import com.lesnyg.testmovieinformation.test12.Movie;
import com.lesnyg.testmovieinformation.test12.MovieInfoFragment;

import java.util.ArrayList;
import java.util.List;

public class MovieGridFragment extends Fragment {

    private static final String ARG_MVIMAGE = "movieImage";
    private static final String ARG_MVTITLE = "movieTitle";

    private int mMovieImage;
    private String mMovieTitle;

    private ImageView movieimage;
    private TextView movietitle;

    List<Movie> mList = new ArrayList<>();
    RecyclerView mRecycler;
    MovieRecyclerAdapter mAdapter;

    public MovieGridFragment() {
        // Required empty public constructor
    }

    public static MovieGridFragment newInstance(int movieImage, String movieTitle) {
        MovieGridFragment fragment = new MovieGridFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_MVIMAGE, movieImage);
        args.putString(ARG_MVTITLE, movieTitle);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mMovieImage = getArguments().getInt(ARG_MVIMAGE);
            mMovieTitle = getArguments().getString(ARG_MVTITLE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_movie_grid, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mList.add(new Movie(R.drawable.avengers, "어벤져스"));
        mList.add(new Movie(R.drawable.babydriver, "베이비 드라이버"));
        mList.add(new Movie(R.drawable.himalayas, "히말라야"));
        mList.add(new Movie(R.drawable.monster, "괴물"));
        mList.add(new Movie(R.drawable.raraland, "라라랜드"));

        mRecycler = view.findViewById(R.id.recyclerview);
        mAdapter = new MovieRecyclerAdapter(mList);
        mRecycler.setAdapter(mAdapter);

    }
}



