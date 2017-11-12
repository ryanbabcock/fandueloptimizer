package fandueloptimizer;

import fandueloptimizer.Player.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FanduelOptimizer { 
	//public static ArrayList importedPlayers = new ArrayList();
	//ArrayList<Player> importedPlayers = new ArrayList<Player>();
	public static void main(String[] args){
		//create player object test
		//Player testplayer = new Player(0, true, "PG", 6, "Michael Macgillivray","Mustangs");
		//importCSVFile();
		//testplayer.printPlayer();
		List<Player> printingPlayers = importCSVFile("fanduel.csv");

		// let's print all the person read from CSV file
		for (Player i : printingPlayers) {
			System.out.println(i);
		}
	}
	private static Player createPlayer(int playerId, String[] playerData){
		int id = playerId;
		boolean injured = Boolean.parseBoolean(playerData[11]);
		String position = playerData[1];
		int salary = Integer.parseInt(playerData[7]);
		String name = playerData[3];
		String team = playerData[9];
		return new Player(id, injured, position, salary, name, team);
	}
	private static List<Player> importCSVFile(String fileName){
		List<Player> importedPlayers = new ArrayList<>();
		/*
		System.out.println("What is the username?");
		Scanner userScan = new Scanner(System.in);
		String username = userScan.nextLine();
		System.out.println("What is the location of the CSV file?");
		Scanner pathScan = new Scanner(System.in);
		String pathToFile = pathScan.nextLine();
		String csvFile = "/Users/" + username + "/Desktop/" + pathToFile;
		*/
		Path pathToFile = Paths.get(fileName);
		//begin with first player id = 0
		int id = 0;
		//gets rid of line 0
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
			// read the first line from the text file
			String line = br.readLine();
			// loop until all lines are read
			while (line != null) {
				// use string.split to load a string array with the values from each line of the file, using a comma as the delimiter
				String[] playerData = line.split(",");
				Player importedPlayer = createPlayer(id, playerData);
				//createPlayer() takes an array list and id, Player() takes the values.
				// adding book into ArrayList
				importedPlayers.add(importedPlayer);
				//increment id for next player
				++id;
				// read next line before looping
				// if end of file reached, line would be null
				line = br.readLine();
			}

		} 
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return importedPlayers;	
	}
}
