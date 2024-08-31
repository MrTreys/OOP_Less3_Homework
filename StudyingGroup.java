import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class StudyingGroup implements Iterable<Student>{
    private final Integer groupNumber;
    private ArrayList<Student> group;

    public StudyingGroup(Integer groupNumber, ArrayList<Student> group) {
        this.groupNumber = groupNumber;
        this.group = group;
    }

    public StudyingGroup(Integer groupNumber) {
        this(groupNumber, new ArrayList<>());
    }

    public Integer getGroupNumber() {
        return groupNumber;
    }

    public ArrayList<Student> getGroup() {
        return group;
    }

    public void acceptStudent(ArrayList<Student> students) {
        for (Student student : students) {
            if (!student.getGroup().equals(groupNumber)) student.setGroup(groupNumber);
            group.add(student);
        }
    }

    public void acceptStudent(Student student) {
        acceptStudent(new ArrayList<Student>(Arrays.asList(student)));
    }

    public void removeStudent(Student student) {
        group.remove(student);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Student student : group) sb.append(student + " ");
        return String.valueOf(sb);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudyingGroupIterator(this);
    }
}
