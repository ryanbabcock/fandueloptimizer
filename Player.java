package fandueloptimizer;
	
public class Player {
		int id;
		boolean injured;
		String position;
		double salary;
		String name;
		String team;
	
	public Player(int id, boolean injured, String position, double salary, String name, String team){
		this.id = id;
		this.injured = injured;
		this.position = position;
		this.salary = salary;
		this.name = name;
		this.team = team;
		}
   
	// Print "Player Card"
	public void printPlayer(){
		System.out.println("ID: "+ id);
		System.out.println("Injured?: "+ injured);
		System.out.println("Position: "+ position);
		System.out.println("Salary: "+ salary);
		System.out.println("Name: "+ name);
		System.out.println("Team: "+ team);
	}    
}
