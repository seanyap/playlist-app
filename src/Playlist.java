/* Class: CISC 3130
 * Section: MY9 (Monday and Wednesday)
 * EmplId: 23794282
 * Name: Sean Wy Tze Yap
*/

import java.io.PrintWriter;

public class Playlist {

    public Playlist() {
	head = null;
	last = null;
    }

    public Playlist(SpotifyCSVProcessor p) {
	this();
	insert(p);
    }

    public void insert(Song newSong) {
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
            insert(new Song(p.getSong(i), p.getArtist(i))); 
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
    public void displayPlaylist(PrintWriter out) {
	head.display(out);
	Song newHead = head.getNext();
	while (newHead != null) {
	    newHead.display(out);
	    newHead = newHead.getNext();
        }
    }
	
    // Fields
    private Song head; 
    private Song last;
}


 
















