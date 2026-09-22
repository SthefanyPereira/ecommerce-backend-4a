package br.edu.unifio.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce.entidades.Pedido;

@SpringBootTest 
@TestMethodOrder (MethodOrderer.OrderAnnotation.class)
public class PedidoRepositorioTests {
@Autowired 
    private PedidoRepositorio PedidoRepositorio;
@Test 
    public void deveBuscarUmPedidoPorId(){
    
    Pedido pedido = PedidoRepositorio.findById(4).orElseThrow();

         assertNotNull(pedido);
        assertEquals(4, pedido.getCliente().getId());
        assertEquals(99.90, pedido.getValorTotal().doubleValue());
        assertEquals(LocalDateTime.parse("2026-09-13T19:15:00"),pedido.getData());
        assertEquals("Enviado", pedido.getStatus());

    }
    @Test
    public void deveListarPagamento() {

        var pedido = PedidoRepositorio.findAll();

        assertNotNull(pedido);
        assertEquals(5, pedido.size());
    }
}
