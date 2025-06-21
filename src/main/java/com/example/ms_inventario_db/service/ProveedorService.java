package com.example.ms_inventario_db.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ms_inventario_db.model.dto.ProveedorDTO;
import com.example.ms_inventario_db.model.entities.Proveedor;
import com.example.ms_inventario_db.model.repository.ProveedorRepository;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    // Buscar proveedor por id y devolver DTO
    public ProveedorDTO findProveedorById(Integer id) {
        Optional<Proveedor> proveedorOpt = proveedorRepository.findById(id);
        return proveedorOpt.map(this::translateEntityToDto).orElse(null);
    }

    // Traducir entidad Proveedor a DTO
    public ProveedorDTO translateEntityToDto(Proveedor proveedor) {
        ProveedorDTO dto = new ProveedorDTO();
        dto.setIdProveedor(proveedor.getIdProveedor());
        dto.setNombre(proveedor.getNombre());
        dto.setEmail(proveedor.getEmail());
        dto.setTelefono(proveedor.getTelefono());
        return dto;
    }

    
}
