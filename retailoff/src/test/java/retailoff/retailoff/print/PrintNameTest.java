package retailoff.retailoff.print;

import org.junit.Test;

public class PrintNameTest {

  @Test
  public void sayHello() throws Exception {
    PrintName printName = new PrintName("John");
    String result = printName.sayHello();

    assert result.equals("Hello John");

  }
}
