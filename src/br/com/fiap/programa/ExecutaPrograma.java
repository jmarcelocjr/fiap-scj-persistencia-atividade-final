package br.com.fiap.programa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Banco;
import br.com.fiap.helper.Helper;

public class ExecutaPrograma {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoFInal");
		EntityManager em = emf.createEntityManager();
		Helper helper = new Helper(em);

		Banco banco = new Banco();
		
		banco.setNome("Nome");
		banco.setEndereco("Endereco");
		banco.setTelefone("Telefone");
		
		helper.salvar(banco);
		
	}

}
