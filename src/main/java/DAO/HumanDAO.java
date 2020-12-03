package DAO;

import model.Human;

import java.util.ArrayList;
import java.util.List;

public class HumanDAO {
    public static List<Human> getHumansDB() {
        Human pecanha = new Human(2, true, "portugues", "programador", "asa sul", 123454677);
        Human guedes = new Human(2, true, "portugues", "astronauta", "park sul", 954878152);
        Human fulano = new Human(2, false, "ingles", "cozinheiro", "times square", 524163897);

        List<Human> humanList = new ArrayList<Human>();
        humanList.add(pecanha);
        humanList.add(guedes);
        humanList.add(fulano);

        return humanList;
    }
}
