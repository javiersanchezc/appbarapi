package com.app.bar.appbar.service.impl;

import com.app.bar.appbar.repository.Dao.TiendaRepositoryDao;
import com.app.bar.appbar.repository.entity.Tienda;
import com.app.bar.appbar.service.ItiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class tiendaServiceimpl implements ItiendaService {
    @Autowired
    TiendaRepositoryDao  tiendaRepositoryDao;

    @Override
    public List<Tienda> findall() {
        return (List<Tienda>) tiendaRepositoryDao.findAll();
    }

    @Override
    public Tienda save(Tienda tiendas) {
        return null;
    }

    @Override
    public Optional<Tienda> findById(Integer id_producto) {
        return Optional.empty();
    }

    @Override
    public void delete(Tienda tiendas) {

    }
}
