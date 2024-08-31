import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        StudyingGroup group1 = new StudyingGroup(1);
        StudyingGroup group2 = new StudyingGroup(2);
        StudyingGroupService studyingGroupService = new StudyingGroupService();

        for (int i = 0; i < 10; i++) {
            list.add(new Student(String.format("Student %d", i), 1, new Random().nextInt(18, 27)));
        }

        for (Student student : list) {
            if (new Random().nextBoolean()) group1.acceptStudent(student);
            else group2.acceptStudent(student);
        }

        StudyingGroupIterator iterator = new StudyingGroupIterator(group1);
        // StudyingGroupIterator iterator2 = new StudyingGroupIterator(group2);

        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }
        // System.out.println();

        // while (iterator2.hasNext()) {
        //     System.out.println(iterator2.next());
        // }

        Collections.sort(group1.getGroup());

        // iterator = new StudyingGroupIterator(group1);

        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        iterator = new StudyingGroupIterator(group1);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        group1 = new StudyingGroup(1, studyingGroupService.sortByName(group1));

        iterator = new StudyingGroupIterator(group1);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
