import java.io.IOException;

public class PlaylistApp {

    public static void main(String[] args) throws IOException {
	SpotifyCSVProcessor processor = new SpotifyCSVProcessor();
	processor.read("../data/global-week-1.csv");
	processor.read("../data/global-week-2.csv");
	processor.read("../data/global-week-3.csv");
	processor.read("../data/global-week-4.csv");
	processor.sort();
	Playlist p = new Playlist(processor);
	p.displayPlaylist();
	SongHistory sh = new SongHistory();
	p.remove(sh);
	p.remove(sh);
	p.remove(sh);
	sh.display();
    }
    

}
