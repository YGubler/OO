import java.util.Scanner;

public class SwitchBox {
	/**
	 * Represents the 16 switches of the box.
	 */
	private short switches;

	/**
	 * Initializes all switches turned off.
	 */
	public SwitchBox() {
		switches = 0x0000;
	}

	/**
	 * Turn all switches on.
	 */
	public void activateAllSwitches() {
		switches |= 0xFFFF;
	}

	/**
	 * Turn all switches off.
	 */
	public void deactivateeAllSwitches() {
		switches <<= 16;
	}

	/**
	 * Activate all deactivated switches and vice versa.
	 */
	public void invertAllSwitches() {
		switches = (short) ~switches;
	}

	/**
	 * Turn a specific switch on.
	 * 
	 * @param number
	 *            Position of the switch.
	 */
	public void activateSwitch(int number) {
		switches |= (1 << number);
	}

	/**
	 * Turn a specific switch off.
	 * 
	 * @param number
	 *            Position of the switch.
	 */
	public void deactiviateSwitch(int number) {
		switches &= ~(1 << number);
	}

	/**
	 * Activate a specific switch if turned on; otherwise deactivate it.
	 * 
	 * @param number
	 *            Position of the switch.
	 */
	public void invertSwitch(int number) {
		switches ^= (1 << number);
	}

	/**
	 * Activate all switches in a specific range.
	 * 
	 * @param from
	 *            Lower (included) position of range.
	 * @param to
	 *            Upper (included) position in range.
	 */
	public void activateRange(int from, int to) {
		if (from > to) {
			System.err.println("invalid imput\n");
		} else {
			while (from <= to) {
				switches |= (1 << to);
				--to;
			}
		}
	}

	/**
	 * Deactivate all switches in a specific range.
	 * 
	 * @param from
	 *            Lower (included) position of range.
	 * @param to
	 *            Upper (included) position in range.
	 */
	public void deactivateRange(int from, int to) {
		if (from > to) {
			System.err.println("invalid imput\n");
		} else {
			while (from <= to) {
				switches &= ~(1 << to);
				--to;
			}
		}
	}

	/**
	 * Activate all deactivated switches and vice versa in a specific range
	 * 
	 * @param from
	 *            Lower (included) position of range.
	 * @param to
	 *            Upper (included) position in range.
	 */
	public void invertRange(int from, int to) {
		if (from > to) {
			System.err.println("invalid imput\n");
		} else {
			while (from <= to) {
				switches ^= (1 << to);
				--to;
			}
		}
	}

	/**
	 * Print the switch states in a binary representation
	 */
	public String toString() {
		StringBuilder bui = new StringBuilder();
		for (short mask = 0x0001; mask != 0; mask <<= 1) {
			bui.append((switches & mask) == 0 ? "0 " : "1 ");
		}
		return bui.toString();
	}

	public static void main(String[] args) {
		SwitchBox sk = new SwitchBox();

		System.out.println("Initial state:");
		System.out.println(sk);

		System.out.println("\nEnable all switches:");
		sk.activateAllSwitches();
		System.out.println(sk);

		// TODO: Add your test code

		// Turn off all Switches by bitwise shift by 16
		sk.deactivateeAllSwitches();
		System.out.println("\nTurn off all Switches\n" + sk);

		// Invert all Switches by complement on one
		sk.invertAllSwitches();
		System.out.println("\nInvert all Switches\n" + sk);

		// Deactivate all switches in a specific range.
		System.out.print("\nWhich bitrange would you like to deactivate?\n");
		sk.deactivateRange((new Scanner(System.in).nextInt()) - 1,
				(new Scanner(System.in).nextInt()) - 1);
		System.out
				.println("Deactivate all switches in a specific range\n" + sk);

		// Turn a specific switch on
		System.out.print("\nWhich bit would you like to turn on?\n");
		sk.activateSwitch((new Scanner(System.in).nextInt()) - 1);
		System.out.println("Turn a specific switch on\n" + sk);

		// Turn a specific switch off.
		System.out.print("\nWich bit would you like to turn of?\n");
		sk.deactiviateSwitch((new Scanner(System.in).nextInt()) - 1);
		System.out.println("Turn a specific switch off\n" + sk);

		// Activate a specific switch if turned on; otherwise deactivate it.
		System.out.print("\nWhich bit would you like to change?\n");
		sk.invertSwitch((new Scanner(System.in).nextInt()) - 1);
		System.out.println("Invert a specific switch\n" + sk);

		// Activate all switches in a specific range.
		System.out.print("\nWhich bitrange would you like to activate?\n");
		sk.activateRange((new Scanner(System.in).nextInt()) - 1, (new Scanner(
				System.in).nextInt()) - 1);
		System.out.println("Activate all switches in a specific range\n" + sk);

		// Activate all deactivated switches and vice versa in a specific range
		System.out.print("\nWhich bitrange would you like to change?\n");
		sk.invertRange((new Scanner(System.in).nextInt()) - 1, (new Scanner(
				System.in).nextInt()) - 1);
		System.out.println("Invert all switches in a specific range\n" + sk);
	}
}
