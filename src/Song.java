
public class Song {
	private String name, artist;
	private float playtime;

	
	public Song(String mname, String martist, float mplaytime) {
		String name=mname,artist=martist;
		float playtime=mplaytime;
    }
	
	public String toString(){
		String mString="Song: "+name+", artist: "+artist+", playtime: "+playtime;
		return mString;
		
	}
	
	public double getPlayTime(){
		return playtime;
	}
	
	public String getArtist(){
		return artist;
	}
	
	public String getSongName(){
		return name;
	}
	
	public boolean equals(Song s){
		if (s.getArtist()!=this.getArtist())
			return false;
		if (s.getSongName()!=this.getSongName())
			return false;
		if (s.getPlayTime()!=this.getPlayTime())
			return false;
		return true;
	}

}
