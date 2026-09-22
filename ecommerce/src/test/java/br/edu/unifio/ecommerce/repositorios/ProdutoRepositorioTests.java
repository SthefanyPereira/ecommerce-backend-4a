package br.edu.unifio.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce.entidades.Produto;

@SpringBootTest 
@TestMethodOrder (MethodOrderer.OrderAnnotation.class)
public class ProdutoRepositorioTests {
@Autowired 
    private ProdutoRepositorio produtoRepositorio;
@Test 
    public void deveBuscarUmProdutoPorId(){
        Produto produto = produtoRepositorio.findById(5).orElseThrow();

        assertNotNull(produto);
        assertEquals((short)3, produto.getCategoria().getId());
        assertEquals((short)18, produto.getEstoque());
        assertEquals(79.90, produto.getPreco().doubleValue());
        assertEquals("Luminária para escritório", produto.getDescricao());
        assertEquals("Luminária de Mesa", produto.getNome());
    }

    @Test
    public void deveListarProduto() {

        var produto = produtoRepositorio.findAll();

        assertNotNull(produto);
        assertEquals(5, produto.size());
    }
}
