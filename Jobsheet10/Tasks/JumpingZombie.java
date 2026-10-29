package OOP.Jobsheet10.Tasks;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
        switch (level) {
            case 1: health += health * 30 / 100; break;
            case 2: health += health * 40 / 100; break;
            case 3: health += health * 50 / 100; break;
        }
    }

    public void destroyed() {
        health -= health * 10 / 100;
    }

    public String getZombieInfo() {
        return "Jumping Zombie Data =\n" + super.getZombieInfo();
    }
}