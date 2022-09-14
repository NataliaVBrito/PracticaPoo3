package service;

import entitys.DateEntity;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateService {

    Scanner read = new Scanner(System.in);

    /**
     * Se pide al usuario que ingrese el año, mes y dia de su nacimiento. Se
     * guardan los datos en sus variables correspondientes Se settea la variable
     * birth de tipo LocalDate con los datos pedidos.
     *
     * @param date
     */
    public void createDate(DateEntity date) {
        System.out.println("Ingrese el año de su nacimiento");
        date.setYear(read.nextInt());

        System.out.println("Ingrese el mes de su nacimiento");
        date.setMonth(read.nextInt());

        System.out.println("Ingrese el dia de su nacimiento");
        date.setDay(read.nextInt());

        date.setBirth(LocalDate.of(date.getYear(), date.getMonth(), date.getDay()));
    }

    /**
     * Se imprime la fecha ingresada por el usuario Se trae e imprime la fecha
     * actual previamente creada en la entidad Se calcula la cantidad de años de
     * diferencia
     *
     * @param date
     */
    public void compareDates(DateEntity date) {
        System.out.println("Su nacimiento fue el: " + date.getBirth());

        System.out.println("Hoy es: " + date.getDate());

        System.out.println("Han pasado...");

        long difference = ChronoUnit.YEARS.between(date.getBirth(), date.getDate());
        System.out.println(difference + " años");
    }

}
