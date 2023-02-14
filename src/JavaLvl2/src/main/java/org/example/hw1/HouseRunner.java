package org.example.hw1;

public class HouseRunner {
    public static void main(String[] args) {
        Room room1 = new Room(false);
        Room room2 = new Room(true);
        Room room3 = new Room(false);

        Apartment apartment1 = new Apartment(1, new Room[]{room1, room2, room3});
        Apartment apartment2 = new Apartment(2, new Room[]{room1, room2});
        Apartment apartment3 = new Apartment(3, new Room[]{room1});
        Apartment apartment4 = new Apartment(4, new Room[]{room1});
        Apartment apartment5 = new Apartment(5, new Room[]{room1});

        Floor floor1 = new Floor(1, new Apartment[]{apartment1, apartment2, apartment3});
        Floor floor2 = new Floor(2, new Apartment[]{apartment4, apartment5});

        House house = new House(7, new Floor[]{floor1, floor2});
        printAllInformation(house);
    }

    private static void printAllInformation(House house) {

        house.print();
        Floor[] floors = house.getFloors();
        for (Floor floor : floors) {
            floor.print();
            Apartment[] apartments = floor.getApartments();
            for (Apartment apartment : apartments) {
                apartment.print();
                Room[] rooms = apartment.getRooms();
                for (Room room : rooms) {
                    room.print();
                }
            }
        }

    }
}
