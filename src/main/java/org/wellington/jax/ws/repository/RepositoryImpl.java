package org.wellington.jax.ws.repository;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.wellington.jax.ws.models.Noticia;

import java.util.List;

@RequestScoped
public class RepositoryImpl implements Repository {

    @Inject
    private EntityManager em;

    @Override
    public Long adicionar(Noticia noticia) {
        em.persist(noticia);
        return noticia.getId();
    }

    @Override
    public Noticia alterar(Noticia noticia) {
        return em.merge(noticia);
    }

    @Override
    public void apagar(long id) {
        Noticia n = em.find(Noticia.class, id);
        em.remove(n);
    }

    @Override
    public List<Noticia> listar() {
        return em.createQuery("select n from Noticia n", Noticia.class).getResultList();
    }

    @Override
    public Noticia ler(long id) {
        return em.find(Noticia.class, id);
    }
}
