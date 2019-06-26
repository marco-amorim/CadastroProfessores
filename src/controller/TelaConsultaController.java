package controller;

import dao.ProfessorDAO;
import entities.Porcentagem;
import gui.TelaConsulta;

public class TelaConsultaController {

	TelaConsulta tlc;
	ProfessorDAO dao;

	
	public TelaConsultaController() {
		dao = new ProfessorDAO();
		tlc = new TelaConsulta();
		tlc.setVisible(true);
		tlc.setLocationRelativeTo(null);
		preencherPorcentagens();
		botaoVoltar();
	}
	
	public void preencherPorcentagens() {
		Porcentagem porcentagem = dao.consultaProfessores();
		tlc.getLabelPrcntDoutor().setText(String.valueOf(porcentagem.getPorcentagemDoutor() + "%"));
		tlc.getLabelPrcntEspecialista().setText(String.valueOf(porcentagem.getPorcentagemEspecialista() + "%"));
		tlc.getLabelPrcntHorista().setText(String.valueOf(porcentagem.getPorcentagemHorista() + "%"));
		tlc.getLabelPrcntMestre().setText(String.valueOf(porcentagem.getPorcentagemMestre() + "%"));
		tlc.getLabelPrcntIntegral().setText(String.valueOf(porcentagem.getPorcentagemIntegral() + "%"));
	}
	
	public void botaoVoltar() {
		tlc.getBtnVoltar().addActionListener(e -> {
			tlc.dispose();
			new TelaCadastroController();
		});
	}
	
	
}
