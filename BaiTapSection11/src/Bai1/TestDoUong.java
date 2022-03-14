package Bai1;

public class TestDoUong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (DoUong drink : DoUong.values()) {
			System.out.println("ID Drink :" + drink.getId() + " || " + "Ten Do UOng :" + drink.getName());
		}
	}

}
