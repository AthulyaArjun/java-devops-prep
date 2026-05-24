/**
 * equals() compares object data. But hash collections use hashcode() to locate objects.
 *hashcode() is a method in Object class. It returns an Integer value.
 * syntax: public int hashcode()
 * By default hashcode() generates hash based on memory location.
 * Even if data is same, different objects will be in different memory locations, hence different hashcode--> Big problem

 * suppose s1.equals(s2) returns true, but s1.hashCode() != s2.hashCode() --> Violates java rules
 * Java contract says: if a.equals(b) == true then a.hashCode() == b.hashCode() must also be true
 * Why?
 * Because HashMap/HashSet depend on this rule.
 * If rule breaks:
 * duplicate objects may enter HashSet
 * HashMap lookup fails
 * collection behavior becomes incorrect
 *      So we override hashCode()

 * Why override hashCode() when overriding equals()?
 * Because equal objects MUST produce same hashCode.
 * SUPER IMPORTANT
 * You usually override: equals()AND hashCode() together.Not separately.
 */
package OOPS;

import java.util.Objects;

class Guardian{
    int id;
    String name;

    Guardian(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Guardian guardian){
            return this.id == guardian.id && this.name.equals(guardian.name);
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id,name);
        /*
        Objects.hash(id, name);
        This generates hash based on:id, name
        Now: same data → same hashCode
         */
    }
}

public class HashCode_31 {
    public static void main(String[] args) {
        Guardian guardian1 = new Guardian(1,"Peter");
        Guardian guardian2 = new Guardian(2,"Gamora");
        Guardian guardian3 = new Guardian(2,"Gamora");
        System.out.println(guardian1.hashCode());// 77006284
        System.out.println(guardian2.hashCode());//2125609802
        System.out.println(guardian3.hashCode());//2125609802
        /*
        without overriding hashcode(), it produces different hashCode even though both are same
        System.out.println(guardian2.hashCode());//250421012
        System.out.println(guardian3.hashCode());//1915318863
         */
    }
}

/*
Q3. Can unequal objects have same hashCode?
YES. This is called: hash collision. Allowed in Java.

Q4. Can equal objects have different hashCode?
NO. Violates Java contract.
 */