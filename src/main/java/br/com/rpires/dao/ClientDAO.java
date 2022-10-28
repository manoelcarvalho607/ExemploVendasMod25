/**
 * 
 */
package br.com.rpires.dao;

import br.com.rpires.dao.generic.GenericDAO;
import br.com.rpires.domain.Client;

/**
 * @author rodrigo.pires
 *
 */
public class ClientDAO extends GenericDAO<Client, Long> implements IClientDAO {

	public ClientDAO() {
		super();
	}

	@Override
	public Class<Client> getTipoClasse() {
		return Client.class;
	}

	@Override
	public void atualiarDados(Client entity, Client entityCadastrado) {
		entityCadastrado.setCidade(entity.getCidade());
		entityCadastrado.setCpf(entity.getCpf());
		entityCadastrado.setEnd(entity.getEnd());
		entityCadastrado.setEstado(entity.getEstado());
		entityCadastrado.setNome(entity.getNome());
		entityCadastrado.setNumero(entity.getNumero());
		entityCadastrado.setTel(entity.getTel());
		
	}



}
