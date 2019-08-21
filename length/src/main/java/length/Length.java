package length;

import java.util.Objects;

public class Length {

  private double value;
  private Uom cm;

  public Length(double value, Uom cm) {
    this.value = value;
    this.cm = cm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Length length = (Length) o;
    return Double.compare(length.value, value) == 0 &&
        cm == length.cm;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, cm);
  }
}
