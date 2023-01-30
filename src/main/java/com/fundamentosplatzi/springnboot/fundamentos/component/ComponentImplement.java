package com.fundamentosplatzi.springnboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements IComponentDependency{
    @Override
    public void saludo() {
        System.out.println("Hola desde el componente");
    }
}
