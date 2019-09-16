import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

import javax.naming.TimeLimitExceededException;

public class Navigation {

  private  int Limit;
  private  String Gas;

  public Navigation(final int limit, final String gas) {
    Limit = limit;
    Gas = gas;
  }

  @Override
  public boolean equals(final Object o) { System.out.println(id);
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final Navigation that = (Navigation) o;
    return Limit == that.Limit && Objects.equals(Gas, that.Gas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Limit, Gas);
  }

  public int getLimit() {
    return Limit;
  }

  public void setLimit(final int limit) {
    Limit = limit;
  }

  public String getGas() {
    return Gas;
  }

  public void setGas(final String gas) {
    Gas = gas;
  }

  void  MethodA(String id){

    System.out.println(id);
    System.out.println("My Test");



    System.out.println("Hello World");

  }

  void  MethodB(String id){

    System.out.println("Hello World");

    System.out.println("My Test");

    System.out.println(id);
    System.out.println(id);
    System.out.println(id);
    System.out.println(id);

    Calendar calendar= new GregorianCalendar(Calendar.DAY_OF_YEAR);


  }
}
