/**
Strong "has-a" relationship

Composition is a type of association where:
    one class owns another class completely
    The part cannot exist independently of the whole
    The part is usually created inside the whole

Example: A House has a Room, but a Room cannot exist without a House
If the House is destroyed, Room also disappears.

| Feature         | Composition                                |
| --------------- | ------------------------------------------ |
| Coupling        | Strong                                     |
| Lifetime        | Part's lifetime is controlled by the whole |
| Object Creation | Whole class creates the part               |
| Ownership       | Strong (tight bond)                        |


 */


package OOPS;


class Room{
    private String roomName;

    public Room(String roomName){
        this.roomName = roomName;
    }

    public String getRoomName(){
        return roomName;
    }
}

class House{
    private Room kitchen; //Composition : House creates Room
    private Room bedroom;

    public House(){
        //Room objects are created inside House constructor
        bedroom = new Room("Master");
        kitchen = new Room("Modular");
    }

    public void showHouseDetails(){
        System.out.println("Room:"+bedroom.getRoomName());
        System.out.println("Room:"+kitchen.getRoomName());
    }
}

public class Composition_37 {
    public static void main(String[] args) {
        House house = new House();

        house.showHouseDetails();
    }
}

/*
Room is created inside House
If you delete the House, the Room doesn’t exist
So it's a strongly owned relationship
 */