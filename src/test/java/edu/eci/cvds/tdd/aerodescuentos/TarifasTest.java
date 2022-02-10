package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;


public class TarifasTest {
  private CalculadorDescuentos Calculadora = new CalculadorDescuentos();
  {
    /**
        * La prueba debe dar 200 ya que la tarifa es 200 y no tiene descuento
        */
        @Test
        public void deberiaSerValidoSinDescuento() {
            Assert.assertEquals(200.0,(calcu.calculoTarifa(200,1,18)),0.0);
            Assert.assertEquals(200.0,(calcu.calculoTarifa(200,20,65)),0.0);
        }
    /**
        * La prueba deberia dar un descuento del 23% a la tarifa por la edad mayor y mas de 20 dias de anticipacion
        */
        @Test
        public void deberiaSerValidoDescuentoEdadMayorYDias() {
            Assert.assertEquals(154.0,(calcu.calculoTarifa(200,21,122)),0.0);
            Assert.assertEquals(154.0,(calcu.calculoTarifa(200,31,66)),0.0);
        }
    /**
        * la prueba deberia ser invalida porque los dias son menores o iguales a cero
        */
        @Test
        public void deberiaSerInvalidoPorDias() {
            Assert.assertNotEquals(0.0,(calcu.calculoTarifa(200,-1,1)),0.0);
            Assert.assertNotEquals(0.0,(calcu.calculoTarifa(200,0,1)),0.0);
        }
  }
}