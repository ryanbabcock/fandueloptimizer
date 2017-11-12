package fandueloptimizer2;
	
public class Player {
		public static int id;
		public static boolean injured;
		public static String position;
		public static double salary;
		public static String name;
		public static String team;
	
	public void constructPlayer(int id, boolean injured, String position, double salary, String name, String team){
		this.id = id;
		this.injured = injured;
		this.position = position;
		this.salary = salary;
		this.name = name;
		this.team = team;
		}
   
	// Print "Player Card"
	public void printPlayer(){
		System.out.println("ID: "+ Player.id);
		System.out.println("Injured?: "+ injured);
		System.out.println("Position: "+ position);
		System.out.println("Salary: "+ salary);
		System.out.println("Name: "+ name);
		System.out.println("Team: "+ team);
	}    
}
