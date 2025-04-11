package test;


import model.Belleza;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BellesaTest {
    
    Belleza bel = new Belleza();
    
    public BellesaTest() {
    }
    
    @Test
    public void testDeterminarPorcentaje(){
        float resultado = bel.determinarPorcentaje(1, 10, 1000000);
        Assertions.assertEquals(30, resultado, 0.0);
        
        resultado = bel.determinarPorcentaje(1, 1, 1000000);
        Assertions.assertEquals(10, resultado, 0.0);
        
        resultado = bel.determinarPorcentaje(2, 3, 1000000);
        Assertions.assertEquals(15, resultado, 0.0);
        
        resultado = bel.determinarPorcentaje(2, 1, 1000000);
        Assertions.assertEquals(5, resultado, 0.0);
        
        resultado = bel.determinarPorcentaje(3, 1, 10000000);
        Assertions.assertEquals(15, resultado, 0.0);
        
        resultado = bel.determinarPorcentaje(3, 1, 999999);
        Assertions.assertEquals(0, resultado, 0.0);
    }
    
    @Test
    public void testvalorDescuento(){
        float resultado = bel.valorDescuento(1000, (float)3.75);
        Assertions.assertEquals(37.5, resultado, 0.0);
    }
    
    
    @Test
    public void testValorPagar(){
        float resultado = bel.valorPagar(1000, (float)3.75);
        Assertions.assertEquals(996.25, resultado, 0.0);
    }
    
    @Test
    public void testContar(){
        int resultado = bel.contar(1000);
        Assertions.assertEquals(1001, resultado, 0.0);
    }
    
    @Test
    public void testAcumular(){
        float resultado = bel.acumular(1000, 500);
        Assertions.assertEquals(1500, resultado, 0.0);
    }
    
    @Test
    public void testCalcularPorcentaje(){
        float resultado = bel.calcularPorcentaje((float)1285.23, 5000);
        Assertions.assertEquals(25.7046, resultado, 0.1);
    }

}
