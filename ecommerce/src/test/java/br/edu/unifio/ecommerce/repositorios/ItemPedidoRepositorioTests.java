package br.edu.unifio.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce.entidades.ItemPedido;

@SpringBootTest 
@TestMethodOrder (MethodOrderer.OrderAnnotation.class)
public class ItemPedidoRepositorioTests {
@Autowired 
    private ItemPedidoRepositorio itemPedidoRepositorio;

    @Test
    public  void deveBuscarUmItemPedidoPorId(){
        ItemPedido itemPedido = itemPedidoRepositorio.findById(3).orElseThrow();

       assertNotNull(itemPedido);
        assertEquals(3, itemPedido.getQuantidade());
        assertEquals(49.90, itemPedido.getValorUnitario().doubleValue());
        assertEquals(3, itemPedido.getPedido().getId());
        assertEquals(3, itemPedido.getProduto().getId());
    }

    @Test
    public void deveListarItensPedido() {

        var itensPedido = itemPedidoRepositorio.findAll();

        assertNotNull(itensPedido);
        assertEquals(5, itensPedido.size());
    }
}