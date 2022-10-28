/**
 * 
 */
package br.com.rpires.services;

import br.com.rpires.domain.Client;
import br.com.rpires.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public interface IClientService {

	Boolean cadastrar(Client cliente) throws TipoChaveNaoEncontradaException;

	Client buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Client cliente) throws TipoChaveNaoEncontradaException;

}
