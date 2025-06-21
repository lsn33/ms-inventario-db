package com.example.ms_inventario_db.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ms_inventario_db.model.entities.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {

}
