package br.com.alura.mvc.mudi.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.mvc.mudi.model.Pedido;

public interface PedidosRepository extends CrudRepository<Pedido, Long>{

}
