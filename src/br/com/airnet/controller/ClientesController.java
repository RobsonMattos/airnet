package br.com.airnet.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;

import br.com.airnet.model.Cliente;

@ManagedBean
@ViewScoped
public class ClientesController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Cliente> clientes = new ArrayList<Cliente>();
    
    @PostConstruct
    public void init() {
    	Cliente cliente = new Cliente();
    	cliente.setCodigo(new Long(1));
    	cliente.setNome("Robson José Neves Mattos");
    	cliente.setCpf("455.275.041-00");
    	
        clientes.add(cliente);
    }
     
    public List<Cliente> getClientes() {
        return clientes;
    }

}
