public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println(" Задача 1 ");
        int deposit = 15000;
        int accumulation = 0;
        for (int i = 1; accumulation < 2_459_000; i++) {
            accumulation = accumulation + deposit;
            System.out.println(" Месяц " + i + " , сумма накоплений равна " + accumulation + " рублей");
        }
    }

    public static void task2() {
        System.out.println(" Задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(+i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(+i + " ");
        }
        System.out.println(" ");
    }

    public static void task3() {
        System.out.println(" Задача 3 ");
        int population = 12_000_000;
        int newPopulation = 0;
        int growthPopulation = 0;
        int natality = population / 1000 * 17;
        int morality = population / 1000 * 8;
        growthPopulation = natality - morality;
        for (int i = 1; i <= 10; i++) {
            newPopulation = newPopulation + growthPopulation + population;
            System.out.println("Год " + i + " , численность населения составляет " + newPopulation);
        }
    }

    public static void task4() {
        System.out.println(" Задача 4 ");
        int deposit = 15000;
        int percent = 7;
        int income = 0;
        int newIncome = 0;
        int i = 1;
        for (; newIncome <= 12_000_000; i++) {
            income = (deposit * percent / 100);
            newIncome = newIncome + deposit + income;
            System.out.println(" Месяц " + i + " сумма накоплений составляет " + newIncome);
        }
        System.out.println(" Доход всего " + newIncome);
        System.out.println(" Всего месяцев " + i);
    }

    public static void task5() {
        System.out.println(" Задача 5");
        int deposit = 15000;
        int percent = 7;
        int income = 0;
        int newIncome = 0;
        int i = 1;
        for (; newIncome <= 12_000_000; i++) {
            income = (deposit * percent / 100);
            newIncome = newIncome + deposit + income;
            if (i % 6 == 0) {
                System.out.println(" Месяц " + i + " сумма накоплений составляет " + newIncome);
            }
            System.out.println(" Всего месяцев " + i);
        }
    }

    public static void task6() {
        System.out.println(" Задача 6 ");
        int deposit = 15000;
        int percent = 7;
        int income = 0;
        int newIncome = 0;
        for (int i = 0; i <= 108; i++) {
            income = (deposit * percent / 100);
            newIncome = newIncome + deposit + income;
            if (i % 6 == 0) {
                System.out.println(" Сумма накоплений в " + i + " месяц равна " + newIncome);
            }
            System.out.println(" Всего месяцев " + i);
        }
    }

    public static void task7() {
        System.out.println(" Задача 7 ");
        int firstFriday = 1;
        do {
            System.out.println("Сегодня пятница " + firstFriday + " -е число. Необходимо подготовить отчет ");
            firstFriday = firstFriday + 7;
        }
        while (firstFriday <= 31);
    }

    public static void task8() {
        System.out.println("Задача 8 ");
        int zeroYear = 0;
        int startYear = 1823;
        int finishYear = 2123;
        for (int i = 0; i <= 2123; i = i + 79) {
            zeroYear = zeroYear + 79;
            if (zeroYear >= startYear && zeroYear <= finishYear) {
                System.out.println("  Комета пролетает " + zeroYear);
            }
        }
    }
}


