package oopProject;

public abstract class Vehicle {

	
	
	private String year;
	private String make;
	private String model;
	private Boolean autoTransmission;
	
	public Vehicle(String year, String make, String model, boolean autoTransmission) {
		super();
		this.year = year;
		this.make = make;
		this.model = model;
		this.autoTransmission = autoTransmission;
	}
	
	public Vehicle(String year, String make, String model) {
		this(year, make, model, true);
	}
	
	public Vehicle(String year, String make) {
		this(year, make, "No Model Provided", true);
	}
	
	public Vehicle(String year) {
		this(year, "No Make Provided", "No Model Provided", true);
	}
	
	public Vehicle() {
		this("No Year Provided", "No Make Provided", "No Model Provided", true);
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Boolean isAutoTransmission() {
		return autoTransmission;
	}

	public void setAutoTransmission(Boolean autoTransmission) {
		this.autoTransmission = autoTransmission;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehicle [year=" + year + ", make=" + make + ", model=" + model + ", autoTransmission="
				+ autoTransmission + "]";
	}
	
	

}
