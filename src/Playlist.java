public class Playlist {

    public Playlist() {
	head = null;
	last = null;
    }

    public Playlist(SpotifyCSVProcessor p) {
	this();
	insert(p);
    }

    public void insert(String songName, String artist) {
	Song newSong = new Song(songName, artist);
	if (head == null) { 
	    head = newSong;
	    last = head;
	}
	else {
	    last.insertNext(newSong);
	    last = newSong;
	}
    }

    public void insert(SpotifyCSVProcessor p) {
	for (int i=0; i<p.getSize(); i++) {
            insert(p.getSong(i), p.getArtist(i)); 
	}
    }

    public void remove(SongHistory sh) {
	if (head != null) {
	    Song nextSong = head.getNext();
	    sh.addSong(head);
	    if (nextSong != null) 
		head = nextSong;
	    else { 
		head = null;
		System.out.println("Playlist is empty!");
	    }
	}
	else {
	    System.out.println("No song to remove. Playlist is empty!");
	} 
    }
    public void displayPlaylist() {
	head.display();
	Song newHead = head.getNext();
	while (newHead != null) {
	    newHead.display();
	    newHead = newHead.getNext();
        }
    }
	
    // Fields
    private Song head; 
    private Song last;
}


 
















