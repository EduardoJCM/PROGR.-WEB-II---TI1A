package com.miempresa.crudproductos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.miempresa.crudproductos.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
