package traineemgt;

public class ECETrainee extends Trainee {
	ECETrainee(String name, int id) {
		super(name, id);
	}

	String deviceused;

	ECETrainee(String name, int id, String deviceused ) {
		super(name,id);
		this.deviceused =deviceused;
	}
	public String getDeviceUsed() {
		return deviceused;
	}

	public void setDeviceUsed(String DeviceUsed) {
		this.deviceused =deviceused;
	}

}


