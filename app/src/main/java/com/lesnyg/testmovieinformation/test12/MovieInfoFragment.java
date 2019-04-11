package com.lesnyg.testmovieinformation.test12;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lesnyg.testmovieinformation.R;


public class MovieInfoFragment extends Fragment {
    private static final String ARG_MVIMAGE = "movieImage";
    private static final String ARG_MVTITLE = "movieTitle";
    private static final String ARG_POSITION = "position";

    private int mCurrentPosition = -1;

    private int mMovieImage;
    private String mMovieTitle;

    private ImageView movieimage;
    private TextView movietitle;



    private OnDetailInfoButtonListener mListener;

    public MovieInfoFragment() {
    }

    /**
     *
     * @param movieImage 영화 이미지
     * @param movieTitle 영화 제목
     * @return
     */
    public static MovieInfoFragment newInstance(int movieImage, String movieTitle) {
        MovieInfoFragment fragment = new MovieInfoFragment();
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
        View view;
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
        view = inflater.inflate(R.layout.fragment_movie_info, container, false);
        }else{
            view = inflater.inflate(R.layout.fragment_movie_info2, container, false);
        }
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        movieimage = view.findViewById(R.id.imageView_movie);
        movietitle = view.findViewById(R.id.textView_Title);

        movieimage.setImageResource(mMovieImage);
        movietitle.setText(mMovieTitle);

        view.findViewById(R.id.button_info).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onDetailInfoButton(mMovieImage,mMovieTitle);
            }
        });
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnDetailInfoButtonListener) {
            mListener = (OnDetailInfoButtonListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnDetailInfoButtonListener {
        void onDetailInfoButton(int image,String title);
    }
    public void setOnDetailInfoButtonListener(OnDetailInfoButtonListener listener){
        mListener = listener;
    }

}
