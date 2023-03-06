package ventanas;

import java.awt.EventQueue;


import javax.swing.JButton;
import javax.swing.JComboBox;

import javax.swing.JMenu;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import moneda.Conversor;
import moneda.Moneda;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;


import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Color;


public class VentanaConversorMoneda extends javax.swing.JFrame {
	
	private javax.swing.JButton jButtonCalcular;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBoxA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTFCambio;
    private javax.swing.JTextField jTFCantidad;
    private JMenuBar menuOpciones;
    private JMenu menuRegresarSalir;
    private Conversor conver = new Conversor();

    public VentanaConversorMoneda() {
    	
        initComponents();
        this.setLocation(450, 150);
        this.setTitle("Conversor de Monedas");
        
        menuOpciones = new JMenuBar();
        setJMenuBar(menuOpciones);
        
        menuRegresarSalir = new JMenu("Opciones");
        menuOpciones.add(menuRegresarSalir);
        
        JLabel lblNewRegresar = new JLabel("Regresar");
        lblNewRegresar.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		EventQueue.invokeLater(new Runnable() {
        			public void run() {
        				try {
        					MenuPrincipal menu = new MenuPrincipal();
        				} catch (Exception e) {
        					e.printStackTrace();
        				}
        			}
        		});
        		dispose();
        	}
        });
        menuRegresarSalir.add(lblNewRegresar);
        
        JLabel lblNewSalir = new JLabel("Salir");
        lblNewSalir.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		VentanaSalir salir = new VentanaSalir();
        		dispose();
        	}
        });
        menuRegresarSalir.add(lblNewSalir);
        this.setVisible(true);
        
    }

    public void setjComboBoxA(JComboBox<String> jComboBoxA) {
        this.jComboBoxA = jComboBoxA;
    }
    
    public void setjComboBox2(JComboBox<String> jComboBox2) {
		this.jComboBox2 = jComboBox2;
	}

	public JButton getjButtonCalcular() {
        return jButtonCalcular;
    }

    public JComboBox<String> getjComboBox2() {
        return jComboBox2;
    }

    public JComboBox<String> getjComboBoxA() {
        return jComboBoxA;
    }

    public JTextField getjTFCambio() {
        return jTFCambio;
    }

    public JTextField getjTFCantidad() {
        return jTFCantidad;
    }

    private void mensajeError(){
	     JOptionPane.showMessageDialog(this,"Valor no válido, solo se admiten números", "Error", JOptionPane.ERROR_MESSAGE);
	        
	}
    
    
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxA = new javax.swing.JComboBox<String>();
        jButtonCalcular = new javax.swing.JButton();
        jButtonCalcular.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		calcularCambio();
        	}
        });
        jLabel3 = new javax.swing.JLabel();
        jTFCantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTFCambio = new javax.swing.JTextField();
        jTFCambio.setForeground(new Color(0, 0, 0));
        jTFCambio.setEditable(false);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);

        jMenu1.setText("jMenu1");

        jLabel2.setText("jLabel2");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
        );

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));


        jLabel5.setText("A");

        jLabel4.setText("De");

        jButtonCalcular.setText("Calcular");
        

        jLabel3.setText("Cambio");


        jLabel1.setText("Cantidad");

        

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Conversor de monedas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        					.addGroup(jPanel3Layout.createSequentialGroup()
        						.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(jLabel4)
        							.addComponent(jLabel1))
        						.addGap(18)
        						.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
        							.addComponent(jTFCantidad, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
        						.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
        						.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(jLabel3)
        							.addComponent(jLabel5))
        						.addGap(19)
        						.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
        							.addComponent(jTFCambio, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
        							.addComponent(jComboBoxA, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
        						.addGap(52))
        					.addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        						.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
        						.addGap(105)))
        				.addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        					.addComponent(jButtonCalcular, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
        					.addGap(187))))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel6)
        			.addGap(27)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTFCambio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel1)
        				.addComponent(jTFCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel3))
        			.addGap(39)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(jLabel5)
        				.addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jComboBoxA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jButtonCalcular)
        			.addGap(34))
        );
        jPanel3.setLayout(jPanel3Layout);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }
    public void agregarMonedas () {
    	
    	
		Moneda colon = new Moneda("Colón Costarricense", 1);
		Moneda dolar = new Moneda("Dolar", 555.61);
		Moneda euro = new Moneda ("Euro",593.03);
		Moneda librasEsterlinas = new Moneda ("Listas Estarlinas",667.79);
		Moneda yenJapones = new Moneda ("Yen Japones",4.08);
		Moneda wonSulCoreano = new Moneda ("Won Surcoreano",0.43);
		
    	conver.agregarMoneda(colon);
    	conver.agregarMoneda(dolar);
    	conver.agregarMoneda(euro);
    	conver.agregarMoneda(librasEsterlinas);
    	conver.agregarMoneda(yenJapones);
    	conver.agregarMoneda(wonSulCoreano);
    	
    	for(int i=0; i<conver.getLlistaMonedas().size(); i++) {
    		jComboBox2.addItem(conver.getLlistaMonedas().get(i).getNom());
    		jComboBoxA.addItem(conver.getLlistaMonedas().get(i).getNom());
    		
    	}
    	
    	
    
    }
    private void calcularCambio() {
    	Moneda monedaOrigen = null;
        Moneda monedaDestino = null;
        String monedaPrincipal = (String)jComboBox2.getSelectedItem();
      	String monedaSecundaria = (String) jComboBoxA.getSelectedItem();
      	
      	double valor=0;
    	
         try {
        	 valor = Double.parseDouble(jTFCantidad.getText().toString());
              for (int i = 0; i < conver.getLlistaMonedas().size(); i++) {
                  if (monedaPrincipal.equals(monedaSecundaria)) {
                      monedaOrigen = conver.getLlistaMonedas().get(i);
                      monedaDestino = conver.getLlistaMonedas().get(i);
                  } else if (conver.getLlistaMonedas().get(i).getNom().equals(monedaPrincipal)) {
                      monedaOrigen = conver.getLlistaMonedas().get(i);
                  } else if (conver.getLlistaMonedas().get(i).getNom().equals(monedaSecundaria)) {
                	  monedaDestino = conver.getLlistaMonedas().get(i);
                  }
              }
              double resultado = conver.cambio(monedaOrigen, monedaDestino, valor);
              DecimalFormat formatter = new DecimalFormat("#0.00");
              jTFCambio.setText(formatter.format(resultado) + "");
          } catch (NumberFormatException ex) {
              mensajeError();
              jTFCantidad.setText("");
              jTFCambio.setText("");
          }
    }
}
