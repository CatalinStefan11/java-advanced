package _1_arraylist._2_;

class Song implements Comparable<Song> {
  private String title;
  private String artist;
  private int duration;

  public Song(String title, String artist, int duration) {
    this.title = title;
    this.artist = artist;
    this.duration = duration;
  }

  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }

  public int getDuration() {
    return duration;
  }

  @Override
  public int compareTo(Song song) {
    return Integer.compare(duration, song.duration);
  }
}