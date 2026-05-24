/**
 * object instanceOf ClassName --> returns true/false
 */

package OOPS;

class Marvel{
    int id;
    String name;
    int year;

    Marvel(int id, String name, int year){
        this.id = id;
        this.name = name;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Marvel marvel){
            return this.id == marvel.id && this.name.equals(marvel.name) && this.year == marvel.year;
        }
        return false;
    }
}
public class InstanceOf_30 {
    public static void main(String[] args) {
        Marvel m1 = new Marvel(100,"Iron Man", 2003);
        Marvel m2 = new Marvel(100,"Iron Man", 2003);
        Marvel m3 = new Marvel(101,"Spider-Man", 2016);
        String s = "Java";

        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(m3));
        System.out.println(m1.equals(s));
    }
}
