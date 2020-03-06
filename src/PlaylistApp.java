import java.io.IOException;

public class PlaylistApp {

    public static void main(String[] args) throws IOException {
	SpotifyCSVProcessor processor = new SpotifyCSVProcessor();
	processor.read("../data/global-week-4.csv");
	processor.displayList();
    }

}
