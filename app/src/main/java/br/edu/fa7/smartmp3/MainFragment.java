package br.edu.fa7.smartmp3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class MainFragment extends Fragment {

    private Toolbar mMainToolbar;
    private AppCompatActivity mMainActivity;
    private RecyclerView mRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        mMainActivity = (AppCompatActivity) getActivity();

        mMainToolbar = (Toolbar) mMainActivity.findViewById(R.id.main_toolbar);
        mMainToolbar.setTitle(R.string.app_name);

        mMainActivity.setSupportActionBar(mMainToolbar);
        mMainActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        List<Music> list = new ArrayList<>();
        list.add(new Music("Paradise City", "Guns and Roses", "Greatest Rock Song", R.mipmap.music));
        list.add(new Music("Otherside", "Red Hot Chili Peppers", "Greatest Rock Song", R.mipmap.music));
        list.add(new Music("Another Brick in the Wall", "Pink Floyd", "Greatest Rock Song", R.mipmap.music));

        list.add(new Music("Paradise City", "Guns and Roses", "Greatest Rock Song", R.mipmap.music));
        list.add(new Music("Otherside", "Red Hot Chili Peppers", "Greatest Rock Song", R.mipmap.music));
        list.add(new Music("Another Brick in the Wall", "Pink Floyd", "Greatest Rock Song", R.mipmap.music));

        LinearLayoutManager llm = new LinearLayoutManager(mMainActivity);
        MusicAdapter adapter = new MusicAdapter(mMainActivity, list);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_main_recyclerview);
        mRecyclerView.setLayoutManager(llm);
        mRecyclerView.setAdapter(adapter);

        return view;
    }

}
