import static com.ouiscnf.gremlins.kata.losange.domain.Alphabet.A;
import static com.ouiscnf.gremlins.kata.losange.domain.Alphabet.B;
import static com.ouiscnf.gremlins.kata.losange.domain.Alphabet.C;
import static org.assertj.core.api.Assertions.assertThat;

import com.ouiscnf.gremlins.kata.losange.domain.Sequence;
import org.junit.Test;

public class SequenceTest {

  @Test
  public void should_display_A_when_input_A(){
    //Given
    Sequence sequence = new Sequence(A);
    //When
    String strSequence = sequence.getSequence();
    //Then
    assertThat(strSequence).isEqualTo("A");
  }

  @Test
  public void should_display_sequence_B_B_when_input_B(){
    //Given
    Sequence sequence = new Sequence(B);
    //When
    String strSequence = sequence.getSequence();
    //Then
    assertThat(strSequence).isEqualTo("B B");
  }

  @Test
  public void should_display_sequence_C___C_when_input_C(){
    //Given
    Sequence sequence = new Sequence(C);
    //When
    String strSequence = sequence.getSequence();
    //Then
    assertThat(strSequence).isEqualTo("C   C");
  }


}
