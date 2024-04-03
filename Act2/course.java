package Act2;
import java.util.List;

public class course {
	private List<Student> students;

    public void Course(List<Student> students) {
        this.students = students;
    }

    public int countStudents() {
        return students.size();
    }
}

    