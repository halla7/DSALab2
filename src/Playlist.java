
public interface Playlist {

	String playlistName();
	
	boolean addSong(Song s);
	
	boolean addSongAt(Song s, int index);
	
	Song getSongAt(Song s, int index);
	
	MyList getList();
	
	boolean removeSong(Song s);
	
	int totalSongs();
	
	double playlistTime();
	
	boolean isSongInPlaylist(String name);
	
	void songsByArtist(String name);
	
	boolean addSongsFrom(ArrayList<Song> p);
	
	void MoveSong(Song s, int position);
	
	void MoveAllSongs(int positions);
	
}