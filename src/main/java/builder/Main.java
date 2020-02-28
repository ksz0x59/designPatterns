package builder;

public class Main {
    public static void main (String [] args)
    {
        House house = new House.HouseBuilder()
                .buildWalls("walls")
                .buildFloors("floors")
                .buildRoof("roof")
                .buildRooms("rooms")
                .build();
    }
}
