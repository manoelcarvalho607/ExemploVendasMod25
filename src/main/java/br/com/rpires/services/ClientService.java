/**
 * 
 */
package br.com.rpires.services;

import br.com.rpires.dao.IClientDAO;
import br.com.rpires.domain.Client;
import br.com.rpires.exceptions.TipoChaveNaoEncontradaException;
import br.com.rpires.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ClientService extends GenericService<Client, Long> implements IClientService {
	
	//private IClienteDAO clienteDAO;
	
	public ClientService(IClientDAO clienteDAO) {
		super(clienteDAO);
		//this.clienteDAO = clienteDAO;
	}

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}

	@Override
	public Client buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}

//	@Override
//	public void excluir(Long cpf) {
//		clienteDAO.excluir(cpf);
//	}
//
//	@Override
//	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
//		clienteDAO.alterar(cliente);
//	}

}
