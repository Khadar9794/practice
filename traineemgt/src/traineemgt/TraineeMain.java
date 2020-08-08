package traineemgt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TraineeMain {
	public static void main(String[]args) {
		
	       TraineeMain s=new TraineeMain();
		s.runApp();
	}
		
		

		public void runApp() {
		
			Map<Integer,Trainee> a = new HashMap<>();
			Set<CSTrainee> cs=new HashSet<>();
			Set<ECETrainee> ece=new HashSet<>();
		
		  ECETrainee trainee1=new ECETrainee("alchemy",213,"ammeter");
	        CSTrainee trainee2=new CSTrainee("team lease",214);
	  
	          a.put(trainee1.getId(),trainee1);
	         a.put(trainee2.getId(),trainee2);

	
	
			
	for(Trainee trainee:a.values()) {
		String name=trainee.getName();
		int id=trainee.getId();
		System.out.println(trainee.getName()+" "+ trainee.getId());
		
		boolean isCSTrainee= trainee instanceof CSTrainee;
		if(isCSTrainee) {
			CSTrainee CSTrainee= (CSTrainee) trainee;
			System.out.println(" languages=" + CSTrainee.getLanguages());
			
	}
		boolean isECETrainee= trainee instanceof ECETrainee;
		if(isECETrainee) {
			ECETrainee ECETrainee= (ECETrainee) trainee;
			System.out.println("deviceused=" + ECETrainee.getDeviceUsed());
		}
		
	}
	   
	     System.out.println("displaying ece");
	     for(ECETrainee ec:ece) {
	    	 int id=ec.getId();
	    	 String name=ec.getName();
	    	 String deviceUsed=ec.getDeviceUsed();
	    	 System.out.println("id is="+id+"name is="+name+"deviceused="+deviceUsed);
	     }
	     
	     System.out.println("displaying cs");
	     for(CSTrainee cse:cs) {
	    	 int id=cse.getId();
	    	 String name=cse.getName();
	    	 int languages=cse.getLanguages();
	    	 System.out.println("id is="+id+"name is="+name+"language is="+languages);
	     }
	}
		
}





