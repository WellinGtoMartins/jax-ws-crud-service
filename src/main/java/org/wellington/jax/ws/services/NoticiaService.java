package org.wellington.jax.ws.services;

import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import org.wellington.jax.ws.models.Noticia;

import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface NoticiaService {

    Long adicionar(Noticia noticia);
    Noticia alterar(Noticia noticia);
    void apagar(long id);
    List<Noticia> listar();
    Noticia ler(long id);

}
