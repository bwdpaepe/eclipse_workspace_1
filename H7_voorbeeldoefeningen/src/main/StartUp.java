package main;

import cui.RekeningApplicatie;
import domein.DomeinController;

public class StartUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DomeinController dc = new DomeinController();
		RekeningApplicatie ra = new RekeningApplicatie(dc);
		ra.werkMetRekeningen();

	}

}
