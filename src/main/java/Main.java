import com.ouiscnf.gremlins.kata.losange.domain.Alphabet;
import com.ouiscnf.gremlins.kata.losange.domain.Diamond;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Alphabet> input = new ArrayList<>();
    
    for (String arg : args) {
      Alphabet alphabetLetter;
      try{
         alphabetLetter = Alphabet.valueOf(arg);
      }
      catch(Exception e){
        throw new IllegalArgumentException("Veuillez entrer des lettres alphabétiques en majuscule séparées par des espaces");
      }

      input.add(alphabetLetter);

    }
    
    input.stream()
      .map(Diamond::new)
      .flatMap(diamond -> diamond.buildDiamondLines().stream())
      .forEach(System.out::println);

  }


}
