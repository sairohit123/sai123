package q1;

public class CompoundInsterest {

double IntrestMethod(String CalculationType,double Amount,double NoOfYears,double rateOfIntrest) {
        
        double CompoundIntrest;
        
        if(CalculationType=="CompoundIntrest")
		{
         CompoundIntrest=Amount * Math.pow(1.0+rateOfIntrest/100.0,NoOfYears) - Amount;
         return CompoundIntrest;
		}
        
        return 0;
}
	
}
