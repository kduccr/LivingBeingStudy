package service.impl;

import DAO.HumanDAO;
import service.HumanService;
import service.LivingBeing;

public class HumanServiceImpl implements LivingBeing, HumanService {

    public String speak() {
        return "Ola rapaziada";
    }

    public String eat() {
        return "Estou comendo";
    }

    public String sleep() {
        return "Zzzzzzzz";
    }

    public String reproduct() {
        return "vucovuco";
    }
}
