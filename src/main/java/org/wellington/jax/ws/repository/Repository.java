package org.wellington.jax.ws.repository;

import org.wellington.jax.ws.models.Noticia;

import java.util.List;

public interface Repository {

    Long adicionar(Noticia noticia);
    Noticia alterar(Noticia noticia);
    void apagar(long id);
    List<Noticia> listar();
    Noticia ler(long id);

}
