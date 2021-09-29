import java.util.Set;
import java.util.HashMap;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Song 1", "These are song lyrics...");
        trackList.put("Song 2", "These are song lyrics...");
        trackList.put("Song 3", "These are song lyrics...");
        trackList.put("Song 4", "These are song lyrics...");

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.printf("%s: %s\n", key, trackList.get(key));
        }
    }
}