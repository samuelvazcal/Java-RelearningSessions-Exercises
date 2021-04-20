package com.samuelvazquez.generics.lastgenericimplementation;

public class Main {
	public static void main(String[] args) {
		WaterPokemon starmie = new WaterPokemon("starmie");
		WaterPokemon psyduck = new WaterPokemon("psyduck");
		WaterPokemon dewgong = new WaterPokemon("dewgong");
		GrassPokemon exeggutor = new GrassPokemon("exxegutor");
		GrassPokemon vileplume = new GrassPokemon("vileplume");
		GrassPokemon victreebel = new GrassPokemon("victreebel");
		FirePokemon arcanine = new FirePokemon("arcanine");
		FirePokemon magmar = new FirePokemon("magmar");
		FirePokemon ninetales = new FirePokemon("ninetales");

		GymLeader ceruleanLeader = new GymLeader("Misty");
		GymLeader celadonLeader = new GymLeader("Erika");
		GymLeader cinnabarLeader = new GymLeader("Blaine");

		System.out.println("Adding pokemon to Cerulean Leader " + ceruleanLeader.getLeaderName());
		celadonLeader.addPokemon(starmie);
		celadonLeader.addPokemon(vileplume);
		celadonLeader.addPokemon(ninetales);
		celadonLeader.addPokemon("Ssss");
		//Misty is a water trainer, she only use water type pokemon in gym battles!
		//How I can restrict an specific type of pokemon for specific gym leaders?
		//1. I can define a new class that handles this situation, but it means repetitive code
		//2. What about implement a Generic Class?




	}
}
