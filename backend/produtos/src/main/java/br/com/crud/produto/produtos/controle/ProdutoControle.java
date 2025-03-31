package br.com.crud.produto.produtos.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.crud.produto.produtos.modelo.ProdutoModelo;
import br.com.crud.produto.produtos.servico.ProdutoServico;

public class ProdutoControle {
  @Autowired
  private ProdutoServico ps;

  @GetMapping("/listar")
  public Iterable<ProdutoModelo> listar() {
    return ps.listar();

  }
}