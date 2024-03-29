package application;

import java.awt.EventQueue;

import controller.TelaCadastroController;
import db.DB;

public class Principal {

	public static void main(String[] args) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			System.err.println(ex);
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new TelaCadastroController();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		DB.closeConnection();
	}

}
