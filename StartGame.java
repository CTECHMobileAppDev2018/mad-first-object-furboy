
public class StartGame {
  
  public static void main(String[] args) {
   
    Player player1 = new Player();
    player1.setName("Mr. Bartucz");
    Player player2 = new Player();
    player2.setName(".w.");
    player2.setHealth(69);
    
    System.out.println("Player1 name is: " + player1.getName());
    
    // this won't work until you create a getHealth method in your object. Uncomment it when you do.
    System.out.println(player1.getName() + "'s health is: " + player1.getHealth());
     System.out.println(player2.getName() + "'s health is: " + player2.getHealth());
    
    
    Weapon weapon = new Weapon();
    weapon.setWeapon(true);
    weapon.setWeapontype("Chainsaw");
    System.out.println("Weapon: " + weapon.getWeapon()+ "\nWeapon Type: "+ weapon.getWeapontype());
    
  }  
  
}