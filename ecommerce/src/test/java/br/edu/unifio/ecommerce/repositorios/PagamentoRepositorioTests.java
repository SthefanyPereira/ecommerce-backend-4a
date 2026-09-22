package br.edu.unifio.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce.entidades.Pagamento;

@SpringBootTest 
@TestMethodOrder (MethodOrderer.OrderAnnotation.class)
public class PagamentoRepositorioTests {
@Autowired 
   private PagamentoRepositorio pagamentoRepositorio;
@Test 
   public void deveBuscarUmPagamentoPorId(){
    Pagamento pagamento = pagamentoRepositorio.findById(1).orElseThrow();

        assertNotNull(pagamento);
        assertEquals(1, pagamento.getPedido().getId());
        assertEquals(49.80, pagamento.getValor().doubleValue());
        assertEquals(LocalDateTime.parse("2026-09-10T13:30:00"),pagamento.getData());
        assertEquals("Pago", pagamento.getStatus());
        assertEquals("Pix", pagamento.getTipo());
        
}

 @Test
    public void deveListarPagamento() {

        var pagamento = pagamentoRepositorio.findAll();

        assertNotNull(pagamento);
        assertEquals(5, pagamento.size());
    }
}
