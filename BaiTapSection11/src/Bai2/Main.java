package Bai2;

public class Main {
	public static void main(String[] args) {
		Employee em = new Employee() {

			@Override
			public void salary() {
				System.out.println("l��ng 10tr");
			}

		};
		em.salary();
	}
}
