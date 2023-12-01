package Buildings;
import Util.Location;

public class ResidentialBuilding extends Building{
	
	private int Population;
	private int Happiness;
	
    public ResidentialBuilding(String id, Location location, int level) {
        super(id, location, null, level);
    }

    public Location buildResidence(int x, int y){
		return null;
     
    }
    
    public void payTaxes(int tax_amount) {
    	if(capital.getCapital() - tax_amount < 0) {
    		capital.setCapital(capital.getCapital() - tax_amount);
    	}
    	else {
    		System.err.println("Not Enough Capital Balance");
    	}
    }
    
    public int getHappiness() {
    	return this.Happiness;
    }
    
    public int getPopulation() {
    	return this.Population;
    }
}