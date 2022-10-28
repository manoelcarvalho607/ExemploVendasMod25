package br.com.rpires.dao;

import java.util.Collection;

import br.com.rpires.domain.Client;
import br.com.rpires.exceptions.TipoChaveNaoEncontradaException;

public class ClientDaoMock implements IClientDAO {

	@Override
	public Boolean cadastrar(Client entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void excluir(Long valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Client entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client consultar(Long valor) {
		Client cliente = new Client();
		cliente.setCpf(valor);
		return cliente;
	}

	@Override
	public Collection<Client> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}


}
