package day12;
class Plane{
	void takeoff() {
		System.out.println("Plane is taking off");
	}
	void fly() {
		System.out.println("Plane is flying");
		}
	void land() {
		System.out.println("Plane is Landing");
	}
}
class CargoPlane extends Plane
{
	void fly() {
		System.out.println("cargoPlane is Flying at low heights");
	}
	void CarryCargo() {
		System.out.println("CargoPlane carries Cargo");
	}
}
class PassengerPlane extends Plane{
	void fly() {
		System.out.println("PassengerPlane is Flying at medium heights");
	}
	void CarryPassengers() {
		System.out.println("PassengerPlane carries Passengers");
	}
}
class FighterPlane extends Plane
{
	void fly() {
		System.out.println("FighterPlane is Flying at great heights");
	}
	void CarryWeapons() {
		System.out.println("FighterPlane carries Weapons");
	}
}

public class SpecialisedMethods {

	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.CarryCargo();
		
		PassengerPlane pp=new PassengerPlane();
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.CarryPassengers();
		
		FighterPlane fp=new FighterPlane();
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.CarryWeapons();

	}

}
