package zn.almacen.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import zn.almacen.modelo.Pedido;

public interface PedidoRepositorio extends JpaRepository<Pedido, Integer> {
}
