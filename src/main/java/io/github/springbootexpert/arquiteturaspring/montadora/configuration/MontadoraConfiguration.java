package io.github.springbootexpert.arquiteturaspring.montadora.configuration;

import io.github.springbootexpert.arquiteturaspring.montadora.Motor;
import io.github.springbootexpert.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    public Motor motorAspirado(){
        var motor= new Motor();
        motor.setCavalos(170);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        var motor= new Motor();
        motor.setCavalos(110);
        motor.setCilindros(4);
        motor.setModelo("TH-40");
        motor.setLitragem(1.4);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo(){
        var motor= new Motor();
        motor.setCavalos(180);
        motor.setCilindros(4);
        motor.setModelo("XPTO-1");
        motor.setLitragem(1.5);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
}
