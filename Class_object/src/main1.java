
public class main1 {
  public static void main(String[] args){
	  
	  //    sysntax:
	  //    ClassName objectname = new className();
	        Vehicles car = new Vehicles();
	        car.size = 5;
	        car.color = "red";
	        car.wheels = 4;
	        
	        System.out.println("Car size is : " + car.size);
	        System.out.println("Car color is : " + car.color);
	        System.out.println("Car have " + car.wheels + " Wheels");
	        car.speedUp();
 
  }
 
} 
