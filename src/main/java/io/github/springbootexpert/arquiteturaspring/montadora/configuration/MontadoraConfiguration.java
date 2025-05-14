package io.github.springbootexpert.arquiteturaspring.montadora.configuration;

import io.github.springbootexpert.arquiteturaspring.montadora.Motor;
import io.github.springbootexpert.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motor(){
        var motor= new Motor();
        motor.setCavalos(170);
        motor.setCilindros(4);
        motor.setModelo("CIVIC");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }
}
