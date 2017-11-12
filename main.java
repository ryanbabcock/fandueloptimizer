package fandueloptimizer2;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import fandueloptimizer2.Player.*;

public class FanduelOptimizer2 { 
	//public static ArrayList importedPlayers = new ArrayList();
	//ArrayList<Player> importedPlayers = new ArrayList<Player>();
	public static void main(String[] args){
		//create player object test
		Player testplayer = new Player();
		Player.constructPlayer(0, true, "PG", 6, "Michael Macgillivray","Mustangs");
		/*
		testPlayer.playerInjured(true);
		testPlayer.playerPosition("PG");
		testPlayer.playerSalary(6);
		testPlayer.playerName("Michael Macgillivray");
		testPlayer.playerTeam("Mustangs");
		
		importCSVFile();
		*/
		testplayer.printPlayer();
	}
   /* public static int importCSVFile(){
		System.out.println("What is the location of the CSV file?");
		Scanner scan = new Scanner(System.in);
		String theMonster = scan.nextLine();
		String csvFile = "/Users/michaelmacgillivray/Desktop/" + theMonster;
		BufferedReader br = new BufferedReader(new FileReader(new File(csvFile)));
		String line;
		while ((line = br.readLine()) != null) {
			String[] entries = line.split(",");
			Player importingPlayer = new Player(entires[0], entries[1], entries[2], entries[3]);
			importedPlayers.add(importingPlayer);
		}   
	}
	*/
}
