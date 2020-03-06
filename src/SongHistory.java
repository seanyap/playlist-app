public class SongHistory {
    // Constructors
    public SongHistory() {
	top = null;
    }

    // Interfaces
    public void addSong(Song s) {
	if (top == null)
	    top = s;
	else {
	    Song old = top;
	    top = s;
	    top.insertNext(old);
	}
    }
    public Song lastListened() {
	return top;	
    }
    public void displayHistory() {
	top.display();
	Song next = top.getNext();
	while (next != null) {
	    next.display();
	    next = next.getNext();
	}	
    }

    // Fields
    private Song top; 
}
