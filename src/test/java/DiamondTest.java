import static com.ouiscnf.gremlins.kata.losange.domain.Alphabet.A;
import static com.ouiscnf.gremlins.kata.losange.domain.Alphabet.B;
import static com.ouiscnf.gremlins.kata.losange.domain.Alphabet.C;
import static com.ouiscnf.gremlins.kata.losange.domain.Alphabet.D;
import static org.assertj.core.api.Assertions.assertThat;

import com.ouiscnf.gremlins.kata.losange.domain.Diamond;
import java.util.List;
import org.junit.Test;

public class DiamondTest {

  @Test
  public void should_display_diamond_A_when_input_A(){
    //Given
    Diamond diamond = new Diamond(A);
    //When
    List<String> sequences = diamond.buildDiamondDisplay();
    //Then
    assertThat(sequences).containsExactly("A");
  }

  @Test
  public void should_display_diamond_A_B_B_A_when_input_B(){
    //Given
    Diamond diamond = new Diamond(B);
    //When
    List<String> sequences = diamond.buildDiamondDisplay();
    //Then
    assertThat(sequences).containsExactly(" A ","B B"," A ");
  }

  @Test
  public void should_display_diamond_A_B_C_C_B_A_when_input_C(){
    //Given
    Diamond diamond = new Diamond(C);
    //When
    List<String> sequences = diamond.buildDiamondDisplay();
    //Then
    assertThat(sequences).containsExactly("  A  "," B B ","C   C"," B B ","  A  ");
  }

  @Test
  public void should_display_diamond_A_B_C_D_D_C_B_A_when_input_D(){
    //Given
    Diamond diamond = new Diamond(D);
    //When
    List<String> sequences = diamond.buildDiamondDisplay();
    //Then
    assertThat(sequences).containsExactly("   A   ","  B B  "," C   C ","D     D"," C   C ","  B B  ","   A   ");
  }



}
