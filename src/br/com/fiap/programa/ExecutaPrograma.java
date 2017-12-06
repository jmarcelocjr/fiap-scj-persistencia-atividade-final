package br.com.fiap.programa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Banco;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Conta;
import br.com.fiap.helper.Helper;

public class ExecutaPrograma {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoFinal");
		EntityManager em = emf.createEntityManager();
		Helper helper = new Helper(em);

		Banco banco = new Banco();
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do Banco: ");
		banco.setNome(sc.nextLine());
		System.out.print("Digite o endereco do Banco: ");
		banco.setEndereco(sc.nextLine());
		System.out.print("Digite o telefone do Banco: ");
		banco.setTelefone(sc.nextLine());
		
		System.out.println("Persistindo o novo Banco na base de dados...");
		System.out.println(helper.salvar(banco));
		
		
		System.out.print("Digite o nome do Cliente: ");
		cliente.setNome(sc.nextLine());
		System.out.print("Digite o cpf do Cliente: ");
		cliente.setCpf(sc.nextLine());
		System.out.print("Digite o endereco do Cliente: ");
		cliente.setEndereco(sc.nextLine());
		System.out.print("Digite a idade do Cliente: ");
		cliente.setIdade(sc.nextInt());
		System.out.println("Definindo o Banco " + banco.getNome() + " para o cliente...");
		cliente.setBanco(banco);

		System.out.println("Persistindo o novo cliente na base de dados...");
		System.out.println(helper.salvar(cliente));
		


		
//		Banco banco = new Banco();
//		
//		banco.setNome("Nome");
//		banco.setEndereco("Endereco");
//		banco.setTelefone("Telefone");
//		
//		helper.salvar(banco);
//		
	}

}
