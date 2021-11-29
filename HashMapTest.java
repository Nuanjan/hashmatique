import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        getTrackList();
    }

    public static void getTrackList() {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("YoungBoy Never Broke Again", "I woke up I aint see nobody");
        trackList.put("Witness", "If I lost it all today.");
        trackList.put("Something just like this", "I've been reading books of olds");
        trackList.put("Wolves", "I woke up I aint see nobody");
        Set<String> keys = trackList.keySet();
        System.out.println("example song: " + trackList.get("Wolves"));
        System.out.println("-----------------------------");
        for (String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}