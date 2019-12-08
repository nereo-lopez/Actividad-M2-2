package graficos;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Button;

public class panelPrincipal extends JFrame {

	public panelPrincipal() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ejercicio M2.2");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnPinta = new JButton("Pinta");
		panel.add(btnPinta);
		btnPinta.setBounds(50,450,200,200);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panel.add(btnSalir);
		btnPinta.setBounds(50,450,200,200);
		
	}

}
