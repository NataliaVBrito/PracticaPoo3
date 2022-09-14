package ejercicio11_poo;

import entitys.DateEntity;
import service.DateService;

public class Ejercicio11_poo {

    public static void main(String[] args) {
        DateService dateService = new DateService();
        DateEntity dateEntity = new DateEntity();

        dateService.createDate(dateEntity);
        dateService.compareDates(dateEntity);
    }

}
