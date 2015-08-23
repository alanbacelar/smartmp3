package br.edu.fa7.playlist;

/**
 * Created by alan on 8/23/15.
 */
public class Music {

    private String name;
    private String band;
    private String album;
    private int icon;

    public Music(String name, String band, String album, int icon) {
        this.name = name;
        this.band = band;
        this.album = album;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
