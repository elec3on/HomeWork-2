public class Main {
    public static void main(String[] args) {
        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача № 1");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println("------------------------");
        // Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Задача № 2");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println("------------------------");
        // Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Задача № 3");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println("------------------------");
        // Задача 4
        var friend = 19;
        System.out.println("Задача № 4");
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);
        System.out.println("------------------------");
        // Задача 5
        var frog = 3.5;
        System.out.println("Задача № 5");
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);
        System.out.println("------------------------");
        // Задача 6
        var fighterWeight1 = 78.2;
        var fighterWeight2 = 82.7;
        var totalFightersWeight = fighterWeight1 + fighterWeight2;
        System.out.println("Задача № 6");
        System.out.println("Общий вес бойцов составляет " + totalFightersWeight + " кг");
        System.out.println("------------------------");
        // Задача 7
        System.out.println("Задача № 7");
        var diffFightersWeight = fighterWeight2 % fighterWeight1;
        System.out.println("Разница в весе бойцов составляет " + diffFightersWeight + " кг");
        System.out.println("------------------------");
        // Задача 8
        System.out.println("Задача № 8");
        var allWorkersTime = 640;
        var oneWorkerTime = 8;
        var allWorkers = allWorkersTime / oneWorkerTime;
        System.out.println("Всего работников в компании - " + allWorkers + " человек");
        allWorkers = allWorkers + 94;
        allWorkersTime = allWorkers * oneWorkerTime;
        System.out.println("Если в компании работает " + allWorkers + " человек, то всего " +allWorkersTime+ " часов работы может быть поделено между сотрудниками");
    }
}