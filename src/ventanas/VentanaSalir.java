package ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaSalir extends javax.swing.JFrame  {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VentanaSalir() {
		
		
	}

	public void initialize() {
		initComponents();
		setTitle("Salir");
		this.setBounds(100, 100, 312, 106);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	
	}
	
	 private void initComponents() {
		 
			setType(Type.POPUP);
			
			JLabel lblNewLabel = new JLabel("¿Desea Salir?");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			getContentPane().add(lblNewLabel, BorderLayout.NORTH);
			
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.CENTER);
			
			JButton btnSi = new JButton("Sí");
			btnSi.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					JOptionPane.showMessageDialog(null,"Programa terminado","Información",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
					
				}
			});
			panel.add(btnSi);
			
			JButton btnNo = new JButton("No");
			
			btnNo.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						MenuPrincipal menu = new MenuPrincipal();
						menu.initialize();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					dispose();
				}
			});
			panel.add(btnNo);
	 }
	
	

}
