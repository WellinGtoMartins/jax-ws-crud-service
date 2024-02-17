package org.wellington.jax.ws.services;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.wellington.jax.ws.models.Noticia;
import org.wellington.jax.ws.repository.Repository;

import java.util.List;

@Stateless
@WebService(endpointInterface = "org.wellington.jax.ws.services.NoticiaService")
public class NoticiaServiceImpl implements NoticiaService {

    @Inject
    private Repository repository;

    @Override
    @WebMethod
    public Long adicionar(Noticia noticia) {
        return repository.adicionar(noticia);
    }

    @Override
    @WebMethod
    public Noticia alterar(Noticia noticia) {
        return repository.alterar(noticia);
    }

    @Override
    @WebMethod
    public void apagar(long id) {
        repository.apagar(id);
    }

    @Override
    @WebMethod
    public List<Noticia> listar() {
        return repository.listar();
    }

    @Override
    @WebMethod
    public Noticia ler(long id) {
        return repository.ler(id);
    }
}
