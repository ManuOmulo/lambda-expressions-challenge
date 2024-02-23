import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Main {
  public static void main(String[] args) {
    Consumer<String> printWordsLambda = sentence -> {
      String[] parts = sentence.split(" ");
      for (String part : parts) {
        System.out.println(part);
      }
    };
    printWordsLambda.accept("The quick brown fox jumped over the lazy dog");

    Consumer<String> printWordsForEach = sentence -> {
      String[] parts = sentence.split(" ");
      Arrays.asList(parts).forEach(part -> System.out.println(part));
    };
    printWordsForEach.accept("The quick brown fox jumped over the lazy dog");

    Consumer<String> printWordsConcise = sentence -> {
      Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
    };
    printWordsConcise.accept("The quick brown fox jumped over the lazy dog");

    System.out.println("-".repeat(30));

    UnaryOperator<String> everySecondChar = source -> {
      StringBuilder returnValue = new StringBuilder();
      for (int i = 0; i < source.length(); i++) {
        if (i % 2 == 1) {
          returnValue.append(source.charAt(i));
        }
      }
      return returnValue.toString();
    };
    System.out.println(everySecondCharacter(everySecondChar, "1234567890"));


  }

  public static String everySecondCharacter(UnaryOperator<String> function, String input) {
    return function.apply(input);
  }
}
