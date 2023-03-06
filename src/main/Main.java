package main;

import java.awt.EventQueue;


import ventanas.MenuPrincipal;


public class Main {

	public static void main(String[] args) {

		//Se lanza la ventana principal, la cual se llamará menuPrincipal
		
		EventQueue.invokeLater(new Runnable() { 
			public void run() {
				try {
					MenuPrincipal menu = new MenuPrincipal();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
