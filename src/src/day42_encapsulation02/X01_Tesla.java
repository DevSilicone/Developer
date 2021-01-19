package day42_encapsulation02;

public class X01_Tesla {

	
	/*
	 * instance variable - Encasulated:
	 * model
	 * range
	 * zeroTo60
	 * price
	 * */
	private String model;
	private int range;
	private double zeroTo60;
	private double price;
	private boolean selfDriving;
	
//***************************************************************************************************************
	
	public void setTeslaInfo(String model, int range, double zeroTo60, double price, boolean selfDriving) {
		//call setter methods for each parameter
		//this.model = model;   ==> bunun yerine asagidakini kullandik
		
		setModel(model);
		setRange(range);
		setZeroTo60(zeroTo60);
		setPrice(price);
		setSelfDriving(selfDriving);
		
	}
	
	
//****************************************************************************************************************	
	
	public boolean isValidModel(String model) {
		model = model.toLowerCase();
		
	/*	// we can use this way too
		if(model.equals("model s") || model.equals("model 3") || 
				model.equals("model x") || model.equals("model y") || model.equals("roadster")) {
			return true;
		}
		return false;
	}	*/
	
	/*	
	return model.equals("model s") || 		// yukaridaki veya bu yol ile direk de yapabiliriz, return ile
		   model.equals("model 3") || 
		   model.equals("model x") || 
		   model.equals("model y") || 
		   model.equals("roadster");
	*/
		
		switch(model) {						// bu da yukaridakileri yapmanin diger bir yolu
		case "model s":
		case "model 3":
		case "model x":
		case "model y":
		case "roadster":
			return true;
			// break; buraya break koymaya gerek yok
		default:
			return false;
		}
		
		
		
		
//*****************************************************************************************************************		
		
	}	   

	
	@Override					// bastaki TESLA class ismi
	public String toString() {
		return "Tesla [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
				+ ", selfDriving=" + selfDriving + "]";
	}
	
	
	
//******************************************************************************************************************	
	
	public void setModel(String model) {
		
		// call isValidModel here then assign if true
		// if false: Invalid model - Camry
		// assign "unknown" to model
		if(isValidModel(model)) {
			this.model = model;				// eger buraya this. yazmazsak kafa karisabilir baska model yazan yerler de oldugu icin.
		}else {
			System.out.println("Invalid Model - " +model);
			this.model = "unknown";
		}

		
//**************************************************************************************************************************		
	}
	
	public String getModel() {
		return model;					// this. koyarsak da aynisi oluyor burada. 
	}
	
//*************************************************************************************************************************
	
	/*
	 * public getters and setters
	 * */
	
	public void setRange(int range) {
		this.range = range;
	}
	
	public int getRange() {
		return range;
	}
	
	public void setZeroTo60(double zeroTo60) {
		this.zeroTo60 = zeroTo60;
	}
	
	public double getZeroTo60() {
		return zeroTo60;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isSelfDriving() {			// boolean oldugunda get-set  eklenmez. "is" eklenir #unutma#
		return selfDriving;
	}

	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving = selfDriving;
	}
	
	
	
	
}
