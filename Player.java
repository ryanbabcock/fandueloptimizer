package fandueloptimizer;
	
public class Player {
	private int id;
	private boolean injured;
	private String position;
	private int salary;
	private double fgpg;
	private String name;
	private String team;
	
	public Player(int id, boolean injured, String position, int salary, double fgpg, String name, String team){
		this.id = id;
		this.injured = injured;
		this.position = position;
		this.salary = salary;
		this.fgpg = fgpg;
		this.name = name;
		this.team = team;
		}
   
	// Print "Player Card"
	public void printPlayer(){
		System.out.println("ID: "+ id);
		System.out.println("Injured?: "+ injured);
		System.out.println("Position: "+ position);
		System.out.println("Salary: $"+ salary);
		System.out.println("FGPG: "+ fgpg);
		System.out.println("Name: "+ name);
		System.out.println("Team: "+ team + "\n");
	}    
}
