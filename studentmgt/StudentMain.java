package studentmgt;

import java.util.*;

public class StudentMain {

	private Map<String, Student> a = new HashMap<>();

	public static void main(String[] args) {
		StudentMain run = new StudentMain();
		run.runApp();
	}

	public void runApp() {
		a.put("a1", (new Student("a1", 22, "khadar")));
		a.put("a2", (new Student("a2", 23, "basha")));
		a.put("a3", (new Student("a3", 19, "ravi")));
		a.put("a4", (new Student("a4", 26, "ram")));
		converted();
	}

	public void converted() {
		Set<String> keys = a.keySet();
		for (String k : keys) {
			Student student = a.get(k);

			List<String> r = new ArrayList();
			r.add(student.getRollNo());

			if (student.getAge() % 2 == 0) {
				List<Student> le = new ArrayList();
				le.add(student);

			} else {
				List<Student> lo = new ArrayList();
				lo.add(student);
			}

		}

	}

}