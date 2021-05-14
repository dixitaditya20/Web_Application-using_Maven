package Todo;

public class todoList {
	
	private String Name;

	@Override
	public String toString() {
		return String.format("todoList [Name=%s]", Name);
	}

	//Constructor
	public todoList(String name) {
		super();
		Name = name;
	}

	//Get Method
	public String getName() {
		return Name;
	}
	
	//Setter Method
	public void setName(String name) {
		Name = name;
	}

}
