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
        byte a = 26;
        System.out.println("Значение переменной a с типом byte равно " + a);
        short b = 200;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 40000;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 9223372036854775807L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 1.7F;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 1.79779779D;
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float onePortion = 27.12f;
        System.out.println(onePortion);
        long d = 987678965549L;
        System.out.println(d);
        float a = 2.786f;
        System.out.println(a);
        short c = 569;
        System.out.println(c);
        short e = -159;
        System.out.println(e);
        int b = 27897;
        System.out.println(b);
        byte f = 67;
        System.out.println(f);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte LyudmilaStudents = 23;
        byte AnnaStudents = 27;
        byte CatherineStudents = 30;
        short sheetsOfPaper = 480;
        int allStudents =  LyudmilaStudents + AnnaStudents + CatherineStudents;
        System.out.println("Всего учеников " + allStudents);
        int oneSheetToaStudent = sheetsOfPaper / allStudents;
        System.out.println("На каждого ученика рассчитано " + oneSheetToaStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte bottles = 16;
        byte twoMinutes = 2;
        byte twentyMinutes = 20;
        short perDayOfMinutes = 1440;
        short inThreeDaysMinutes = 4320;
        int monthInMinutes = 43200;
        byte oneMinutesBottles = (byte) (bottles / twoMinutes);
        System.out.println("В одну минуту делается " + oneMinutesBottles + " бутылок");
        int twentyMinutesBottles = twentyMinutes * oneMinutesBottles;
        System.out.println("За "+ twentyMinutes + " машина произвела " + twentyMinutesBottles + " штук бутылок");
        int perDayOfMinutesBottles = perDayOfMinutes * oneMinutesBottles;
        System.out.println("За " + perDayOfMinutes + " машина произвела " + perDayOfMinutesBottles + " штук бутылок");
        int inThreeDaysMinutesBottles = inThreeDaysMinutes * oneMinutesBottles;
        System.out.println("За "+ inThreeDaysMinutes + " машина произвела " + inThreeDaysMinutesBottles + " штук бутылок");
        int monthInMinutesBottles = monthInMinutes * oneMinutesBottles;
        System.out.println("За "+ monthInMinutes + " машина произвела " + monthInMinutesBottles + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        short Paints = 120;
        byte oneClassCansOfWhitePaint = 2;
        byte oneClassCansOfBrownPaint = 4;
        int allClass = Paints / (oneClassCansOfWhitePaint + oneClassCansOfBrownPaint);
        System.out.println("Всего классов " + allClass);
        int allWhitePaint = oneClassCansOfWhitePaint * allClass;
        System.out.println("Всего белой краски " + allWhitePaint);
        int allBrownPaint = Paints - allWhitePaint;
        System.out.println("Всего коричневой краски " + allBrownPaint);
        System.out.println("В школе, где " + allClass + " классов, нужно " + allWhitePaint + " банок белой краски и " + allBrownPaint + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte Bananas = 5;
        byte BananaGram = 80;
        byte oneHundredMillilitersMilkGram = 105;
        byte IceCreamSundae = 2;
        byte oneIceCreamSundaeGram = 100;
        byte rawEggs = 4;
        byte oneEggsGram = 70;
        int sportsBreakfast = (Bananas * BananaGram) + (oneHundredMillilitersMilkGram * 2) + (IceCreamSundae * oneIceCreamSundaeGram) + (rawEggs * oneEggsGram);
        System.out.println("Вес спортзавтрака равен " + sportsBreakfast + " грамм");
        float sportsBreakfastKilogram = sportsBreakfast / 1000f;
        System.out.println("Вес спортзавтрака  равен " + sportsBreakfastKilogram + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        byte throwOffKilogram = 7;
        short loseEveryDayGram = 250;
        short loseWeightEveryDayGram = 500;
        int kilogramsInGrams = throwOffKilogram * 1000;
        System.out.println("Надо сбросить вес в граммах " + kilogramsInGrams);
        int weightLoss1 = kilogramsInGrams / loseEveryDayGram;
        System.out.println("При потере веса каждый день по "+ loseEveryDayGram +" грамм уйдёт " + weightLoss1 + " дней");
        int weightLoss2 = kilogramsInGrams / loseWeightEveryDayGram;
        System.out.println("При потере веса каждый день по "+ loseWeightEveryDayGram +" грамм уйдёт " + weightLoss2 + " дней");
        int daysOnAverage = (weightLoss1 + weightLoss2) / 2;
        System.out.println("В среднем " + daysOnAverage + " день " + "чтобы добиться результата похудения");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int MashaGets = 67760;
        int DenisGets = 83690;
        int KristinaGets = 76230;
        int MashaIncreaseSalary = (MashaGets * 10) / 100;
        System.out.println(MashaIncreaseSalary);
        int mashaNewSalaryYear = MashaGets + MashaIncreaseSalary;
        System.out.println(mashaNewSalaryYear);
        int newAnnualSalaryMasha = mashaNewSalaryYear * 12;
        System.out.println(newAnnualSalaryMasha);
        int oldAnnualSalaryMasha = MashaGets * 12;
        System.out.println(oldAnnualSalaryMasha);
        int salaryDifferenceMasha = newAnnualSalaryMasha - oldAnnualSalaryMasha;
        System.out.println("Маша теперь получает " + mashaNewSalaryYear + " рублей. Годовой доход вырос на " + salaryDifferenceMasha + " рублей");
        long denisIncreaseSalary = (DenisGets * 10) / 100;
        System.out.println(denisIncreaseSalary);
        long denisNewSalaryYear = DenisGets + denisIncreaseSalary;
        System.out.println(denisNewSalaryYear);
        long newAnnualSalaryDenis = denisNewSalaryYear * 12;
        System.out.println(newAnnualSalaryDenis);
        long oldAnnualSalaryDenis = DenisGets * 12;
        System.out.println(oldAnnualSalaryDenis);
        long salaryDifferenceDenis = newAnnualSalaryDenis - oldAnnualSalaryDenis;
        System.out.println("Денис теперь получает " + denisNewSalaryYear + " рублей. Годовой доход вырос на " + salaryDifferenceDenis + " рублей");
        long KristinaIncreaseSalary = ( KristinaGets * 10) / 100;
        System.out.println(KristinaIncreaseSalary);
        long KristinaNewSalaryYear = KristinaGets + KristinaIncreaseSalary;
        System.out.println(KristinaNewSalaryYear);
        long newAnnualSalaryKristina = KristinaNewSalaryYear * 12;
        System.out.println(newAnnualSalaryKristina);
        long oldAnnualSalaryKristina = KristinaGets * 12;
        System.out.println(oldAnnualSalaryKristina);
        long salaryDifferenceKristina = newAnnualSalaryKristina - oldAnnualSalaryKristina;
        System.out.println("Кристина теперь получает " + KristinaNewSalaryYear + " рублей. Годовой доход вырос на " + salaryDifferenceKristina + " рублей");
    }
}