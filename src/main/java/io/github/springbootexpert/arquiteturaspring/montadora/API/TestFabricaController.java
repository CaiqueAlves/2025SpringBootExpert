package io.github.springbootexpert.arquiteturaspring.montadora.API;

import io.github.springbootexpert.arquiteturaspring.montadora.Chave;
import io.github.springbootexpert.arquiteturaspring.montadora.HondaHRV;
import io.github.springbootexpert.arquiteturaspring.montadora.Motor;
import io.github.springbootexpert.arquiteturaspring.montadora.CarroStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TestFabricaController {

    @Autowired
    @Qualifier("motorEletrico")
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }
}
