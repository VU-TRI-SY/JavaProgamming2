package tut5;
//Ex1
public class Phone {
	private String name;
	private String model;
	private String owner;
	
	public Phone(String aName, String aModel) {
		name = aName;
		model = aModel;
	}
	
	public Phone(String aName, String aModel, String aOwner) {
		name = aName;
		model = aModel;
		owner = aOwner;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public void changeModel(String newModel) {
		model = newModel;
	}
	
	public void recordName(String nOwner) {
		owner = nOwner;
	}
	
	
}
