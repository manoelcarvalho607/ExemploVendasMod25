/**
 * 
 */
package br.com.rpires;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.rpires.dao.ClientDAO;
import br.com.rpires.dao.IClientDAO;
import br.com.rpires.domain.Client;
import br.com.rpires.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public class ClientDAOTest {
	
	private IClientDAO clientDao;

	private Client client;
	
	public ClientDAOTest() {
		clientDao = new ClientDAO();
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		client = new Client();
		client.setCpf(33345566678L);
		client.setNome("Manoel");
		client.setCidade("Bauru");
		client.setEnd("Rua direita");
		client.setEstado("SP");
		client.setNumero("35A");
		client.setTel(1488889999L);
		clientDao.cadastrar(client);
	}
	
	@Test
	public void readClient() {
		Client clienteConsultado = clientDao.consultar(client.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void createClient() throws TipoChaveNaoEncontradaException {
		client.setCpf(56565656565L);
		Boolean retorno = clientDao.cadastrar(client);
		Assert.assertTrue(retorno);
	}
	
	
	@Test
	public void deleteClient() {
		clientDao.excluir(client.getCpf());
	}
	
	@Test
	public void updateClient() throws TipoChaveNaoEncontradaException {
		client.setNome("Rafael");
		clientDao.alterar(client);
		Assert.assertEquals("Rafael", client.getNome());
	}
	
	@Test
	public void buscarTodos() {
		Collection<Client> list = clientDao.buscarTodos();
		assertTrue(list != null);
		assertTrue(list.size() == 1);
	}
}
