package SpringInAction4Edition.beans;

import SpringInAction4Edition.ICompactDisc2;
import java.util.List;
import org.springframework.stereotype.Component;

public class BlankDisc implements ICompactDisc2 {

    private String artist;
    private String title;
    private List<String> trax;

    public BlankDisc() {
    }

    public BlankDisc(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTrax() {
        return trax;
    }

    public void setTrax(List<String> trax) {
        this.trax = trax;
    }

    @Override
    public void playTrack(int trackNo) {
        System.err.println("Blank disk : Artist : " + artist);
        System.err.println("Blank disk : Title : " + title);

        System.err.println("----------trax----------");
        System.err.println("Track #" + (1 + trackNo) + " - " + trax.get(trackNo));
    }

}
