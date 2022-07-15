import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {
	
	public boolean match(String input, String template) {
		Pattern pattern = Pattern.compile(template);
		Matcher m = pattern.matcher(input);
		if (m.matches()) {
			System.out.println("String matches the given regex!");
		}
		else {
			System.out.println("String doesn't match the given regex!");
		}
			return true;
		}
	}

