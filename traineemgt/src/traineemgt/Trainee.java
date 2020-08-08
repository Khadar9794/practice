package traineemgt;


class Trainee {
	String name;
	int id;
	Trainee  (String name, int id)
	{
		this.name=name;
		this.id=id;
		
	}
	int getId() {
	return id; 
	}
	void setId(int idArg) {
		id=idArg;
	}
	String getName() {
		return name;
	}
	void setName(String nameArg) {
		name=nameArg;
	}
}
	


