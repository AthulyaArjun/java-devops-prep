/**
 * Association v/s Aggregation v/s Composition
 * These represent types of relationship between classes. They define how objects are related and
 * how tightly they are connected.
 *
 * Association : Has-a relationship
 *
 * It is a general connection between two classes where one object uses another.
 * Direction: One-way or two-way
 * Lifetime: Independent
 * Example: Teacher has-a department
 */

package OOPS;

class Department{
    private String departmentName;

    public Department(String department){
        this.departmentName = department;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}

class Teachers{
    private String teacherName;
    private Department department; // Teacher has a Department or Teacher uses a Department

    public Teachers(String teacherName, Department department){
        this.teacherName = teacherName;
        this.department = department;
    }


    void display(){
        System.out.println("Teacher name: "+teacherName);
        System.out.println("Department: "+department.getDepartmentName());
    }
}

public class Association_35 {
    public static void main(String[] args) {

        // create  department independently
        Department dpt = new Department("Computer Science");

        // create teacher and associate with department
        Teachers teachers = new Teachers("Revathy", dpt);

        teachers.display();
    }
}
