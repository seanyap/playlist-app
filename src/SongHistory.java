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
    public void display() {
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
