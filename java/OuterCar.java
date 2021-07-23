package com.ust.examples;
/*
 * nested inner  class
 * inner class
 */


class OuterCar{
	String carName;
	String carType;
	 // assign value using constructor
	public OuterCar(String name,String type) {
		this.carName = name;
		this.carType = type;
	}
	//private string//create method
	private String getCarName() {
		return this.carName;
	}
	//inner class
	class Engine{
		String engineType;
		void setEngine() {
			
			if(OuterCar.this.carType.equals("4WD")) {
			if(OuterCar.this.getCarName().equals("crysler")) {
				this.engineType = "smaller";
			}
			else {
				this.engineType = "Bigger";
			}
		}
			else {
				this.engineType = "Bigger";
			}
		}
		String getEngineType() {
			return this.engineType;
			
		}
	}
	

	public static void main(String[] args) {
		OuterCar car = new OuterCar("honda","8WD");
		OuterCar.Engine engine = car.new Engine();
		engine.setEngine();
		System.out.println("engine type for 8WD =  "+engine.getEngineType());
		
		OuterCar car1 = new OuterCar("crysler","4WD");
		OuterCar.Engine engine1 = car1.new Engine();
		engine1.setEngine();
		System.out.println("engine type for 4WD =  "+engine1.getEngineType());
		

	}

}
