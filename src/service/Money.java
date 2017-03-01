package service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Master on 28.08.2016.
 */
public class Money {
    private int income;
    private LocalDate date;
    Scanner sc = new Scanner(System.in);

    public Money(int income, LocalDate date) {
        this.income = income;
        this.date = date;
    }
    public Money(){}

    public int getIncome() {
        return income;
    }

    public LocalDate getDate() {
        return date;
    }

    public void report(ArrayList<Money> moneys){
        /*
        можно было сделать отдельно за день, неделю, месяц,
        но пока решил любой период и без проверки на допуск работника
        и проверок на ошибки ввода
        -----------------------------------------------------------
        все-таки решил сделать проверку на допуск (считаем это аналог пароля),
        чтобы админ мог смотреть кол-во отремонтированной техники
         */
        System.out.println("Input profID");
        int id = sc.nextInt();
        System.out.println("Input start date in format d/M/yy (only XXI century)");
        String sDay = sc.next();
        /*System.out.println("Input start month");
        int sMonth = sc.nextInt();
        System.out.println("Input start year");
        int sYaer = sc.nextInt();*/
        System.out.println("Input end date in format d/M/yy (only XXI century)");
        String eDay = sc.next();
        /*System.out.println("Input end month");
        int eMonth = sc.nextInt();
        System.out.println("Input end year");
        int eYear = sc.nextInt();*/
        LocalDate startDay = LocalDate.parse(sDay, DateTimeFormatter.ofPattern("d/M/yy"));
                //LocalDate.of(sYaer, sMonth, sDay);
        LocalDate endDay = LocalDate.parse(eDay, DateTimeFormatter.ofPattern("d/M/yy"));
                //LocalDate.of(eYear, eMonth, eDay);
        //Period period = Period.between(start, end);
        //long days = ChronoUnit.DAYS.between(start, end);

        /*
        Не самое изящное решение бегать по всему массиву, но другого не придумал
         */
        int sum = 0;
        int kolvo = 0;
        for (int i = 0; i < moneys.size(); i++) {
            if (moneys.get(i).date.isAfter(startDay.minusDays(1))){
                if(moneys.get(i).date.isBefore(endDay.plusDays(1))){
                    sum += moneys.get(i).income;
                    kolvo++;
                }
            }

        }
        if (id == 1) {
            System.out.println("Доход за период = " + sum);
        } else if(id ==2){
            System.out.println("Кол-во отремонтированной техники за период = " + kolvo);
        }
    }

}
