package Interview_program;

public class acqu {

	String name;
	acqu(String name) {
		this.name = name;
	}
	public void getStatus() {
		System.out.println(name + "");
	}		
}

class friend extends acqu{

	String homeTown;
	friend(String name, String homeTown) {
		super(name);
		this.homeTown = homeTown;
	}
	public void getStatus() {
		System.out.println(name + "" + homeTown);
	}
}

class BestFriend extends friend{

	String favouriteSong;	
	BestFriend(String name, String homeTown, String favouriteSong) {
		super(name, homeTown);
		this.favouriteSong = favouriteSong;
	}
	public void getStatus() {
		System.out.println(name + "" + homeTown + "" + favouriteSong);
	}
}


