package APP;

/*Importar*/

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class App extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	private JTextField jtfInput = new JTextField(15);
	private JLabel jlOutput = new JLabel();
	
	private JButton jbMostrar = new JButton("Mostrar");
	private JButton jbCerrar = new JButton("Cerrar");
	
	public String valor;
	
	public App(){
		this.getContentPane().setLayout(new BorderLayout());
		this.setTitle("Ejemplo");
		
		/*formulario*/
		JPanel jpFormulario = new JPanel();
		this.add(jpFormulario,BorderLayout.CENTER);		
		jpFormulario.setLayout(new GridBagLayout());
		jpFormulario.add(new JLabel("Valor: ",SwingConstants.RIGHT),new GridBagConstraints(0,0,1,1,0.0,0.0, GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(5,5,10,5),1,1));
		jpFormulario.add(jtfInput,new GridBagConstraints(1,0,1,1,100.0,0.0, GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,new Insets(5,5,10,5),1,1));
		jpFormulario.add(jlOutput,new GridBagConstraints(0,1,2,1,100.0,0.0, GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(5,5,10,5),1,1));		
		
		/*barra de botones*/
		JPanel jpBarraBotones = new JPanel();
		this.add(jpBarraBotones,BorderLayout.SOUTH);
		jpBarraBotones.setLayout(new FlowLayout());		
		jpBarraBotones.add(jbMostrar);
		jbMostrar.addActionListener(this);
		jpBarraBotones.add(jbCerrar);
		jbCerrar.addActionListener(this);				
		
		this.pack();
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e!=null && jbCerrar.equals(e.getSource())){
			System.exit(0);
		}else if(e!=null && jbMostrar.equals(e.getSource())){
		valor=jtfInput.getText();
		
			jlOutput.setText(valor);
		}
		
	}

	public static void main(String [] args){
		App app=new App();
		app.setVisible(true);
	}
	
}
