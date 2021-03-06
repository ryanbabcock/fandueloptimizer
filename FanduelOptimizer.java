package fandueloptimizer;

import fandueloptimizer.Player.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;


public class FanduelOptimizer {
	public static void main(String[] args) throws FileNotFoundException{
		List<Player> printingPlayers = handleCSV();
		// let's print all the person read from CSV file
		for (Player i : printingPlayers) {
			i.printPlayer();
		}
		handleCSV();
	}
	private static Player createPlayer(int playerId, ArrayList<String> csvdata){
		int id = playerId;
		boolean injured = false;
		if (Pattern.compile(Pattern.quote("O"), Pattern.CASE_INSENSITIVE).matcher(csvdata.get(11)).find() == true){
			injured = true;
		}
//debug System.out.println(playerId+" "+csvdata.get(11)+" "+injured);
		String position = csvdata.get(1);
		int salary = Integer.parseInt(csvdata.get(7));
		double fgpg = Double.parseDouble(csvdata.get(5));
		String name = csvdata.get(3);
		String team = csvdata.get(9);
		return new Player(id, injured, position, salary, fgpg, name, team);
	}
	private static List<Player> handleCSV()  throws FileNotFoundException{
		List<Player> importedPlayers = new ArrayList<>();
		
		Scanner lineScanner = new Scanner(new File("fanduel.csv"));
		int playerId = 0;
		
		Scanner valueScanner = null;
		int valueId = 0;
		
			while(lineScanner.hasNextLine()){
				valueScanner = new Scanner(lineScanner.nextLine());
				valueScanner.useDelimiter(",");
				ArrayList<String> playerData = new ArrayList<>();
				while(valueScanner.hasNext()){
					String scannedValue = valueScanner.next();
//debug System.out.print("id"+valueId+" "+scannedValue);
					playerData.add(scannedValue);
//debug System.out.print(playerData);
					++valueId;
				}
				Player importedPlayer = createPlayer(playerId, playerData);
//debug importedPlayer.printPlayer();
				importedPlayers.add(importedPlayer);
				++playerId;
			}
			lineScanner.close();
		return importedPlayers;	
	}
}