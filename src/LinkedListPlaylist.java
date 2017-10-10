
public class LinkedListPlaylist implements Playlist {

	private String name;
	private LinkedList<Song> list;
	
	public LinkedListPlaylist(String name) {
		this.name = name;
		list = new LinkedList<Song>();
		
	}
	
	@Override
	public String playlistName() {
		return name;
	}
	
	@Override
	public boolean addSong(Song s) {
		return list.add(s);
		
	}

	@Override
	public boolean addSongAt(Song s, int index) {
		return list.add(index, s);
	}

	@Override
	public Song getSongAt(Song s, int index) {
		return (Song) list.get(index);
	}

	@Override
	public MyList getList() {
		
		//return list.subList(fromIndex, toIndex);
		return null;
	}

	@Override
	public boolean removeSong(Song s) {
		boolean flag = false;
		if (list.remove(s).equals(s)) {
			flag = true;
		} else {
			flag = false;
		}
		
		return flag;
	}

	@Override
	public int totalSongs() {
		return list.size();
	}

	@Override
	public double playlistTime() {
		double totalTime = 0;
		for (int i = 0; i < list.size(); i++) {
			totalTime = totalTime + list.get(i).getPlayTime();
		}
		
		return totalTime;
	}

	@Override
	public boolean isSongInPlaylist(String name) {
		boolean found = false;
		for (int i = 0; i  < list.size(); i++) {
			if(list.get(i).getSongName().equals(name)) {
				found = true;
				i = list.size();
			} else {
				found = false;
			}
			
		}
		return found;
	}

	@Override
	public void songsByArtist(String name) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getSongName());
		}
		
	}

	@Override
	public boolean addSongsFrom(ArrayList<Song> p) {
		for(int i = 0; i < p.size(); i++) {
			list.add(p.get(i));
		}
		return false;
	}

	@Override
	public void MoveSong(Song s, int index) {
		if (list.contains(s)) {
			list.set(index, s);
		}
		
	}
	@Override
	public void MoveAllSongs(int positions) {
		
		
	}

}
