package ventanas;


import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

//Se crea el menú Principal
public class MenuPrincipal extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private javax.swing.JButton jButtonAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private JButton btnNewButton;
    private JComboBox<Object> comboBox = new JComboBox<Object>();
	
	public MenuPrincipal() {
		
	       
	}
	
	public void initialize() {
		initComponents();
	    this.setLocation(450, 150);
	    this.setTitle("Menú Principal");
	    this.setVisible(true);
	}
	
	public JButton getjButtonAceptar() {
	     return jButtonAceptar;
	}

	    
	    private void initComponents() {

	    	
	    	comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"Conversor de Monedas", "Conversor de Temperatura"}));
	        jPanel1 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
	        jLabel2 = new javax.swing.JLabel();
	        jButtonAceptar = new javax.swing.JButton();
	        jButtonAceptar.setText("Aceptar");
	        jButtonAceptar.addMouseListener(new MouseAdapter() {
	        	
	        
	        	
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		String opcion = (String)comboBox.getSelectedItem().toString();
	        		
	        		if(opcion=="Conversor de Monedas") {
	        			try {
	        				VentanaConversorMoneda window = new VentanaConversorMoneda();
	        				window.initialize();
	        				window.agregarMonedas();
	        				} catch (Exception e1) {
	        					e1.printStackTrace();
	        				}
	        			dispose();
	        		}else{
	        			try {
	        				VentanaConversorTemperatura window = new VentanaConversorTemperatura();
	        				window.initialize();
	        				window.agregarTemperaturas();
	        				} catch (Exception e1) {
	        					e1.printStackTrace();
	        				}
	        			dispose();
	        		}
	        	}
	        });

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

	        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 16)); // NOI18N
	        jLabel1.setText("Menú Principal");

	        jLabel2.setText("Seleccione una Opción");

	        
	        btnNewButton = new JButton("Salir");
	        btnNewButton.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		VentanaSalir salir = new VentanaSalir();
	        		salir.initialize();
	        		dispose();
	        	}
	        });
	        btnNewButton.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1Layout.setHorizontalGroup(
	        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
	        		.addGroup(jPanel1Layout.createSequentialGroup()
	        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
	        				.addGroup(jPanel1Layout.createSequentialGroup()
	        					.addGap(22)
	        					.addComponent(jLabel2)
	        					.addPreferredGap(ComponentPlacement.RELATED)
	        					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
	        					.addPreferredGap(ComponentPlacement.RELATED)
	        					.addComponent(jButtonAceptar, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
	        				.addGroup(jPanel1Layout.createSequentialGroup()
	        					.addGap(146)
	        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)))
	        			.addContainerGap(94, Short.MAX_VALUE))
	        		.addGroup(jPanel1Layout.createSequentialGroup()
	        			.addContainerGap(488, Short.MAX_VALUE)
	        			.addComponent(btnNewButton)
	        			.addContainerGap())
	        );
	        jPanel1Layout.setVerticalGroup(
	        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
	        		.addGroup(jPanel1Layout.createSequentialGroup()
	        			.addGap(31)
	        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
	        			.addGap(18)
	        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(jButtonAceptar)
	        				.addComponent(jLabel2))
	        			.addPreferredGap(ComponentPlacement.UNRELATED)
	        			.addComponent(btnNewButton)
	        			.addContainerGap())
	        );
	        jPanel1.setLayout(jPanel1Layout);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(0, 0, 0)
	                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );

	        pack();
	    }
}
