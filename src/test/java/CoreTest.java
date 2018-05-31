import static com.ouiscnf.gremlins.kata.losange.domain.Alphabet.A;
import static com.ouiscnf.gremlins.kata.losange.domain.Alphabet.B;
import static com.ouiscnf.gremlins.kata.losange.domain.Alphabet.C;
import static org.assertj.core.api.Assertions.assertThat;

import com.ouiscnf.gremlins.kata.losange.domain.Core;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.Test;

public class CoreTest {

  @Test
  public void should_display_A_when_input_A(){
    //Given
    Core core = new Core(A);
    //When
    String strSequence = core.buildDisplay();
    //Then
    assertThat(strSequence).isEqualTo("A");
  }

  @Test
  public void should_display_sequence_B_B_when_input_B(){
    //Given
    Core core = new Core(B);
    //When
    String strSequence = core.buildDisplay();
    //Then
    assertThat(strSequence).isEqualTo("B B");
  }

  @Test
  public void should_display_sequence_C___C_when_input_C(){
    //Given
    Core core = new Core(C);
    //When
    String strSequence = core.buildDisplay();
    //Then
    assertThat(strSequence).isEqualTo("C   C");
  }


}
