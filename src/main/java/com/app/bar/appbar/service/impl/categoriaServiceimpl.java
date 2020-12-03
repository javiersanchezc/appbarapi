package com.app.bar.appbar.service.impl;

import com.app.bar.appbar.repository.Dao.CategoriaRepositoryDao;
import com.app.bar.appbar.repository.entity.Categoria;
import com.app.bar.appbar.service.IcategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class categoriaServiceimpl implements IcategoriaService {

    @Autowired
    CategoriaRepositoryDao  categoriaRepositoryDao;
    @Override
    public List<Categoria> findall() {
        return (List<Categoria>) categoriaRepositoryDao.findAll();
    }

    @Override
    public Categoria save(Categoria categorias) {
        return null;
    }

    @Override
    public Optional<Categoria> findById(Integer id_producto) {
        return Optional.empty();
    }

    @Override
    public void delete(Categoria categoria) {

    }
}
