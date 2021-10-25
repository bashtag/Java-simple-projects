public class Player2 extends Player1{
    private int health;
    private boolean armor;

    public Player2(String name, String weapon, int health, boolean armor) {
        super(name, weapon, health);
        if (health < 0 || health > 100) {
            this.health = 100;
        }else this.health = health;
        this.armor = armor;
    }

    @Override
    public void damageByGun1() {
        if (armor) {
            this.health -= 20;
            if (this.health <= 0) this.health = 0;
            System.out.println("Armor is on. Got hit by gun 1. Health is reduced by 20." +
                    "New health is " + this.health);
        } if (!armor) {
            this.health -= 30;
            if (this.health <= 0) this.health = 0;
            System.out.println("Armor is off. Got hit by gun 1. Health is reduced by 30." +
                    "New health is " + this.health);
        }

        if (this.health == 0) {
            System.out.println(getName() + " is dead.");
        }
    }

    @Override
    public void damageByGun2() {
        if (armor) {
            this.health -= 40;
            if (this.health <= 0) this.health = 0;
            System.out.println("Armor is on. Got hit by gun 2. Health is reduced by 40." +
                    "New health is " + this.health);
        } if (!armor) {
            this.health -= 50;
            if (this.health <= 0) this.health = 0;
            System.out.println("Armor is off. Got hit by gun 2. Health is reduced by 50." +
                    "New health is " + this.health);
        }

        if (this.health == 0) {
            System.out.println(getName() + " is dead.");
        }
    }

    @Override
    public void heal() {
        super.heal();
    }
}
