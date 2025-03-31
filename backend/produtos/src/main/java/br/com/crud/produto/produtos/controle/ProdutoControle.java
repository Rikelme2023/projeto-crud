package br.com.crud.produto.produtos.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.crud.produto.produtos.modelo.ProdutoModelo;
import br.com.crud.produto.produtos.servico.ProdutoServico;

public class ProdutoControle {
  @Autowired
  private ProdutoServico ps;

  @PostMapping("/cadastrar")
  public ResponseEntity<?> cadastrar(@RequestBody ProdutoModelo pm) {
    return ps.cadastrar(pm);

  }

  @GetMapping("/listar")
  public Iterable<ProdutoModelo> listar() {
    return ps.listar();

  }
}