package Bai1;

public enum DoUong {
	CAFE(1, "cafe"), MILK_TEA(2, "milk tea");

	private int id;
	private String name;

	private DoUong(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
