package JavaAs2Qsn7;

public class Cookie extends DessertItems{
	float quantity;
	public Cookie(float q) {
		quantity=q;
	}
     public float getcost() {
    	 float cost=quantity*3f*7;
    	 float taxamount=(5f/100f)*cost;
    	 float totalcost=cost+taxamount;
    	 return totalcost;
     }

}
