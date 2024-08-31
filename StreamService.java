import java.util.ArrayList;

public class StreamService {
    public ArrayList<Stream> sortStream(ArrayList<Stream> streams) {
        streams.sort((s1, s2) -> Integer.compare(s1.getStream().size(), s2.getStream().size()));
        return streams;
    } 
}
