public class Source {
    public static void main(String[] args) {
        System.out.println("Maximum swords that can be wielded: " +SwordFighter.maxSwordsWielded);
        Knight knight = new Knight();
        Ninja ninja = new Ninja();
        knight.attack();
        ninja.attack();
        knight.escape();
        ninja.escape();
        knight.showWeapon();
        ninja.showWeapon();
    }
}
