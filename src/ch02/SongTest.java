package ch02;

public class SongTest {

	public static void main(String[] args) {
		Song song = new Song();

		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setAlbum("Real");
		song.setComposer("이민수");
		song.setYear(2010);
		song.setTrack(3);

		song.show();
		
		Song song2 = new Song("좋은날","아이유","Real","이민수",2010,3);
		song2.show();
		
		Song song3 = new Song("암욜맨","슈쥬");
		song3.show();
		
		Song song4 = new Song("유재석EXO", "Dancing King");
		song4.show();
	}
}
