package com.samuelvazquez.generics.lastgenericimplementation;

public class Main {
	public static void main(String[] args) {
		WaterPokemon starmie = new WaterPokemon();
		WaterPokemon psyduck = new WaterPokemon();
		WaterPokemon dewgong = new WaterPokemon();
		GrassPokemon exeggutor = new GrassPokemon();
		GrassPokemon vileplume = new GrassPokemon();
		GrassPokemon victreebel = new GrassPokemon();
		FirePokemon arcanine = new FirePokemon();
		FirePokemon magmar = new FirePokemon();
		FirePokemon ninetales = new FirePokemon();

		GymLeader ceruleanLeader = new GymLeader("Misty");
		GymLeader celadonLeader = new GymLeader("Erika");
		GymLeader cinnabarLeader = new GymLeader("Blaine");

		celadonLeader.addPokemon(starmie);
		celadonLeader.addPokemon(vileplume);
		celadonLeader.addPokemon(ninetales);
		//Misty is a water trainer, she only use water type pokemon in gym battles!
		//How I can restrict an specific type of pokemon for specific gym leaders?
		//1. I can define a new class that handles this situation, but it means repetitive code
		//2. What about implement a Generic Class?




	}
}
