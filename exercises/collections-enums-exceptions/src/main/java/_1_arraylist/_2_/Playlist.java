package _1_arraylist._2_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Playlist {
  private List<Song> songs;

  public Playlist() {
    songs = new ArrayList<>();
  }

  public void addSong(Song song) {
    songs.add(song);
  }

  public void removeSong(Song song) {
    songs.remove(song);
  }

  public void sortByDuration() {
    Collections.sort(songs);
  }

  public List<Song> getSongs() {
    return songs;
  }
}