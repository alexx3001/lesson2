public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte a = 120;
        short b = 32500;
        int c = 2147483640;
        long d = 2489L;
        float e =323.123456f;
        double f = 767.1234567890;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        //Задача 2
        System.out.println("");
        System.out.println("Задача 2");
        float aa = 27.2f;
        long bb = 987678965549L;
        byte cc = 2;
        short dd = 786;
        boolean ee = false;
        short ff = 569;
        short gg = -159;
        short hh = 27897;
        byte ii = 67;

        //Задача 3
        System.out.println("");
        System.out.println("Задача 3");
        short studentsLP = 23;
        short studentsAS = 27;
        short studentsEA = 30;
        short totalPaper = 480;
        int paperPerStudents = totalPaper / (studentsLP + studentsEA + studentsAS);
        System.out.println("На каждого ученика рассчитано " +paperPerStudents+ " листов бумаги");

        //Задача 4
        System.out.println("");
        System.out.println("Задача 4");
        byte bottle = 16;
        byte time2min = 2;
        int bottleInMin = bottle / time2min;

        int bottle20Min = bottleInMin * 20;
        System.out.println("За 20 минут работы, машина произвела бутылок " + bottle20Min + " штук");

        //Количество минут в сутках
        int minIn24Hours = 24 * 60;

        int bottle24Hours = bottleInMin * minIn24Hours; // количество бутылок в сутки
        System.out.println("За 1 сутки работы, машина произвела бутылок " + bottle24Hours + " штук");

        int bottle3days = bottle24Hours * 3;  // количество бутылок за три дня
        System.out.println("За 3 дня работы, машина произвела бутылок " + bottle3days + " штук");

        int bottle30days = bottle24Hours * 30;  // количество бутылок за месяц
        System.out.println("За 1 месяц работы, машина произвела бутылок " + bottle30days + " штук");


        //Задача 5
        System.out.println("");
        System.out.println("Задача 5");
        short numClass = 120 / 6; //количество классов в школе
        int whiteColor = numClass * 2; //количесто банок с белой краской
        int braunColor = numClass * 4; //количество банок с коричневой краской
        System.out.println("В школе, где " + numClass + " классов, нужно " + whiteColor + " банок белой краски и " + braunColor + " банок коричневой краски");


        //Задача 6
        System.out.println("");
        System.out.println("Задача 6");
        short bananaTotal = 5;
        short banana1Weight = 80;

        short milkTotal = 2;
        short milk1Weight = 105;

        short icecreamTotal = 2;
        short icecream1Weight = 100;

        short eggTotal = 4;
        short egg1Weight = 70;

        int bananPerPortion = bananaTotal * banana1Weight;
        int milkPerPortion = milkTotal * milk1Weight;
        int icecreamPerPortion = icecreamTotal * icecream1Weight;
        int eggPerPortion = eggTotal * egg1Weight;

        float portion = bananPerPortion + milkPerPortion + icecreamPerPortion + eggPerPortion;
        float portionInKilo = portion / 1000;

        System.out.println("Вес спорт-завтрака в граммах: " + portion);
        System.out.println("Вес спорт-завтрака в килограммах: " + portionInKilo);


        //Задача 7
        System.out.println("");
        System.out.println("Задача 7");
        int totalLoseWeightInKilo = 7;
        int totalLoseWeightinGramm = totalLoseWeightInKilo * 1000;
        int totalDays250GrammLose = totalLoseWeightinGramm / 250;
        int totalDays500GrammLose = totalLoseWeightinGramm / 500;
        int averegeDays = (totalDays250GrammLose + totalDays500GrammLose) / 2;
        System.out.println(totalDays250GrammLose + " дней уйдет на похудение по 250 гр в день");
        System.out.println(totalDays500GrammLose + " дней уйдет на похудение по 500 гр в день");
        System.out.println(averegeDays + " дней уйдет на похудение в среднем");


        //Задача 8
        System.out.println("");
        System.out.println("Задача 8");

        //зарплата в месяц до повышения
        float salaryMasha = 67760f;
        float salaryDenis = 83690f;
        float salaryKristina = 76230f;

        //зарплата за год до повышения
        float salaryYearMasha = salaryMasha * 12;
        float salaryYearDenis = salaryDenis * 12;
        float salaryYearKristina = salaryKristina * 12;

        float multy = 1.1f; //коэффициент увеличения зарплаты на 10%

        //зарплата в месяц после повышения
        float newSalaryMasha = salaryMasha * multy;
        float newSalaryDenis = salaryDenis * multy;
        float newSalaryKristina = salaryKristina * multy;

        //зарплата за год после повышения
        float newSalaryYearMasha = newSalaryMasha * 12;
        float newSalaryYearDenis = newSalaryDenis * 12;
        float newSalaryYearKristina = newSalaryKristina * 12;

        //разница в зарплате за год
        float difMasha = newSalaryYearMasha - salaryYearMasha;
        float difDenis = newSalaryYearDenis - salaryYearDenis;
        float difKristina = newSalaryYearKristina - salaryYearKristina;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей (в месяц). Годовой доход вырос на " + difMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей (в месяц). Годовой доход вырос на " + difDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей (в месяц). Годовой доход вырос на " + difKristina + " рублей");

    }
}