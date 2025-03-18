package zn.almacen.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zn.almacen.modelo.Producto;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto,Integer> {
}
