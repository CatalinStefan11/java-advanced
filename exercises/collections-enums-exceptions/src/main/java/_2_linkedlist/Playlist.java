package _2_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Playlist {

  private List<Album> albums;
  private Queue<Song> playlist;

  public Playlist() {
    this.albums = new ArrayList<>();
    this.playlist = new LinkedList<>();
  }

  public boolean addToPlayList(String albumTitle, String songTitle) {

    Album album = findAlbum(albumTitle);
    if (album != null) {
      Song song = album.findSong(songTitle);
      if (song != null) {
        playlist.add(song);
        return true;
      }
    }

    System.out.println("Album/Song not found!");
    return false;
  }

  private Album findAlbum(String title) {
    for (Album album : this.albums) {
      if (album.getName().equals(title)) {
        return album;
      }
    }
    return null;
  }
  
  public boolean addAlbum(Album album){
    return albums.add(album);
  }

  
  public void playNextSong() {
    if (!playlist.isEmpty()) {
      Song nextSong = playlist.poll();
      System.out.println("Song with name: " + nextSong.getTitle() + " is playing");
    }
  }

  public void playEntirePlaylist() {
    for (Song song : playlist) {
      System.out.println("Song with name: " + song.getTitle() + " is playing");
    }
  }
  
}
