import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;

public class Prob105 {
  public static void main(String[] args) {
    try {
      List<String> input1 = Files.readAllLines(Paths.get("input1051.txt"), Charset.defaultCharset());
      List<String> input2 = Files.readAllLines(Paths.get("input1052.txt"), Charset.defaultCharset());
      BufferedWriter output = Files.newBufferedWriter(Paths.get("output105.txt"), Charset.defaultCharset());

      int lineCount = input1.size();
      if (input2.size() > lineCount) {
        lineCount = input2.size();
      }

      for (int i = 0; i < lineCount; i++) {
        ArrayList<String> values1 = new ArrayList<String>();
        ArrayList<String> values2 = new ArrayList<String>();

        if (i < input1.size()) {
          values1 = splitCsvLine(input1.get(i));
        }
        if (i < input2.size()) {
          values2 = splitCsvLine(input2.get(i));
        }

        int columnCount = values1.size();
        if (values2.size() > columnCount) {
          columnCount = values2.size();
        }

        for (int j = 0; j < columnCount; j++) {
          int value1 = getValue(values1, j);
          int value2 = getValue(values2, j);

          output.write("" + (value1 * value2));
          if (j + 1 < columnCount) {
            output.write(",");
          }
        }
        if (i + 1 < lineCount) {
          output.newLine();
        }
      }

      output.close();
    } catch (IOException e) {
      System.err.println("IOException " + e.toString());
    }
  }

  private static ArrayList<String> splitCsvLine(String line) {
    ArrayList<String> values = new ArrayList<String>();

    if (line.length() == 0) {
      return values;
    }

    String value = "";
    for (int i = 0; i < line.length(); i++) {
      if (line.charAt(i) == ',') {
        values.add(value);
        value = "";
      } else {
        value = value + line.charAt(i);
      }
    }
    values.add(value);

    return values;
  }

  private static int getValue(ArrayList<String> values, int index) {
    if (index >= values.size()) {
      return 0;
    }
    if (values.get(index).length() == 0) {
      return 0;
    }
    return Integer.valueOf(values.get(index));
  }
}
