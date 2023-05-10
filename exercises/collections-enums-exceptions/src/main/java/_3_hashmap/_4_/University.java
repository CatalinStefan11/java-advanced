package _3_hashmap._4_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {
    private String name;
    private Map<Course, List<Student>> courseMap;

    public University(String name) {
        this.name = name;
        this.courseMap = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public Map<Course, List<Student>> getCourseMap() {
        return courseMap;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourseMap(Map<Course, List<Student>> courseMap) {
        this.courseMap = courseMap;
    }

    public boolean registerStudent(Student student, Course course) {
        if (courseMap.containsKey(course)) {
            List<Student> students = courseMap.get(course);
            if (students.size() < course.getCapacity()) {
                students.add(student);
                return true;
            }
        } else {
            List<Student> students = new ArrayList<>();
            students.add(student);
            courseMap.put(course, students);
            return true;
        }
        return false;
    }
}
