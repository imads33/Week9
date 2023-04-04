import java.util.*;

class Students {
    private int id;
    private String name;
    private String dept;
    private int age;

    Students(int id, String name, String dept, int age) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getAge() {
        return age;
    }
}

class IdComparator implements Comparator<Students> {
    public int compare(Students s1, Students s2) {
        if (s1.getId() > s2.getId()) {
            return 1;
        } else if (s1.getId() < s2.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class ComparatorDemo1 {
    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList<Students>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            students.add(new Students(sc.nextInt(), sc.next(), sc.next(), sc.nextInt()));
        }
        Collections.sort(students, new IdComparator());
        for (Students st : students) {
            System.out.println(st.getId() + " " + st.getName() + "" + st.getDept() + " " + st.getAge());
        }
    }
}