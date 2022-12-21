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
    public static void task1 () {
        System.out.println("Задача 1");

        int a = 10000000;
        System.out.println("Значение переменной a с типом int равно " +a+ "");

        byte b = 100;
        System.out.println("Значение переменной b с типом byte равно " +b+ "");

        short c = 10000;
        System.out.println("Значение переменной c с типом short равно " +c+ "");

        long d = 1000000000L;
        System.out.println("Значение переменной d с типом long равно " +d+ "");

        float e = 3.14F;
        System.out.println("Значение переменной e с типом float равно " +e+ "");

        double f = 9.876987;
        System.out.println("Значение переменной f с типом double равно " +f+ "");

    }
    public static void task2 () {
        System.out.println("Задача 2");

        float a = 27.12F;
        System.out.println(a);

        long b = 987678965549L;
        System.out.println(b);

        float c = 2.786F;
        System.out.println(c);

        short d = 569;
        System.out.println(d);

        short e = -159;
        System.out.println(e);

        short f = 27897;
        System.out.println(f);

        byte g = 67;
        System.out.println(g);

    }
    public static void task3 () {

        byte studentsLudPav = 23;
        System.out.println(studentsLudPav);

        byte studentsAnnSerg = 27;
        System.out.println(studentsAnnSerg);

        byte studentsEkatAndreev = 30;
        System.out.println(studentsEkatAndreev);

        short allPaperNumber = 480;
        System.out.println(allPaperNumber);

        int paperForStudents = allPaperNumber / (studentsAnnSerg + studentsEkatAndreev + studentsLudPav);
        System.out.println("На каждого ученика рассчитано " + paperForStudents + " листов бумаги");

    }
    public static void task4 () {
        System.out.println("Задание 4");

        byte machinePerfomanceTwoMin = 16;
        System.out.println("За 2 минуты машина произвела " + machinePerfomanceTwoMin + " штук бутылок");

        int machinePerfomanceOneMin = machinePerfomanceTwoMin / 2;
        System.out.println("За 1 минуту машина произвела " + machinePerfomanceOneMin + " штук бутылок");

        int machinePerfomanceOneHour = machinePerfomanceOneMin * 60;
        System.out.println("За 1 час машина произвела " + machinePerfomanceOneHour + " штук бутылок");

        int machinePerfomanceTwentyMin = machinePerfomanceOneMin * 20;
        System.out.println("За 20 минут машина произвела " + machinePerfomanceTwentyMin + " штук бутылок");

        int machinePerfomanceOneDay = machinePerfomanceOneHour * 24;
        System.out.println("За 1 день машина произвела " + machinePerfomanceOneDay + " штук бутылок");

        int machinePerfomanceThreeDays = machinePerfomanceOneDay * 3;
        System.out.println("За 3 дня машина произвела " + machinePerfomanceThreeDays + " штук бутылок");

        int machinePerfomanceOneMonth = machinePerfomanceOneDay * 30;
        System.out.println("За месяц машина произвела " + machinePerfomanceOneMonth + " штук бутылок");

    }
    public static void task5 () {
        System.out.println("Задание 5");

        byte allPaints = 120;
        System.out.println(allPaints);

        byte whitePaint = 2;
        System.out.println(whitePaint);

        byte brownPaint = 4;
        System.out.println(brownPaint);

        int allPaintsOneClass = whitePaint + brownPaint;
        System.out.println(allPaintsOneClass);

        int allClassesNumber = allPaints / allPaintsOneClass;
        System.out.println(allClassesNumber);

        int whitePaintsAllClasses = allClassesNumber * whitePaint;
        System.out.println(whitePaintsAllClasses);

        int brownPaintsAllClasses = allClassesNumber * brownPaint;
        System.out.println(brownPaintsAllClasses);
        System.out.println("В школе, где " + allClassesNumber +
                " классов, нужно " + whitePaintsAllClasses + " банок белой краски и" +
                " " + brownPaintsAllClasses + " банок коричневой краски");

    }
    public static void task6 () {
        System.out.println("Задание 6");

        int bananasG = 5 * 80;
        System.out.println(bananasG);

        int milkG = (200 / 100) * 105 ;
        System.out.println(milkG);

        int iceCreamG = 100 * 2;
        System.out.println(iceCreamG);

        int eggsG = 4 * 70;
        System.out.println(eggsG);

        int breakfastWeightG = bananasG +milkG + iceCreamG + eggsG;
        System.out.println(breakfastWeightG);

        float breakfastWeightKg = (bananasG + milkG + iceCreamG + eggsG) / 1000F;
        System.out.println(breakfastWeightKg);
        System.out.println(" Общий вес завтрака " + breakfastWeightKg + " кг!");
        System.out.println(" Общий вес завтрака " + breakfastWeightG + " г!" );

    }
    public static void task7 () {
        System.out.println("Задание 7");

        int sportsmenOverWeightG = 7 * 1000;
        System.out.println(sportsmenOverWeightG);

        short firstOverWeightLose = 250;
        System.out.println(firstOverWeightLose);

        short secondOverWeightLose = 500;
        System.out.println(secondOverWeightLose);

        int firstOverWeightLoseDays = sportsmenOverWeightG / firstOverWeightLose;
        System.out.println(firstOverWeightLoseDays);

        int secondOverWeightLoseDays = sportsmenOverWeightG / secondOverWeightLose;
        System.out.println(secondOverWeightLoseDays);

        int mediumOverWeightLoseDays = (firstOverWeightLoseDays + secondOverWeightLoseDays) / 2;
        System.out.println("Для похудения в среднем понадобится " + mediumOverWeightLoseDays +" день");
    }
    public static void task8 () {
        System.out.println("Задание 8");

        int salaryMary = 67760;
        System.out.println(salaryMary);

        int salaryDen = 83690;
        System.out.println(salaryDen);

        int salaryChristina = 76230;
        System.out.println(salaryChristina);

        float newSalaryMary = salaryMary * 1.1F;
        System.out.println(newSalaryMary);

        float newSalaryDen = salaryDen * 1.1F;
        System.out.println(newSalaryDen);

        float newSalaryChristina = salaryChristina * 1.1F;
        System.out.println(newSalaryChristina);

        float differenceYearSalaryMary = newSalaryMary * 12 - salaryMary * 12;
        System.out.println(differenceYearSalaryMary);

        float differenceYearSalaryDen = newSalaryDen * 12 - salaryDen * 12;
        System.out.println(differenceYearSalaryDen);

        float differenceYearSalaryChristina = newSalaryChristina * 12 - salaryChristina * 12;
        System.out.println(differenceYearSalaryChristina);

        System.out.println("Маша теперь получает " + newSalaryMary + " рублей." +
                " Годовой доход вырос на " + differenceYearSalaryMary + " рублей");

        System.out.println("Маша теперь получает " + newSalaryDen + " рублей." +
                " Годовой доход вырос на " + differenceYearSalaryDen + " рублей");

        System.out.println("Маша теперь получает " + newSalaryChristina + " рублей." +
                " Годовой доход вырос на " + differenceYearSalaryChristina + " рублей");

    }
}