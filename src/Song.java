public class Song {
    public Song(String n, String a) {
        name = n;
        artist = a;
        next = null;
    }
    public void insertNext(Song n) {
        this.next = n;
    }
    public Song getNext() {
        return next;
    }
    public void display() {
	System.out.println("Song name: " + name + "  Artist: " + artist);
    }
    public String getName() {
	return name;
    }
    public String getArtist() {
	return artist;
    }
    // Fields
    private String name;
    private String artist;
    private Song next;
}
