
public class Driver {

	
	public static void main(String[] args) {
		Song s1 = new Song("Yellow", "Cold Play", 2.4);
		Song s2 = new Song("Clocks", "Cold Play", 3.56);
		ArrayListPlayList p = new ArrayListPlayList("ColdPlayHits");
		p.addSong(s1);
		p.addSong(s2);
		System.out.println(p.totalSongs());
		System.out.println(p.playlistTime());
		p.removeSong(s2);
		System.out.println(p.totalSongs());
		p.addSong(s2);
		System.out.println(p.isSongInPlaylist("Clocks"));
		p.songsByArtist("Cold Play");
		p.songsByArtist("Grease Monkey");
		Song s3 = new Song("Around the Sun", "REM", 4.30);
		Playlist favorites = new ArrayListPlayList("favorites");
		favorites.addSong(s3);
		favorites.addSong(s1);
		
		favorites.getList();
		
	}
}
