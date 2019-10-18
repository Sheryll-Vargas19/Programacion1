package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PanelEntrada  extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private JTextField txtNumero;
	private JButton butConvertir;
	private static final String CONVERTIR = "convertir";
	
	
	public PanelEntrada() {
		setLayout(new GridLayout(2,2));
		TitledBorder border = BorderFactory.createTitledBorder("Datos de Entrada");
		border.setTitleColor(Color.RED);
		setBorder(border);
		labEntrada = new JLabel();
		txtNumero = new JTextField();
		txtNumero.setForeground(Color.black);
	    butConvertir = new JButton("Convertir");
		butConvertir.setActionCommand(CONVERTIR);
		add(labEntrada);
		add(txtNumero);
		add(new JLabel());
		add(butConvertir);
		
		
		
	}

}
