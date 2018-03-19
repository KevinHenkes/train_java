package fr.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculette extends JFrame implements ActionListener {
	private JPanel container = new JPanel();
	
	public Calculette(int largeur, int hauteur, Color bg, String title) {
		JPanel pan = new JPanel();
		
		JButton bouton1 = new JButton("bouton 1");
		JButton bouton2 = new JButton("bouton 2");

		this.setTitle(title);
		this.setSize(largeur, hauteur);

		container.setBackground(bg);

		this.setContentPane(pan);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
