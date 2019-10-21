package Vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private JTextField txtNumero;
	private JLabel labNombre;
	private JTextField txtNombre;
	private JLabel labCedula;
	private JTextField txtCedu;
	private JLabel labSalario;
	private JTextField txtSalario;
	private JButton butLeer;
	private JButton butEscribir;
	private JButton butLeerReg;
	private JButton butEscribirReg;
	public static final String ESCRIBIR = "Escribir";
	public static final String LEER = "Leer";
	public static final String ESCRIBIR_REG = "EscribirReg";
	public static final String LEER_REG = "LeerReg";
	
	public PanelEntrada() {
		
		setLayout( new GridLayout(6,2) );//se define el grid de 2x2
		TitledBorder border = BorderFactory.createTitledBorder("Archivos Binarios");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		labEntrada = new JLabel("Digite un valor");
		txtNumero = new JTextField("");
		txtNumero.setForeground(Color.BLACK);
		txtNumero.setBackground(Color.WHITE);
		
		butLeer = new JButton("Leer");
		butLeer.setActionCommand(LEER);
		butEscribir = new JButton("Escribir");
		butEscribir.setActionCommand(ESCRIBIR);
		
		butLeerReg = new JButton("Leer Registros");
		butLeerReg.setActionCommand(LEER_REG);

		butEscribirReg = new JButton("Escribir Registros");
		butEscribirReg.setActionCommand(ESCRIBIR_REG);
		
		//Nombre
		labNombre = new JLabel("Digite un nombre");
		txtNombre = new JTextField("");
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setBackground(Color.WHITE);
		add(labNombre);
		add(txtNombre);
		
		//Cedula
		labCedula = new JLabel("Digite un cedula");
		txtCedu = new JTextField("");
		txtCedu.setForeground(Color.BLACK);
		txtCedu.setBackground(Color.WHITE);
		add(labCedula);
		add(txtCedu);
		
		//Salario
		labSalario = new JLabel("Digite un salario");
		txtSalario = new JTextField("");
		txtSalario.setForeground(Color.BLACK);
		txtSalario.setBackground(Color.WHITE);
		add(labSalario);
		add(txtSalario);
		
		
		//add(labEntrada);
		//add(txtNumero);
		add(butEscribir);
		add(butLeer);
		add(butEscribirReg);
		add(butLeerReg);
	}
	
	
	
	public JLabel getLabNombre() {
		return labNombre;
	}

	public void setLabNombre(JLabel labNombre) {
		this.labNombre = labNombre;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JLabel getLabCedula() {
		return labCedula;
	}

	public void setLabCedula(JLabel labCedula) {
		this.labCedula = labCedula;
	}



	public JTextField getTxtCedu() {
		return txtCedu;
	}



	public void setTxtCedu(JTextField txtCedu) {
		this.txtCedu = txtCedu;
	}



	public JLabel getLabSalario() {
		return labSalario;
	}



	public void setLabSalario(JLabel labSalario) {
		this.labSalario = labSalario;
	}



	public JTextField getTxtSalario() {
		return txtSalario;
	}



	public void setTxtSalario(JTextField txtSalario) {
		this.txtSalario = txtSalario;
	}



	public static String getEscribir() {
		return ESCRIBIR;
	}



	public static String getLeer() {
		return LEER;
	}



	public static String getLeerReg() {
		return LEER_REG;
	}

	public JButton getButLeerReg() {
		return butLeerReg;
	}

	public void setButLeerReg(JButton butLeerReg) {
		this.butLeerReg = butLeerReg;
	}

	public JButton getButEscribirReg() {
		return butEscribirReg;
	}

	public void setButEscribirReg(JButton butEscribirReg) {
		this.butEscribirReg = butEscribirReg;
	}

	public static String getEscribirReg() {
		return ESCRIBIR_REG;
	}

	public JLabel getLabEntrada() {
		return labEntrada;
	}

	public void setLabEntrada(JLabel labEntrada) {
		this.labEntrada = labEntrada;
	}

	public JTextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JButton getButLeer() {
		return butLeer;
	}

	public void setButLeer(JButton butLeer) {
		this.butLeer = butLeer;
	}

	public JButton getButEscribir() {
		return butEscribir;
	}

	public void setButEscribir(JButton butEscribir) {
		this.butEscribir = butEscribir;
	}
	
}
