package negocio;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClientesTest_Ex1 {

	@Test
	public void testPesquisaCliente() {

		// criando alguns clientes
		Cliente cliente01 = new Cliente(1, "David Martins", 30, "david_bool@hotmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Jessica Martins", 27, "jessicasp@gmail.com", 2, true);
		Cliente cliente03 = new Cliente(3, "Pedro Martins", 20, "pedro@gmail.com", 3, true);
		// inserindo os clientes criados na lista de clientes do banco
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		clientesDoBanco.add(cliente03);
		
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		Cliente cliente = gerClientes.pesquisaCliente(1);
		
		
		assertThat(cliente.getId(), is(1));
 		assertThat(cliente.getEmail(), is("david_bool@hotmail.com"));
		
		 	}

	
	
	
}
