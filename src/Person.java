
public class Person {

	Direction direct;

	public Person() {
		super();
		this.direct = Direction.North;
	}

	public Direction getDirect() {
		return direct;
	}

	public void setDirect(Direction direct) {
		this.direct = direct;
	}

	public Direction changeD() {
		/*
		 * String x1 = "North"; String x2 = "East"; String x3 = "South"; String x4 =
		 * "West";
		 */

		/*
		 * if (this.direct.equals(Direction.North)) { this.direct = Direction.East; }
		 * else if (this.direct.equals(Direction.East)) { this.direct = Direction.South;
		 * } else if (this.direct.equals(Direction.South)) { this.direct =
		 * Direction.West; } else { this.direct = Direction.North; } return this.direct;
		 */
		int i = Direction.valueOf(this.direct.toString()).ordinal();
		if (i == 3) {
			this.direct = Direction.values()[0];
			return this.direct;
	} 
		else {
			this.direct = Direction.values()[i+1];
			return this.direct;

		}

	}

	@Override
	public String toString() {
		return "" + changeD();
	}

	public static void main(String[] args) {

		Person p = new Person();
		System.out.println(p);

	}

}
