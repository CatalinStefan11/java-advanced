package _1_arraylist._2_;

import java.util.ArrayList;
import java.util.List;

class MusicLibrary {
  private List<Song> songs;

  public MusicLibrary() {
    songs = new ArrayList<>();
  }

  public MusicLibrary(List<Song> songs) {
    this.songs = songs;
  }
  
  public void addSong(Song song) {
    songs.add(song);
  }

  public void removeSong(Song song) {
    songs.remove(song);
  }

  public int getTotalDuration() {
    int totalDuration = 0;
    for (Song song : songs) {
      totalDuration += song.getDuration();
    }
    return totalDuration;
  }

  public List<Song> getSongs() {
    return songs;
  }
}
