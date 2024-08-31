import java.util.ArrayList;

public class Controller {
    private final StudyingGroupService studyingGroupService = new StudyingGroupService();
    private final StreamService streamService = new StreamService();
    public void removeStudent(StudyingGroup group, String name) {
        studyingGroupService.removeStudent(group, name);
    }

    public  ArrayList<Student> sortById(StudyingGroup group) {
        return studyingGroupService.sortById(group);
    }

    public  ArrayList<Student> sortByName(StudyingGroup group) {
        return studyingGroupService.sortByName(group);
    }

    public  ArrayList<Stream> sortStream(ArrayList<Stream> streams) {
        return streamService.sortStream(streams);
    }
}
