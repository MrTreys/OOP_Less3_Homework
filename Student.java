public class Student implements Comparable<Student>{
    private final String name;
    private final long id;
    private Integer group;
    private Integer age;
    private static int defaultName = 1;
    private static long defaultId = 128; 

    public Student(String name, int group, int age) {
        this.name = name;
        this.id = defaultId++;
        this.group = group;
        this.age = age;
    }

    public Student(String name) {
        this(name, 1, 18);
    }

    public Student() {
        this(String.format("Student %d", defaultName++));
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return this.id;
    }

    public Integer getGroup() {
        return group;
    }

    public Integer getAge() {
        return age;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s, %d years old, group %d\n", this.name, this.age, this.group);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age, o.getAge());
    }
}
