/**
 * 
 */
package br.com.rpires;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.rpires.dao.ClientDaoMock;
import br.com.rpires.dao.IClientDAO;
import br.com.rpires.domain.Client;
import br.com.rpires.exceptions.TipoChaveNaoEncontradaException;
import br.com.rpires.services.ClientService;
import br.com.rpires.services.IClientService;

/**
 * @author rodrigo.pires
 *
 */
public class ClientServiceTest {
	
	private IClientService clientService;
	
	private Client client;
	
	public ClientServiceTest() {
		IClientDAO dao = new ClientDaoMock();
		clientService = new ClientService(dao);
	}
	
	@Before
	public void init() {
		client = new Client();
		client.setCpf(33345566678L);
		client.setNome("Manoel");
		client.setCidade("Bauru");
		client.setEnd("Rua direita");
		client.setEstado("SP");
		client.setNumero("35A");
		client.setTel(1488889999L);
		
	}
	
	@Test
	public void readClient() {
		Client clienteConsultado = clientService.buscarPorCPF(client.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void createClient() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clientService.cadastrar(client);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void deleteClient() {
		clientService.excluir(client.getCpf());
	}
	
	@Test
	public void updateClient() throws TipoChaveNaoEncontradaException {
		client.setNome("Manoel");
		clientService.alterar(client);
		
		Assert.assertEquals("Manoel", client.getNome());
	}
}
