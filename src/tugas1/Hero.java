package tugas1;

/**
 * @author Irsyad
 */
public class Hero {

    private String skill1, skill2, skill3;
    private int hp, mana, damage;
 
    public Hero(String skill1,String skill2, String skill3,
            int hp, int mana, int damage) {
        this.skill1 = skill1; this.skill2 = skill2; this.skill3 = skill3;
        this.hp = hp; this.mana = mana; this.damage = damage;
    }

    public String getSkill1() { return skill1; }

    public String getSkill2() { return skill2; }

    public String getSkill3() { return skill3; }

    public int getHp() { return hp;}

    public int getMana() {
        return mana;
    }

    public int getDamage() {
        return damage;
    }
    
}
