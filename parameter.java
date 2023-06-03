package selenium;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
@Test
    @Parameters({"Fruit","cost"})
	public void Fruit(String M, int cost) {
	
	System.out.println("whT is high produce in summer fruits name ");
		System.out.println(M);
		System.out.println(cost);
		
	}
   @Test
    @Parameters("Vegetables" )
    public void Veg(@Optional("brinzel") String P) {
	   System.out.println("what vigitable is available in all seasons");
		System.out.println(P);

    }
   @Test
   @Parameters("firstname")
   public void name(String N) {
	   System.out.println( "what is your best series name");
	   System.out.println( N);
   }

}
