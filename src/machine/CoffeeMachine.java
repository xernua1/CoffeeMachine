package machine;

import java.util.Scanner;

public class CoffeeMachine {
    //Stage 1
    /*public void newCoffee() {
        System.out.println("Starting to make a coffee");
    }

    public void grindingBeans() {
        System.out.println("Grinding coffee beans");
    }

    public void boilingWater() {
        System.out.println("Boiling water");
    }

    public void mixing() {
        System.out.println("Mixing boiled water with crushed coffee beans");
    }

    public void pouringCoffee() {
        System.out.println("Pouring coffee into the cup");
    }

    public void pouringMilk() {
        System.out.println("Pouring some milk into the cup");
    }

    public void readyCoffee() {
        System.out.println("Coffee is ready!");
    }

    public void makeCoffee() {
        newCoffee();
        grindingBeans();
        boilingWater();
        mixing();
        pouringCoffee();
        pouringMilk();
        readyCoffee();
    }

    //Stage 2
    public void calculateIngredients() {
        int cups = howManyCups();
        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println(calculateWater(cups) + " ml of water");
        System.out.println(calculateMilk(cups) + " ml of milk");
        System.out.println(calculateBeans(cups) + " g of coffee beans");

    }

    private int calculateWater(int cups) {
        return cups * 200;
    }

    private int calculateMilk(int cups) {
        return cups * 50;
    }

    private int calculateBeans(int cups) {
        return cups * 15;
    }

    private int howManyCups() {
        System.out.println("Write how many cups of coffee you will need:");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }*/

    //Stage 3
    private int water;
    private int milk;
    private int coffeeBeans;

    CoffeeMachine(int w, int m, int c) {
        this.water = w;
        this.milk = m;
        this.coffeeBeans = c;
    }

    CoffeeMachine() {
        this.water = 0;
        this.milk = 0;
        this.coffeeBeans = 0;
        this.money = 0;
        this.dispCups = 0;
    }

    /*public void initialiseCoffeeMachine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        this.water = sc.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        this.milk = sc.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        this.coffeeBeans = sc.nextInt();
    }

    public void makeCoffeeStage3() {
        initialiseCoffeeMachine();
        calculateIngredientsStage3(howManyCups());
    }

    public void calculateIngredientsStage3(int cups) {
        int[] howMany = {this.water / 200, this.milk / 50, this.coffeeBeans / 15};
        int canBeMade = Arrays.stream(howMany).min().getAsInt();
        if (calculateWater(cups) <= this.water && calculateBeans(cups) <= this.coffeeBeans && calculateMilk(cups) <= this.milk) {
            if (canBeMade > cups) {
                System.out.println("Yes, I can make that amount of coffee (and even " + (canBeMade - cups) + " more than that)");
            } else System.out.println("Yes, I can make that amount of coffee");
        } else {
            System.out.println("No, I can make only " + canBeMade + " cup(s) of coffee");
        }
    }*/

    //Stage 4
    private int money;
    private int dispCups;

    private void machineInfo() {
        System.out.println("The coffee machine has: \n" + this.water + " ml of water\n" + this.milk +
                " ml of milk\n" + this.coffeeBeans + " g of coffee beans\n" + this.dispCups + " disposable cups\n" +
                "$" + this.money + " of money");
    }

    private void addMoney(int m) {
        this.money += m;
    }

    private void takeMoney() {
        this.money = 0;
    }

    private void buy() {
        String type;
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        Scanner sc = new Scanner(System.in);
        type = sc.next();
        switch (type) {
            case "1":
                if (this.water >= coffees[0].water && this.coffeeBeans >= coffees[0].beans) {
                    System.out.println("I have enough resources, making you a coffee!");
                    this.water -= coffees[0].water;
                    this.coffeeBeans -= coffees[0].beans;
                    this.dispCups--;
                    coffeeCounter();
                    addMoney(coffees[0].cost);
                } else {
                    if (this.water < coffees[0].water) {
                        System.out.println("Sorry, not enough water!");
                    }
                    if (this.coffeeBeans < coffees[0].beans) {
                        System.out.println("Sorry, not enough coffee beans!");
                    }
                }
                break;
            case "2":
                if (this.water >= coffees[1].water && this.milk >= coffees[1].milk && this.coffeeBeans >= coffees[1].beans) {
                    System.out.println("I have enough resources, making you a coffee!");
                    this.water -= coffees[1].water;
                    this.milk -= coffees[1].milk;
                    this.coffeeBeans -= coffees[1].beans;
                    this.dispCups--;
                    coffeeCounter();
                    addMoney(coffees[1].cost);
                } else {
                    if (this.water < coffees[1].water) {
                        System.out.println("Sorry, not enough water!");
                    }
                    if (this.milk < coffees[1].milk) {
                        System.out.println("Sorry, not enough milk!");
                    }
                    if (this.coffeeBeans < coffees[1].beans) {
                        System.out.println("Sorry, not enough coffee beans!");
                    }
                }
                break;
            case "3":
                if (this.water >= coffees[2].water && this.milk >= coffees[2].milk && this.coffeeBeans >= coffees[2].beans)
                {
                    System.out.println("I have enough resources, making you a coffee!");
                    this.water -= coffees[2].water;
                    this.milk -= coffees[2].milk;
                    this.coffeeBeans -= coffees[2].beans;
                    this.dispCups--;
                    coffeeCounter();
                    addMoney(coffees[2].cost);
                }
                else
                {
                    if (this.water < coffees[2].water) {
                        System.out.println("Sorry, not enough water!");
                    }
                    if (this.milk < coffees[2].milk) {
                        System.out.println("Sorry, not enough milk!");
                    }
                    if (this.coffeeBeans < coffees[2].beans) {
                        System.out.println("Sorry, not enough coffee beans!");
                    }
                }
                break;
            case "back":
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    private void fill() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        this.water += sc.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        this.milk += sc.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        this.coffeeBeans += sc.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        this.dispCups += sc.nextInt();
    }

    private void take() {
        System.out.println("I gave you $" + this.money);
        takeMoney();
    }

    /*private void queryAction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take):");
        String action = sc.next();
        switch (action) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
        }
    }

    public void runStage4() {
        machineInfo();
        queryAction();
        machineInfo();
    }*/

    CoffeeMachine(int w, int m, int b, int c, int cash) {
        this.water = w;
        this.milk = m;
        this.coffeeBeans = b;
        this.dispCups = c;
        this.money = cash;
    }

    //Stage 5
    private int actionQuery() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, clean, remaining, exit):");
        String action = sc.next();
        switch (action) {
            case "buy":
                if (madeSinceCleaning == 10)
                {
                    System.out.println("I need cleaning!");
                    break;
                }
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "clean":
                cleanMachine();
                break;
            case "remaining":
                machineInfo();
                break;
            case "exit":
                return 1;
        }
        return 0;
    }

    public void actionLoop() {
        int exit = 0;
        while (exit == 0) {
            exit = actionQuery();
        }
    }
    //Stage 6
    public class Coffee
    {
        int water;
        int milk;
        int beans;
        int cost;

        Coffee(int w, int m, int b, int c)
        {
            this.water=w;
            this.milk = m;
            this.beans = b;
            this.cost = c;
        }
    }
    Coffee[] coffees = {new Coffee(250, 0, 16, 4),new Coffee(350, 75, 20, 7), new Coffee(200, 100, 12, 6)};
    static int madeSinceCleaning = 0;
    // need var for coffees made since cleaning
    // to use coffees array for coffee selection and maths
    // need cleaning function
    private void cleanMachine()
    {
        madeSinceCleaning = 0;
        System.out.println("I have been cleaned!");
    }
    private void coffeeCounter()
    {
        madeSinceCleaning++;
    }

    public static void main(String[] args) {
        CoffeeMachine cm = new CoffeeMachine(400, 540, 120, 9, 550);
        //cm.makeCoffee();
        //cm.calculateIngredients();
        //cm.makeCoffeeStage3();
        cm.actionLoop();
    }
}