/**
 * 
 */
package br.com.rpires;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author rodrigo.pires
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ClientServiceTest.class, ClientDAOTest.class,
	ProdutoServiceTest.class, ProdutoDAOTest.class,
	VendaDAOTest.class})
public class AllTests {

}
