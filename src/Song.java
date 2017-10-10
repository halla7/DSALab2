// text added 10/6/17
public class Song {
	private String name, artist;
	private double playtime;

	
	public Song(String mname, String martist, double mplaytime) {
		String name, artist;
		double playtime;
		this.name=mname;
		this.artist=martist;
		this.playtime=mplaytime;
//		System.out.println(this.toString());
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
