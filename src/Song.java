/* Class: CISC 3130
 * Section: MY9 (Monday and Wednesday)
 * EmplId: 23794282
 * Name: Sean Wy Tze Yap
*/

import java.io.PrintWriter;

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
    public void display(PrintWriter out) {
	out.println("Song name: " + name + "  Artist: " + artist);
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
