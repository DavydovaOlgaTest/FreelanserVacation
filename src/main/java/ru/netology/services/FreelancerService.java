package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0; //количество денег на счету
        int count = 0; //счётчик месяцев отдыха

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) { //отдыхаем
                money -= expenses;
                money /= 3;
                count++;
            } else {  //работаем
                money += income;
                money -= expenses;
            }
        }
        return count;
    }
}
