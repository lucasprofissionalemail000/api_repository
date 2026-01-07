package org.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProdutoController {

    private final ProdutoDAO dao;

    public ProdutoController(ProdutoDAO dao) {
        this.dao = dao;
    }

    @GetMapping("/produtos")
    public List<Produto> listar() {
        return dao.buscarTodos();
    }
}
