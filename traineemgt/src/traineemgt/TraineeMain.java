package traineemgt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TraineeMain {
	public static void main(String[]args) {
		TraineeMain s=new TraineeMain();
		s.runApp();
		
		Map<Integer,Trainee> a = new HashMap<Integer,Trainee>();
		Set<CSTrainee> cs=new HashSet<>();
		Set<ECETrainee> ece=new HashSet<>();
	}
		
		private void runApp() {
		
		
	}

		public void runApp(Map<Integer, Trainee> a) {
		
		
		ECETrainee trainee1=new ECETrainee("alchemy",213);
	a.put(trainee1.getId(),trainee1);
	CSTrainee trainee2=new CSTrainee("team lease",214);
	a.put(trainee1.getId(),trainee1);
	Trainee trainees[]=new Trainee[2];
	
	trainees[0]=trainee1;
	trainees[1]=trainee2;
			
	for(Trainee trainee:trainees) {
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
	     for(ECETrainee ece:ECE) {
	    	 int id=ece.getId();
	    	 String name=ece.getName();
	    	 String deviceUsed=ece.getDeviceUsed();
	    	 System.out.println("id is="+id+"name is="+name+"deviceused="+deviceUsed);
	     }
	     
	     System.out.println("displaying cs");
	     for(CSTrainee cs:CS) {
	    	 int id=cs.getId();
	    	 String name=cs.getName();
	    	 int languages=cs.getLanguages();
	    	 System.out.println("id is="+id+"name is="+name+"language is="+languages);
	     }
	}
		
}





