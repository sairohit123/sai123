package q1;

public class SimpleInterest {
	
double IntrestMethod(String CalculationType,double Amount,double NoOfYears,double rateOfIntrest) {
        
        double SimpleIntrest;
		if(CalculationType=="SimpleIntrest")
		{
         SimpleIntrest=(Amount * NoOfYears * rateOfIntrest)/100;
         return SimpleIntrest;
		}
		return 0;

}
}
