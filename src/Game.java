import javax.swing.text.Style;

public class Game {
    //attributes
    private Input input = new Input();
    private Menu menu = new Menu();
    private boolean active = true;
    private Map map = new Map();
    private Hero hero = new Hero();
//method
    void runGame(){
        while (active){
            menu.display();
            int menuSelect = input.readInt();
            if(menuSelect==1){
                System.out.println("Game Loading %");
                while (true){
                    renderGame();
                    char move = input.readChar();
                    if (move == 'w'){
                        boolean isWalkable = map.isWalkable(hero.getX(), hero.getY() - 1);
                        if(isWalkable == true) {
                            hero.heroUp();
                        }
                    }
                    else if (move == 'a'){
                        boolean isWalkable = map.isWalkable(hero.getX() - 1, hero.getY());
                        if(isWalkable == true) {
                            hero.heroLeft();
                        }
                    }
                    else if (move == 's'){
                        boolean isWalkable = map.isWalkable(hero.getX(), hero.getY() + 1);
                        if(isWalkable == true) {
                            hero.heroDown();
                        }
                    }
                    else if (move == 'd'){
                        boolean isWalkable = map.isWalkable(hero.getX() + 1, hero.getY());
                        if(isWalkable == true) {
                            hero.heroRight();
                        }
                    }

                }
            } else if(menuSelect==2){
                System.out.println("Brightness");
            } else if (menuSelect==3){
                System.out.println("hasta la vista...");
                active = false;
            } else {
                System.out.println( menuSelect+" is not an option idiot");
            }
        }
    }

    public void renderGame(){
        int[][] mapa = map.getMap();

        for (int y=0; y < mapa.length; y++){
            for (int x=0; x < mapa[0].length; x++){
                if (hero.getX() == x && hero.getY() == y) {
                    System.out.print(hero.getIcon());
                }
                else if(mapa[y][x] == 1) {
                    System.out.print("I ");
                }
                else if (mapa[y][x] == 0) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
