package Page_Object_Model;

import org.testng.annotations.Test;


public class TestCasesExecution extends Repository {
  @Test
  public void loginExecution() throws Exception {
	  
	  Repository.login();
	  Thread.sleep(3000);
	  
  }
 

}
