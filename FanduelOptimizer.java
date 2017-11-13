package fandueloptimizer;

import fandueloptimizer.Player.*;

import java.util.ArrayList;
import java.util.List;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FanduelOptimizer {
	public static void main(String[] args) {
		List<Player> printingPlayers = handleCSV("fanduel.csv");
		// let's print all the person read from CSV file
		for (Player i : printingPlayers) {
			System.out.println(i);
		}
	}
	private static Player createPlayer(int playerId, ArrayList<String> csvdata){
		int id = playerId;
		boolean injured = false;
		if (csvdata.size() >= 11){
			injured = true;
		}
		String position = csvdata.get(1);
		int salary = Integer.parseInt(csvdata.get(7));
		String name = csvdata.get(3);
		String team = csvdata.get(9);
		return new Player(id, injured, position, salary, name, team);
	}
	private static List<Player> handleCSV(String filename)  throws FileNotFoundException{
		List<Player> importedPlayers = new ArrayList<>();
		Scanner scanner = new Scanner(new File(filename));
		scanner.useDelimiter(",");
		int id = 0;
		while(scanner.hasNext()){
			ArrayList<String> playerData = new ArrayList<>();
			playerData.add(scanner.next());
			Player importedPlayer = createPlayer(id, playerData);
			importedPlayers.add(importedPlayer);
			++id;
		}
		scanner.close();
		return importedPlayers;	
	}

}