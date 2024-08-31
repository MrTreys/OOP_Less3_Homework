import java.util.ArrayList;
import java.util.Iterator;

public class StudyingGroupIterator implements Iterator<Student> {
    private final ArrayList<Student> workingGroup;

    public StudyingGroupIterator(StudyingGroup workingGroup) {
        this.workingGroup = workingGroup.getGroup();
    }

    private int index = 0;

    @Override
    public boolean hasNext() {
        return index < workingGroup.size();
    }

    @Override
    public Student next() {
        if (index >= workingGroup.size()) return null;
        return workingGroup.get(index++);
    }

    @Override
    public void remove() {
        workingGroup.remove(index);
    }
}
