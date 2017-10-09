public class ArrayListPlayList implements Playlist{

	private String name;
	ArrayList<Song> playlist;
	private float totalTime;
	public ArrayListPlayList(String name) {
		
	}
	
	@Override
	public String playlistName() {
		
		return name; 
	}
	
	public boolean addSong(Song s) {
		return playlist.add(s);
	}
	
	public boolean addSongAt(Song s, int index) {
		return playlist.add(index, s);
	}
	
	public Song getSongAt(Song s, int index) {
		return playlist.get(index);
	}
	
	public ArrayList<Song> getList() {
		return playlist;
	}
	
	public boolean removeSong(Song s) {
		playlist.remove(s);
	
		return true;
	}
	
	public int totalSongs() {
		return playlist.size();
	}
	
	public float playlistTime() {
		for(int i = 0; i < playlist.size(); i++) {
			totalTime += playlist.get(i).getPlayTime();
		}
		return totalTime;
	}
	
	public boolean isSongInPlaylist(String name, String artist) {
		boolean flag = false;
		for (int i = 0; i < playlist.size(); i++) {
			if(playlist.get(i).getSongName().equals(name) || playlist.get(i).getArtist().equals(artist)) {
				flag = true;
			} else {
				flag = false;
			}
		}
		return flag;

	}
	
	public void songsByArtist(String name) {
		for (int i = 0; i < playlist.size(); i++) {
			if(playlist.get(i).equals(name)) {
				System.out.println(playlist.get(i).getSongName());
			}
		}
	}
	
	@Override 
	public boolean addSongsFrom(ArrayList<Song> p) {
		for(int i = 0; i < p.size(); i++) {
			playlist.add(p.get(i));
		}
		return false;
	}
	
	public void MoveSong(Song s, int index) {
		if (playlist.contains(s)) {
			playlist.set(index, s);
		}
		
	}
	
	public void MoveAllSongs(int positions) {
		playlist.shift(positions);
	}



	
	
	
}