package _1_arraylist._2_;

/*
  Implement a Music Library
  
  Create a Song class that implements the Comparable interface, with the comparison based on the duration of the songs. 
  The Song class should have the following properties and methods:
  - title: a string representing the title of the song
  - artist: a string representing the name of the artist
  - duration: an integer representing the duration of the song in seconds
  - getTitle(): returns the title of the song
  - getArtist(): returns the name of the artist
  - getDuration(): returns the duration of the song in seconds
  - compareTo(Song song): compares two songs based on their duration

  Create a MusicLibrary class that contains a list of Songs. The Songs should be stored in an ArrayList. 
  Each Song has a title, artist, and duration.

  The MusicLibrary should have the following methods:
  - addSong(Song song): adds a song to the library
  - removeSong(Song song): removes a song from the library
  - getTotalDuration(): returns the total duration of all the songs in the library
  - getSongs(): returns a list of all the songs in the library
  
 
  Finally, create a Playlist class that has a list of Songs, also stored in an ArrayList. 
  The Playlist should have the following methods:
  - addSong(Song song): adds a song to the playlist
  - removeSong(Song song): removes a song from the playlist
  - sortByDuration(): sorts the songs taking into account the duration
  - getSongs(): returns a list of all the songs in the playlist
 */

public class Main {
  public static void main(String[] args) {
    Song song1 = new Song("Bohemian Rhapsody", "Queen", 354);
    Song song2 = new Song("Stairway to Heaven", "Led Zeppelin", 482);
    Song song3 = new Song("November Rain", "Guns N' Roses", 537);
    Song song4 = new Song("Smells Like Teen Spirit", "Nirvana", 301);

    MusicLibrary library = new MusicLibrary();
    library.addSong(song1);
    library.addSong(song2);
    library.addSong(song3);
    library.addSong(song4);

    Playlist playlist = new Playlist();
    playlist.addSong(song1);
    playlist.addSong(song2);
    playlist.addSong(song3);
    playlist.addSong(song4);

    System.out.println("Songs in music library:");
    for (Song song : library.getSongs()) {
      System.out.println(song.getTitle() + " - " + song.getArtist() + " (" + song.getDuration() + " seconds)");
    }
    System.out.println("Total duration of songs in music library: " + library.getTotalDuration() + " seconds");

    System.out.println("\nSongs in playlist:");
    for (Song song : playlist.getSongs()) {
      System.out.println(song.getTitle() + " - " + song.getArtist() + " (" + song.getDuration() + " seconds)");
    }
    playlist.sortByDuration();
    System.out.println("\nSorted songs in playlist:");
    for (Song song : playlist.getSongs()) {
      System.out.println(song.getTitle() + " - " + song.getArtist() + " (" + song.getDuration() + " seconds)");
    }
  }

  /*
  Songs in music library:
  Bohemian Rhapsody - Queen (354 seconds)
  Stairway to Heaven - Led Zeppelin (482 seconds)
  November Rain - Guns N' Roses (537 seconds)
  Smells Like Teen Spirit - Nirvana (301 seconds)
  Total duration of songs in music library: 1674 seconds

  Songs in playlist:
  Bohemian Rhapsody - Queen (354 seconds)
  Stairway to Heaven - Led Zeppelin (482 seconds)
  November Rain - Guns N' Roses (537 seconds)
  Smells Like Teen Spirit - Nirvana (301 seconds)

  Shuffled songs in playlist:
  November Rain - Guns N' Roses (537 seconds)
  Bohemian Rhapsody - Queen (354 seconds)
  Stairway to Heaven - Led Zeppelin (482 seconds)
  Smells Like Teen Spirit - Nirvana (301 seconds)
  
  
   */

  
}
