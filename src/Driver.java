
public class Driver {

	
	public static void main(String[] args) {
//		ArrayListPlayList playlist = new ArrayListPlayList("playlist1");
//		LinkedListPlaylist playlist = new LinkedListPlaylist("playlist1");
//		CircularLinkedListPlayList playlist = new CircularLinkedListPlayList("playlist1");
//		long startTime = System.currentTimeMillis();
//		for (int i = 0; i < 1000000; i++) {
//			playlist.addSong(new Song("song", "artist", 2.0));
//		}
//		long endTime = System.currentTimeMillis();
//		
//		System.out.println("That took " + (endTime - startTime) + " milliseconds");
//		System.out.println(playlist.totalSongs());
		Song s1 = new Song("Yellow", "Cold Play", 2.4);
		Song s2 = new Song("Clocks", "Cold Play", 3.56);
//		ArrayListPlayList p = new ArrayListPlayList("ColdPlayHits");
//		LinkedListPlaylist p = new LinkedListPlaylist("ColdPlayHits");
		CircularLinkedListPlayList p = new CircularLinkedListPlayList("ColdPlayHits");
		p.addSong(s1);
		p.addSong(s2);
		System.out.println(p.totalSongs());
		System.out.println(p.playlistTime());
		p.removeSong(s2);
		System.out.println(p.totalSongs());
		p.addSong(s2);
		System.out.println("Is a song named 'Clocks' in this playlist : "+p.isSongInPlaylist("Clocks"));
		System.out.println("Is a song named 'Yellow' in this playlist : "+p.isSongInPlaylist("Yellow"));
		p.songsByArtist("Cold Play");
		p.songsByArtist("Grease Monkey");
		Song s3 = new Song("Around the Sun", "REM", 4.30);
//		System.out.println(s3.getSongName());
//		System.out.println(s2.getSongName());
//		System.out.println(s1.getSongName());
		Playlist favorites = new ArrayListPlayList("favorites");
		favorites.addSong(s3);
		favorites.addSong(s1);

		favorites.getList();
		
	}
}
