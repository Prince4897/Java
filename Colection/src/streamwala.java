import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class streamwala 
{
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("Ruby");

        System.out.println("=== Iterate over a HashSet using Java 8 forEach and lambda ===");
        programmingLanguages.forEach(programmingLanguage -> {
            System.out.println(programmingLanguage);
        });
        
        
        //Set<String> result = new HashSet<>();
        		programmingLanguages.stream().
        		filter(s -> s.contains("Java")).
        		map(s -> s.toUpperCase()).collect(Collectors.toSet()).forEach(System.out::println);; 
        
        
    }
   }
