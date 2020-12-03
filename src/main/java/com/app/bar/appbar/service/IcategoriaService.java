package com.app.bar.appbar.service;

import com.app.bar.appbar.repository.entity.Categoria;
import com.app.bar.appbar.repository.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface IcategoriaService {
    public List<Categoria> findall();
    public Categoria save(Categoria categorias);
    public Optional<Categoria> findById(Integer  id_producto);
    public void delete(Categoria categoria);
}
