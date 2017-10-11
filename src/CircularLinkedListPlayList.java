
public class CircularLinkedListPlayList implements Playlist{
	private String name;
	private CircularLinkedList<Song> list;
	private float totalTime;

	public CircularLinkedListPlayList(String name) {
		this.name = name;
		list = new CircularLinkedList<Song>();
		
	}
	
	@Override
	public String playlistName() {
		
		return name; 
	}
	
	public boolean addSong(Song s) {
//		return playlist.add(s);
		return list.add(s);
	}
	
	public boolean addSongAt(Song s, int index) {
		return list.add(index, s);
	}
	
	public Song getSongAt(Song s, int index) {
		return list.get(index);
	}
	
	public ArrayList<Song> getList() {
		return null;
	}
	
	public boolean removeSong(Song s) {
		list.remove(s);
	
		return true;
	}
	
	public int totalSongs() {
		return list.size();
	}
	
	public double playlistTime() {
		for(int i = 0; i < list.size(); i++) {
			totalTime += list.get(i).getPlayTime();
		}
		return totalTime;
	}
	
	public boolean isSongInPlaylist(String name) {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getSongName()==name) {
				flag = true;
			} else {
				flag = false;
//				System.out.println(list.get(i).getSongName()+" : "+name);
			}
		}
		return flag;

	}
	
	public void songsByArtist(String name) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(name)) {
				System.out.println(list.get(i).getSongName());
			}
		}
	}
	
	@Override 
	public boolean addSongsFrom(ArrayList<Song> p) {
		for(int i = 0; i < p.size(); i++) {
			list.add(p.get(i));
		}
		return false;
	}
	
	public void MoveSong(Song s, int index) {
		if (list.contains(s)) {
			list.set(index, s);
		}
		
	}
	
	public void MoveAllSongs(int positions) {
		list.shift(positions);
	}

}
