package MainCode.Rooms;

import java.util.ArrayList;

public class RoomArray {
	
	private ArrayList<Room> roomArray;
	
	public RoomArray()
	{
		roomArray = new ArrayList<Room>();
		
		CryoRoom cryoRoom1 = new CryoRoom(0);
		CryoRoom cryoRoom2 = new CryoRoom(1);
		CryoRoom cryoRoom3 = new CryoRoom(2);
		CryoRoom cryoRoom4 = new CryoRoom(3);
		CryoRoom cryoRoom5 = new CryoRoom(4);
		
		roomArray.add(cryoRoom1);
		roomArray.add(cryoRoom2);
		roomArray.add(cryoRoom3);
		roomArray.add(cryoRoom4);
		roomArray.add(cryoRoom5);
		
		
		//Hallways
		Hallway hallway1 = new Hallway(0);
		Hallway hallway2 = new Hallway(1);
		Hallway hallway3 = new Hallway(2);
		Hallway hallway4 = new Hallway(3);
		Hallway hallway5 = new Hallway(4);
		Hallway hallway6 = new Hallway(5);
		Hallway hallway7 = new Hallway(6);
		Hallway hallway8 = new Hallway(7);
		Hallway hallway9 = new Hallway(8);
		
		//Security
		Security security = new Security();
		
		//Spaced ECell Room
		SpacedEnergyCell spacedEnergyCell = new SpacedEnergyCell();
		
		//Server Banks
		ServerBank serverBank1 = new ServerBank(1);
		ServerBank serverBank2 = new ServerBank(2);
		ServerBank serverBank3 = new ServerBank(3);
		ServerBank serverBank4 = new ServerBank(4);
		
		//Ships AI
		ShipsAI shipsAI = new ShipsAI();
		
		//Engine Room
		EngineRoom engineRoom = new EngineRoom();
		
		//Communications
		Communications communications = new Communications();
		
		//Ships Weapons
		ShipWeapons shipWeapons = new ShipWeapons();
		
		//Cargo Room
		CargoRoom cargoRoom1 = new CargoRoom(1);
		CargoRoom cargoRoom2 = new CargoRoom(2);
		CargoRoom cargoRoom3 = new CargoRoom(3);
		
		//Viewing
		Viewing viewing1 = new Viewing(1);
		Viewing viewing2 = new Viewing(2);
		
		//Navigations
		Navigation navigation = new Navigation();
		
		//Command Center
		CommandCenter commandCenter = new CommandCenter();
		
		
		//index 0
		roomArray.add(cryoRoom1);
		//index 1
		roomArray.add(cryoRoom2);
		//index 2
		roomArray.add(cryoRoom3);
		//index 3
		roomArray.add(cryoRoom4);
		//index 4
		roomArray.add(cryoRoom5);
		//index 5
		roomArray.add(hallway1);
		//index 6
		roomArray.add(hallway2);
		//index 7
		roomArray.add(hallway3);
		//index 8
		roomArray.add(security);
		//index 9
		roomArray.add(spacedEnergyCell);
		//index 10
		roomArray.add(hallway4);
		//index 11
		roomArray.add(hallway5);
		//index 12
		roomArray.add(serverBank1);
		//index 13
		roomArray.add(serverBank2);
		//index 14
		roomArray.add(serverBank3);
		//index 15
		roomArray.add(serverBank4);
		//index 16
		roomArray.add(hallway6);
		//index 17
		roomArray.add(hallway7);
		//index 18
		roomArray.add(shipsAI);
		//index 19
		roomArray.add(hallway8);
		//index 20
		roomArray.add(hallway9);
		//index 21
		roomArray.add(communications);
		//index 22 
		roomArray.add(shipsAI);
		//index 23
		roomArray.add(engineRoom);
		//index 24
		roomArray.add(cargoRoom1);
		//index 25
		roomArray.add(cargoRoom2);
		//index 26
		roomArray.add(cargoRoom3);
		//index 27
		roomArray.add(viewing1);
		//index 28
		roomArray.add(viewing2);
		//index 29
		roomArray.add(navigation);
		//index 30 
		roomArray.add(commandCenter);
		//index 31
		roomArray.add(shipWeapons);
		
	}

	public ArrayList<Room> getRoomArray() {
		return roomArray;
	}

	public void setRoomArray(ArrayList<Room> roomArray) {
		this.roomArray = roomArray;
	}

	
	@Override
	public String toString() {
		return "RoomArray [roomArray=" + roomArray + "]";
	}

	public static void main(String[] args)
	{
		ArrayList<Room> roomArray = new ArrayList<Room>();
		
		//CryoRooms
		CryoRoom cryoRoom1 = new CryoRoom(0);
		CryoRoom cryoRoom2 = new CryoRoom(1);
		CryoRoom cryoRoom3 = new CryoRoom(2);
		CryoRoom cryoRoom4 = new CryoRoom(3);
		CryoRoom cryoRoom5 = new CryoRoom(4);
		
		//Hallways
		Hallway hallway1 = new Hallway(0);
		Hallway hallway2 = new Hallway(1);
		Hallway hallway3 = new Hallway(2);
		Hallway hallway4 = new Hallway(3);
		Hallway hallway5 = new Hallway(4);
		Hallway hallway6 = new Hallway(5);
		Hallway hallway7 = new Hallway(6);
		Hallway hallway8 = new Hallway(7);
		Hallway hallway9 = new Hallway(8);
		
		//Security
		Security security = new Security();
		
		//Spaced ECell Room
		SpacedEnergyCell spacedEnergyCell = new SpacedEnergyCell();
		
		//Server Banks
		ServerBank serverBank1 = new ServerBank(1);
		ServerBank serverBank2 = new ServerBank(2);
		ServerBank serverBank3 = new ServerBank(3);
		ServerBank serverBank4 = new ServerBank(4);
		
		//Ships AI
		ShipsAI shipsAI = new ShipsAI();
		
		//Engine Room
		EngineRoom engineRoom = new EngineRoom();
		
		//Communications
		Communications communications = new Communications();
		
		//Ships Weapons
		ShipWeapons shipWeapons = new ShipWeapons();
		
		//Cargo Room
		CargoRoom cargoRoom1 = new CargoRoom(1);
		CargoRoom cargoRoom2 = new CargoRoom(2);
		CargoRoom cargoRoom3 = new CargoRoom(3);
		
		//Viewing
		Viewing viewing1 = new Viewing(1);
		Viewing viewing2 = new Viewing(2);
		
		//Navigations
		Navigation navigation = new Navigation();
		
		//Command Center
		CommandCenter commandCenter = new CommandCenter();
		
		
		//index 0
		roomArray.add(cryoRoom1);
		//index 1
		roomArray.add(cryoRoom2);
		//index 2
		roomArray.add(cryoRoom3);
		//index 3
		roomArray.add(cryoRoom4);
		//index 4
		roomArray.add(cryoRoom5);
		//index 5
		roomArray.add(hallway1);
		//index 6
		roomArray.add(hallway2);
		//index 7
		roomArray.add(hallway3);
		//index 8
		roomArray.add(security);
		//index 9
		roomArray.add(spacedEnergyCell);
		//index 10
		roomArray.add(hallway4);
		//index 11
		roomArray.add(hallway5);
		//index 12
		roomArray.add(serverBank1);
		//index 13
		roomArray.add(serverBank2);
		//index 14
		roomArray.add(serverBank3);
		//index 15
		roomArray.add(serverBank4);
		//index 16
		roomArray.add(hallway6);
		//index 17
		roomArray.add(hallway7);
		//index 18
		roomArray.add(shipsAI);
		//index 19
		roomArray.add(hallway8);
		//index 20
		roomArray.add(hallway9);
		//index 21
		roomArray.add(communications);
		//index 22 
		roomArray.add(shipsAI);
		//index 23
		roomArray.add(engineRoom);
		//index 24
		roomArray.add(cargoRoom1);
		//index 25
		roomArray.add(cargoRoom2);
		//index 26
		roomArray.add(cargoRoom3);
		//index 27
		roomArray.add(viewing1);
		//index 28
		roomArray.add(viewing2);
		//index 29
		roomArray.add(navigation);
		//index 30 
		roomArray.add(commandCenter);
		
		
		System.out.println(roomArray);
	}
}
