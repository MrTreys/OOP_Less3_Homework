import java.util.ArrayList;
import java.util.Iterator;

public class Stream implements Iterator<StudyingGroup>{
    private ArrayList<StudyingGroup> stream;
    private final Integer streamNumber;
    private static Integer defaultStreamNumber = 1;
    private int index;

    public Stream(ArrayList<StudyingGroup> stream, int streamNumber) {
        this.stream = stream;
        this.streamNumber = streamNumber;
    }

    public Stream(ArrayList<StudyingGroup> stream) {
        this(stream, defaultStreamNumber++);
    }

    public Stream() {
        this(new ArrayList<>());
    }

    public void addGroup(StudyingGroup group) {
        this.stream.add(group);
    }

    @Override
    public boolean hasNext() {
        return index < stream.size();
    }

    @Override
    public StudyingGroup next() {
        if (index < stream.size()) return stream.get(index++);
        return null;
    }

    @Override
    public void remove() {
        if (index < stream.size()) stream.remove(index);
    }

    public ArrayList<StudyingGroup> getStream() {
        return stream;
    }

    public Integer getStreamNumber() {
        return streamNumber;
    }

    public void resetIterator() {
        this.index = 0;
    }
}
