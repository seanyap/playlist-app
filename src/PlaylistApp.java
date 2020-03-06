/* Class: CISC 3130
 * Section: MY9 (Monday and Wednesday)
 * EmplId: 23794282
 * Name: Sean Wy Tze Yap
*/

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class PlaylistApp {

    public static void main(String[] args) throws IOException {
	SpotifyCSVProcessor processor = new SpotifyCSVProcessor();
	String[] inputFiles = {"../data/global-week-1.csv", "../data/global-week-2.csv", "../data/global-week-3.csv", "../data/global-week-4.csv"};
	for (int i=0; i<inputFiles.length; i++) {
	    processor.read(inputFiles[i]);
	}
	processor.sort();

	Playlist p = new Playlist(processor);
	PrintWriter out1 = new PrintWriter(new File("../data/output1.text"));
	p.displayPlaylist(out1);

	SongHistory sh = new SongHistory();
	PrintWriter out2 = new PrintWriter(new File("../data/output2.text"));
	p.remove(sh);
	p.remove(sh);
	p.remove(sh);
	p.remove(sh);
	sh.display(out2);

	out1.close();
	out2.close();
    }
}

