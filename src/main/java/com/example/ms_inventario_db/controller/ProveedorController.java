package com.example.ms_inventario_db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms_inventario_db.model.dto.ProveedorDTO;
import com.example.ms_inventario_db.service.ProveedorService;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @GetMapping("/{id}")
    public ProveedorDTO findProveedorById(@PathVariable("id")Integer id) {
        return proveedorService.findProveedorById(id);
    }

    
    
    
}
