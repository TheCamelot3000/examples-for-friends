package br.com.example.withoutif.animal;

import java.util.HashMap;
import java.util.Map;

public class AnimalFactory {
    private static final Map<Integer, Animal> FACTORY = new HashMap<>();

    public static Animal getAnimalById(int id) {
        FACTORY.put(1, new Dog());
        FACTORY.put(2, new Cat());
        FACTORY.put(3, new Cow());
        FACTORY.put(4, new Fish());
        FACTORY.put(5, new Lion());

        return FACTORY.get(id);
    }

    public static Map<Integer, Animal> getFACTORY() {
        return FACTORY;
    }
}
