/* Class: CISC 3130
 * Section: MY9 (Monday and Wednesday)
 * EmplId: 23794282
 * Name: Sean Wy Tze Yap
*/

import java.io.PrintWriter;

public class SongHistory {
    // Constructors
    public SongHistory() {
	top = null;
    }

    // Interfaces
    public void addSong(Song s) {
	Song recentlyListened = new Song(s.getName(), s.getArtist());
	if (top == null)
	    top = recentlyListened;
	else {
	    Song old = top;
	    top = recentlyListened;
	    top.insertNext(old);
	}
    }
    public Song lastListened() {
	return top;	
    }
    public void display(PrintWriter out) {
	top.display(out);
	Song next = top.getNext();
	while (next != null) {
	    next.display(out);
	    next = next.getNext();
	}	
    }

    // Fields
    private Song top; 
}
