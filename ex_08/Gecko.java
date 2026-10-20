
public class Gecko {

    private String name;
    private int age;
    private int energy = 100;

    public Gecko() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Hello!");
    }

    public Gecko(String name) {
        this.name = name;
        this.age = 0;
        System.out.println("Hello " + this.name + "!");
    }

    public Gecko(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello " + this.name + "!");
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void status() {
        switch (this.age) {
            case 0:
                System.out.println("Unborn Gecko");
                break;
            case 1:
            case 2:
                System.out.println("Baby Gecko");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Adult Gecko");
                break;
            case 11:
            case 12:
            case 13:
                System.out.println("Old Gecko");
                break;
            default:
                System.out.println("Impossible Gecko");
                break;
        }
    }

    public void hello(String message) {
        System.out.println("Hello " + message + ", I'm " + this.name + "!");
    }

    public void hello(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("Hello, I'm " + this.name + "!");
        }
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy(int energy) {
        if (energy < 0) {
            this.energy = 0;
        } else if (energy > 100) {
            this.energy = 100;
        } else {
            this.energy = energy;
        }
    }

    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println("Yummy!");
            setEnergy(this.energy + 10);
        } else if (food.equalsIgnoreCase("Vegetable")) {
            System.out.println("Erk!");
            setEnergy(this.energy - 10);
        } else {
            System.out.println("I can't eat this!");
        }
    }

    public void work() {
        if (this.energy >= 25) {
            System.out.println("I'm working T.T");
            setEnergy(this.energy - 9);
        } else {
            System.out.println("Heyyy I'm too sleepy, better take a nap!");
            setEnergy(this.energy + 50);
        }
    }

    public void fraternize(Object friend) {
        if (friend instanceof Gecko) {
            Gecko other = (Gecko) friend;

            if (this.energy < 30 && other.energy < 30) {
                System.out.println("Not today!");
                other.fraternizeWithTiredFriend();
            } else if (this.energy < 30) {
                System.out.println("Sorry " + other.name
                        + ", I'm too tired to go out tonight.");
                System.out.println("Oh! That's too bad, another time then!");
            } else if (other.energy < 30) {
                System.out.println("Sorry " + this.name
                        + ", I'm too tired to go out tonight.");
                System.out.println("Oh! That's too bad, another time then!");
            } else {
                System.out.println("I'm going to drink with "
                        + other.name + "!");
                System.out.println("I'm going to drink with "
                        + this.name + "!");
                setEnergy(this.energy - 30);
                other.setEnergy(other.energy - 30);
            }
        } else if (friend instanceof Snake) {
            if (this.energy >= 10) {
                System.out.println("LET'S RUN AWAY!!!");
                setEnergy(0);
            } else {
                System.out.println("...");
            }
        }
    }

    private void fraternizeWithTiredFriend() {
        System.out.println("Not today!");
    }
}
