package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person();

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void validar_Muerto() {

        Person persona = new Person("Daniela",1235,100,Gender.FEMALE,false);

        RegisterResult resultado = registry.registerVoter(persona);

        Assert.assertEquals(RegisterResult.DEAD, resultado);
    }

    @Test
    public void validar_Menor_Edad() {

        Person persona = new Person("Fernanda",12357,12,Gender.FEMALE,true);

        RegisterResult resultado = registry.registerVoter(persona);

        Assert.assertEquals(RegisterResult.UNDERAGE, resultado);
    }

    @Test
    public void validarEdad_Invalida() {

        Person persona = new Person("Carlos",123,-1,Gender.MALE,true);

        RegisterResult resultado = registry.registerVoter(persona);

        Assert.assertEquals(RegisterResult.INVALID_AGE, resultado);
    }

    @Test
    public void validar() {

        Person persona = new Person("Javier",1234766,45,Gender.MALE,true);

        RegisterResult resultado = registry.registerVoter(persona);

        Assert.assertEquals(RegisterResult.VALID, resultado);
    }

    @Test
    public void validar_Duplicado() {

        Person persona1 = new Person("Alejandro",1234,45,Gender.MALE,true);

        Person persona2 = new Person("Alejandro",1234,45,Gender.MALE,true);

        registry.registerVoter(persona1);
        RegisterResult resultado = registry.registerVoter(persona2);

        Assert.assertEquals(RegisterResult.DUPLICATED, resultado);
    }
}