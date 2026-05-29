/*
What is Comparator in Java?
🔍 Key Concept:
Unlike Comparable, which is used inside the class itself,
Comparator is used outside the class to customize sorting logic.

🔄 Use when:
You want to sort the same class in different ways (e.g., sort students by name, marks, id, etc.)
You cannot or don’t want to modify the class to implement Comparable
class ClassNameComparator implements Comparator<ClassName> {
    public int compare(ClassName a, ClassName b) {
        // return comparison logic here
    }
}

 */

package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students{
    String name;
    int marks;

    Students(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public String toString(){
        return name+" - "+marks;
    }
}

class SortByName implements Comparator<Students>{
    @Override
    public int compare(Students a, Students b) {
        return a.name.compareTo(b.name);
    }
}

class SortByMarks implements Comparator<Students>{
    public int compare(Students a, Students b){
        return a.marks - b.marks;
    }
}

public class Comparator_27 {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students("Athulya",95));
        list.add(new Students("Riya",85));
        list.add(new Students("Balu",75));

        Collections.sort(list,new SortByName());

        for (Students s : list){
            System.out.println(s);
        }

        Collections.sort(list, new SortByMarks());

        for (Students s : list){
            System.out.println(s);
        }
    }
}
/*
Comparable vs Comparator in Java

| Feature               | `Comparable`                              | `Comparator`                         |
| --------------------- | ----------------------------------------- | ------------------------------------ |
| Location of logic     | Inside the class itself                   | In a separate class (external)       |
| Interface from        | `java.lang`                               | `java.util`                          |
| Method to implement   | `compareTo(T o)`                          | `compare(T o1, T o2)`                |
| Modifies model class? | Yes (you must implement it in your class) | No (model class remains untouched)   |
| Used with             | `Collections.sort(list)`                  | `Collections.sort(list, comparator)` |
| Purpose               | Default (natural) sorting                 | Custom or multiple sorting logics    |

✅ 1. Comparable – Sorting Logic Inside the Class
✅ 2. Comparator – Sorting Logic Outside the Class
When to Use What?
| Use Case                                                      | Prefer       |
| ------------------------------------------------------------- | ------------ |
| Want to define default sorting inside your class              | `Comparable` |
| Want to sort objects in different ways (by name, marks, etc.) | `Comparator` |
| Cannot modify class source code (e.g., comes from library)    | `Comparator` |

Real-World Analogy:
🔹 Comparable is like saying: "I always sort myself by height" (you define it in your own class)

🔹 Comparator is like someone else saying: "I want to sort you by name today" (external logic)

✅ Final Thought:
In practice, we often:
Use Comparable for one fixed rule (e.g., sort Employees by ID)
Use Comparator when we need flexibility (sort Employees by salary, name, department, etc.)

 */