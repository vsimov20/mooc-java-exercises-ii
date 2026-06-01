
public class Container {

    private int amount;
    private int maxAmount;

    public Container() {
        this.amount = 0;
        this.maxAmount = 100;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (this.amount + amount > maxAmount) {
            this.amount = this.maxAmount;
        } else if (amount >= 0) {
            this.amount += amount;
        }

    }

    public void remove(int amount) {
        if (this.amount < amount) {
            this.amount = 0;
        } else if (amount >= 0) {
            this.amount -= amount;
        }
    }
    
    public String toString(){
        return this.amount + "/" + this.maxAmount;
    }
}
