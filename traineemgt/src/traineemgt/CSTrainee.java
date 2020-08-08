package traineemgt;

public class CSTrainee extends Trainee {
	CSTrainee(String name, int id) {
		super(name, id);
	}

	int languages;

	CSTrainee(String name, int id, int languages) {
		super(name,id);
		this.languages =languages;
	}

	public int getLanguages() {
		return languages;
	}

	public void setLanguages(int languages) {
		this.languages =languages;
	}

}

