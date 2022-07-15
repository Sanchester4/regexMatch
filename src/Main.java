
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		RegexClass regex = new RegexClass();
		String result = null;
		String template = null;
		System.out.println("Type the regular expression:");
		try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNextLine()) {
				result = scanner.nextLine();
				System.out.println("Type the input for match:");
				template = result = scanner.nextLine();
				regex.match(result, template);
			}
			scanner.close();
		}
		}
}