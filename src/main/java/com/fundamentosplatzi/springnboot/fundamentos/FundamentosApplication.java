package com.fundamentosplatzi.springnboot.fundamentos;

import com.fundamentosplatzi.springnboot.fundamentos.component.IComponentDependency;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

    private final IComponentDependency iComponentDependency;

    public FundamentosApplication(IComponentDependency iComponentDependency) {
        this.iComponentDependency = iComponentDependency;
    }

    public static void main(String[] args) {
        SpringApplication.run(FundamentosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        iComponentDependency.saludo();
    }
}
