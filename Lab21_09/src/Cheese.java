
public class Cheese {

	static String name;
	
	public Cheese() { 
		name = "";
	}

	public Cheese(String name) { 
		this.name = name;
	}
	
	public String getName() { 
		return name;
	}

	public void setName(String newName) { 
		name = newName;
	}

}