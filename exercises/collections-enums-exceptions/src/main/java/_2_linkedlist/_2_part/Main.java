package _2_linkedlist._2_part;



/**
 * Create a class Song with the following instance variables: title - String, duration - double
 *
 * Create the following methods:
 * - constructor
 * - getters for both fields
 * - override toString() method
 *
 * Create a class Album with the following instance variables: name - String, artist - String, songs - List of Songs
 *
 * Create the following methods:
 * - constructor
 *
 * - getters for name and artist
 *
 * - findSong(title) - iterate through the list of songs and compare title parameter with song name
 * and if the song is found then return the song, otherwise return null
 *
 * - addSong(title, duration) - method used to add a song to the album
 * first check if the song has been already added in album (use findSong method)
 * if song is not already in album then add it
 *
 * Create a class Playlist with the following instance variables: albums - List of Albums, playlist - Queue of Songs
 *
 * Create the following methods: 
 * - constructor with no-args - initialize the list and the queue
 *
 * - finAlbum(title) - iterate through the list of albums and check if title parameter 
 * is equal to current iteration album name, if it is equal return the album, otherwise return null
 *
 * - addAlbum(album) - adds the album to the album list and returns true when the operation succeeded, otherwise false
 *
 * - addToPlaylist(albumTitle, songTitle) - use findAlbum method to check if the albumTitle is in albums list
 * if the albumTitle is present the check if the songTitle is in album using findSong() method
 * if the song is present then added it to playlist queue - return true or false is the operation succeeded
 *
 * - playNextSong() - check if playlist queue is not empty and then play the first song in the queue (use poll() method)
 *
 * - playEntirePlaylist() - iterate through playlist and play all songs
 *
 */

public class Main {


    public static void main(String[] args) {

        
        Playlist playlist = new Playlist();
        
        Album album = new Album("Eminem Music to Be Murdered By", "Eminem");
        album.addSong("Godzilla", 5.04);
        album.addSong("You' Gon learn", 4.45);
        album.addSong("No regrets", 6.33);
        album.addSong("Darkness", 4.02);
        
        playlist.addAlbum(album);
        
        album = new Album("616", "Azteca");
        album.addSong("Expensive taste", 3.58);
        album.addSong("Enzo", 4.30);
        album.addSong("Jeff Bezos", 3.37);

        playlist.addAlbum(album);
        
        playlist.addToPlayList("Eminem Music to Be Murdered By","Darkness");
        playlist.addToPlayList("616", "Enzo");
        playlist.addToPlayList("616", "Expensive taste");


        playlist.playNextSong();
        playlist.playNextSong();
        playlist.playNextSong();





    }


}
