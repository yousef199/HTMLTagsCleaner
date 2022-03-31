package pckg1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
     public static void main(String[] args ) throws IOException {
    Files.lines(Paths.get("C:\\Users\\yqadous\\text.txt"))
    	.map(line -> removeAllTags(line))
    	.forEach(line -> {
    		if(!checkEmptyLine.test(line))
    			System.out.println(line);
    	});
     }
     public static String removeAllTags(String line) {
    	 String reg = "<.*?(>|$)";
    	 String reg2 = "^.*>";
    	 String s = line.replaceAll(reg, "");
    	 s = s.replaceAll(reg2, "");
    	 return s.trim();
     };
     
     static Predicate<String> checkEmptyLine = line -> line.equals("");
}
