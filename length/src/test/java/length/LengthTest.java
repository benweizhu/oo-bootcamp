package length;

import org.junit.jupiter.api.Test;

import static length.Uom.CM;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthTest {

  @Test
  void should_be_equals_when_1cm_compare_with_1cm() {
    Length oneCM = new Length(1, CM);
    Length anotherOneCM = new Length(1, CM);

    assertEquals(oneCM, anotherOneCM);
  }

}
