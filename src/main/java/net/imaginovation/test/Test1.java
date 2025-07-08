import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
public class Test1 {
	public static void main(String[] args) {
//		wordRev("Java is powerful");
//		checkUniqueChars("abcdefg");
//		checkUniqueChars("aabbcc");
//		countFrequency("aabbccdd");
//		stringCompression("aaabbdcccg");
		// moveAllZerosToEnd(new Integer[] { 0, 1, 0, 3, 12 });
		// System.out.println("Missing Number = " + findMissingNumber(new int[] { 1, 2,
		// 3, 4, 6 }, 6));
		// System.out.println("First Repeating Element = " + firstRepeatingElement(new
		// int[] { 1, 2, 1, 4, 6, 6 }));
//		System.out.println(detectDuplicatesInArray(new int[] { 3, 2, 1, 2, 4 }));
//		System.out.println(checkDuplicatesInArray(new int[] { 3, 2, 1, 2, 4 }));
		// groupByAnagram(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" });
		swap("hello suriya", "hello rakhu");
		commonElements(List.of("1", "2", "3", "4"), List.of("3", "4", "5", "6"));
	}
	public static void commonElements(List<String> l1, List<String> l2) {
		System.out.println(l1.stream().filter(item -> l2.contains(item)).collect(Collectors.toList()));
	}
	public static void swap(String one, String two) {
		System.out.println("One = " + one + ", Two = " + two);
		one += two;
		two = one.substring(0, one.length() - two.length());
		one = one.substring(two.length());
		System.out.println("One = " + one + ", Two = " + two);
	}
	public static Map<String, List<String>> groupByAnagram(String[] input) {
		Map<String, List<String>> response = new HashMap<>();
		for (String word : input) {
			char[] key = word.toCharArray();
			Arrays.sort(key);
			String strKey = new String(key);
			response.computeIfAbsent(strKey, k -> new ArrayList<>()).add(word);
		}
		return response;
	}
	public static Map<Integer, Integer> detectDuplicatesInArray(int[] input) {
		Map<Integer, Integer> response = new HashMap<>();
		for (int item : input) {
			int current = response.getOrDefault(item, 0);
			response.put(item, current + 1);
		}
		return response;
	}
	public static boolean checkDuplicatesInArray(int[] input) {
		Map<Integer, Integer> response = new HashMap<>();
		for (int item : input) {
			int current = response.getOrDefault(item, 0);
			response.put(item, current + 1);
		}
		return response.values().stream().filter(item -> item > 1).count() > 0 ? true : false;
	}
	public static int firstRepeatingElement(int[] input) {
		Set<Integer> accumulated = new HashSet<>();
		for (int i = 0; i < input.length; i++) {
			int current = input[i];
			if (accumulated.contains(current)) {
				return current;
			}
			accumulated.add(current);
		}
		return -1;
	}
	public static int findMissingNumber(int[] input, int n) {
		int expected = n * (n + 1) / 2;
		int actualSum = Arrays.stream(input).sum();
		return expected - actualSum;
	}
	public static void moveAllZerosToEnd(Integer[] input) {
		int index = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				input[index++] = input[i];
			}
		}
		while (index < input.length) {
			input[index++] = 0;
		}
		System.out.println(input);
	}
	public static void stringCompression(String input) {
		char prevChar = 0;
		int counter = 0;
		StringBuilder output = new StringBuilder();
		for (int i = 0; i <= input.length(); i++) {
			if (i == input.length()) {
				output.append(prevChar).append(counter > 1 ? counter : "");
			} else {
				if (counter == 0) {
					counter++;
					prevChar = input.charAt(i);
				} else {
					if (prevChar == input.charAt(i)) {
						counter++;
					} else {
						output.append(prevChar).append(counter > 1 ? counter : "");
						prevChar = input.charAt(i);
						counter = 1;
					}
				}
			}
		}
		System.out.println("String Compression=" + output.toString());
	}
	public static void countFrequency(String input) {
		Map<Character, Integer> counter = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			counter.put(c, counter.getOrDefault(c, 0) + 1);
		}
		System.out.println(counter);
	}
	public static void checkUniqueChars(String input) {
		boolean status = input.chars().mapToObj(item -> (char) item).distinct().count() == input.length();
		System.out.println(status);
	}
	public static void wordRev(String input) {
		List<String> data = Arrays.asList(input.split(" "));
		String output = "";
		for (int i = data.size() - 1; i >= 0; i--) {
			if (i != data.size() - 1) {
				output += " ";
			}
			output += data.get(i);
		}
		System.out.println(output);
	}
	public static void strRev(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		System.out.println(output);
	}
}


