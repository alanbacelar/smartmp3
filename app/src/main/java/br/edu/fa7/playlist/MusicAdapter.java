package br.edu.fa7.playlist;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by alan on 8/23/15.
 */
public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicViewHolder> {

    private List<Music> list;
    private LayoutInflater layoutInflater;

    public MusicAdapter(Context context, List<Music> list) {
        this.list = list;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public MusicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(R.layout.cardview_music_item, parent, false);
        MusicViewHolder pvh = new MusicViewHolder(v);

        return pvh;
    }

    @Override
    public void onBindViewHolder(MusicViewHolder holder, int position) {
        Music music = list.get(position);
        holder.mIcon.setImageResource(music.getIcon());
        holder.mName.setText(music.getName());
        holder.mBand.setText(music.getBand());
        holder.mAlbum.setText(music.getAlbum());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class MusicViewHolder extends RecyclerView.ViewHolder {

        private ImageView mIcon;
        private TextView mName;
        private TextView mBand;
        private TextView mAlbum;

        public MusicViewHolder(View itemView) {
            super(itemView);

            mIcon = (ImageView) itemView.findViewById(R.id.carview_icon);
            mName  = (TextView) itemView.findViewById(R.id.carview_name);
            mBand = (TextView) itemView.findViewById(R.id.carview_band);
            mAlbum = (TextView) itemView.findViewById(R.id.carview_album);
        }

    }
}
