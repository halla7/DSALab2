
public interface Playlist {

	String playlistName();
	
	boolean addSong(Song s);
	
	boolean addSongAt(Song s, int index);
	
	Song getSongAt(Song s, int index);
	
	MyList getList();
	
	boolean removeSong(Song s);
	
	int totalSongs();
	
	float playlistTime();
	
	boolean isSongInPlaylist(String name, String artist);
	
	void songsByArtist(String name);
	
	boolean addSongsFrom(ArrayList<Song> p);
	
	void MoveSong(Song s, int position);
	
	void MoveAllSongs(int positions);
	
	
	
}