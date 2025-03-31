package br.com.crud.produto.produtos.servico;

import org.springframework.beans.factory.annotation.Autowired;
import br.com.crud.produto.produtos.modelo.ProdutoModelo;
import br.com.crud.produto.produtos.repositorio.ProdutoRepositorio;

public class ProdutoServico {
  @Autowired
  private ProdutoRepositorio pr;

  public Iterable<ProdutoModelo> listar() {
    return pr.findAll();

  }
}
