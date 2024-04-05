package br.edu.iftm.ds.exemplos.arquitetura.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.ds.exemplos.arquitetura.domain.produto;

@RestController
public class ProdutoControl {
    
    @Autowired
    private Producer dao;

    @GetMapping("/produto")
    public List<produto> getProdutos(){
        return dao.getProdutos();
        
    }
}
