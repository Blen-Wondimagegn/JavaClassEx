package JavaClassPA;

public class Pizza {
    private String size;
    private int cheese;
    private int pepperoni;
    private int ham;

    public Pizza(String size, int cheese, int pepperoni, int ham) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.ham = ham;
    }



    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public int getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(int pepperoni) {
        this.pepperoni = pepperoni;
    }

    public int getHam() {
        return ham;
    }

    public void setHam(int ham) {
        this.ham = ham;
    }

    public double calcCost(){

        int baseCost = 0;

        switch (size.toLowerCase()) {
            case "small":
                baseCost = 10;
                break;
            case "medium":
                baseCost = 12;
                break;
            case "large":
                baseCost = 14;
                break;
            default:
                throw new IllegalArgumentException("Invalid pizza size");
        }

        int totalToppings = cheese + pepperoni + ham;
        return baseCost + (2 * totalToppings);
    }
    public String getDescription() {
        return "Size: " + size + ", Cheese Toppings: " + cheese + ", Pepperoni Toppings: " + pepperoni + ", Ham Toppings: " + ham;
    }

}
