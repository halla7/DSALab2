import java.util.Random;

public class Driver {

	
	public static void main(String[] args) {
//		ArrayListPlayList playlist = new ArrayListPlayList("playlist1");
//		LinkedListPlaylist playlist = new LinkedListPlaylist("playlist1");
//		CircularLinkedListPlayList playlist = new CircularLinkedListPlayList("playlist1");
		Random randomNumbers = new Random();
//		String mSong, mArtist;
//		double mPlayTime;
		long startTime = System.currentTimeMillis();
//		for (int i = 0; i < 100; i++) {
//			playlist.addSong(new Song(newString(3), newString(2), randomNumbers.nextDouble()));
//		}
//		long endTime = System.currentTimeMillis();
//		System.out.println("That took " + (endTime - startTime) + " milliseconds");
//		System.out.println(playlist.totalSongs());
//		Song s1 = new Song("Yellow", "Cold Play", 2.4);
//		Song s2 = new Song("Clocks", "Cold Play", 3.56);
//		ArrayListPlayList p = new ArrayListPlayList("ColdPlayHits");
//		LinkedListPlaylist p = new LinkedListPlaylist("ColdPlayHits");
		CircularLinkedList p = new CircularLinkedList("Step4-5Test");
		for (int i=0; i<500000; i++) {
			Song s1 = new Song(newString(3), newString(2), randomNumbers.nextDouble());
			p.add(s1);			
		}
//		System.out.println(playlist.totalSongs());
//		p.addSong(s1);
//		p.addSong(s2);
//		System.out.println(p.totalSongs());
//		System.out.println(p.playlistTime());
//		p.removeSong(s2);
//		System.out.println(p.totalSongs());
//		p.addSong(s2);
//		System.out.println("Is a song named 'Clocks' in this playlist : "+p.isSongInPlaylist("Clocks"));
//		System.out.println("Is a song named 'Yellow' in this playlist : "+p.isSongInPlaylist("Yellow"));
//		p.songsByArtist("Cold Play");
//		p.songsByArtist("Grease Monkey");
//		Song s3 = new Song("Around the Sun", "REM", 4.30);
//		Song s4 = new Song("The Lord is Good (Live)", "Fred Hammond", 7.14);
//		p.addSong(s3);
//		p.addSong(s4);
//		p.MoveSong(s4,2);
//		System.out.println(p.totalSongs());
//		System.out.println(p.playlistTime());
//		System.out.println(s3.getSongName());
//		System.out.println(s2.getSongName());
//		System.out.println(s1.getSongName());
//		Playlist favorites = new ArrayListPlayList("favorites");
//		favorites.addSong(s3);
//		favorites.addSong(s1);
		p.swap(randomNumbers.nextInt(5000),randomNumbers.nextInt(5000));
		long endTime = System.currentTimeMillis();
		System.out.println("That took " + (endTime - startTime) + " milliseconds");
		p.shift(5);
//		favorites.getList();
		
	}
	
	static String newString(int m) {
		int roll;
		String name=null;
		Random randomNumbers = new Random();
		for (int i=0; i<m; i++) {
			for (int j=0; j<10; j++) {
				for (int k=0; k<m; ++k) {
					roll=randomNumbers.nextInt(122);
					if (roll>65 && roll<123) {
						name+=(char) roll;
					}
				}
			}
		}
		return name;
	}
}
