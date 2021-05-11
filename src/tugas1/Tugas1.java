package tugas1;
/*@author Irsyad*/
public class Tugas1 {
    
    public static void main(String[] args) {
        
        System.out.println("Nama: Irsyad Purbha");
        System.out.println("NIM : 12345678");
        System.out.println("======================");
        Hero legion  = new Hero("Overwhelming Odds","Press The Attack",
            "Moment of Courage",625,260,64);
        System.out.println("Data Hero Legion COMMANDER: \n" +
                "Skill 1 --> " + legion.getSkill1()+ "\n" +
                "Skill 2 --> " + legion.getSkill2()+ "\n" +
                "Skill 3 --> " + legion.getSkill3()+ "\n" + 
                "HIT POINTS --> " + legion.getHp()+ "\n" + 
                "MANA --> " + legion.getMana()+ "\n" + 
                "DAMAGE --> " + legion.getDamage());
    }
    
}
