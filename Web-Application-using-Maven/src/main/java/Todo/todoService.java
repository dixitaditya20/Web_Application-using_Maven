package Todo;

import java.util.ArrayList;
import java.util.List;

public class todoService {

	private static List<todoList> todos = new ArrayList<todoList>();
	
	static {
		todos.add(new todoList("Learning Web Application using Servlets"));
		todos.add(new todoList("Learning Hibernate"));
		todos.add(new todoList("Learning Kotlin"));
		todos.add(new todoList("Learning GO"));
	}
	
	public List<todoList> retrieveTodos(){
		return todos;
	}
}
