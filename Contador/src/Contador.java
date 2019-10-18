import javax.swing.JOptionPane;

public class Contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b = 0;
		int contador2 = 0;
		boolean cleida = false;
		boolean lleida = false;
		boolean aleida = false;
		boolean sleida = false;
		boolean eleida = false;
		
		while (b !=5) {
			String contador = JOptionPane.showInputDialog("Letras");
			if(cleida == false && contador.equals("c")) {
				cleida= true;
				b++;
			}
			else if(lleida == false && contador.equals("l")) {
				lleida= true;			
				b++;
			}
			else if(aleida == false && contador.equals("a")) {
				aleida= true;	
				b++;
			}
			else if(sleida == false && contador.equals("s")) {
				sleida= true;	
				b++;
			}
			else if(eleida == false && contador.equals("e")) {
				eleida= true;
				b++;
			}
			 contador2 ++;
		}
			
		JOptionPane.showMessageDialog(null, "clase" );
			
			
			
		}

	}


