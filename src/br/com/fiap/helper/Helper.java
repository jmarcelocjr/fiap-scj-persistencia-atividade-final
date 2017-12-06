package br.com.fiap.helper;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Banco;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Conta;

public class Helper {

	private EntityManager em;
	
	public Helper(EntityManager em) {
		this.em = em;
	}
	
	public String salvar(Cliente cliente) {
		try {
			em.getTransaction().begin();
			em.persist(cliente);
			em.getTransaction().commit();
		} catch (Exception e) {
			return "Sem sucesso!";
		}
		return "Sucesso!";
	}
	
	public String salvar(Banco banco) {
		try {
			em.getTransaction().begin();
			em.persist(banco);
			em.getTransaction().commit();
		} catch (Exception e) {
			return "Sem sucesso!";
		}
		return "Sucesso!";
	}
	
	public String salvar(Conta conta) {
		try {
			em.getTransaction().begin();
			em.persist(conta);
			em.getTransaction().commit();
		} catch (Exception e) {
			return "Sem sucesso!";
		}
		return "Sucesso!";
	}

	@SuppressWarnings("unchecked")
	public List<Banco> listarBanco() {
		return em.createQuery("From " + Banco.class.getSimpleName()).getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> listarCliente() {
		return em.createQuery("From " + Cliente.class.getSimpleName()).getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Conta> listarConta() {
		return em.createQuery("From " + Conta.class.getSimpleName()).getResultList();
	}
}
