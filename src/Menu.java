public class Menu {
    //attributes
    private String play = "play";
    private String settings = "settings";
    private String exit = "exit";

    //method

    /**
     * This methodsdasdadas
     */
    public void display(){
        System.out.println("///////////menu\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("1 "+play);
        System.out.println("2 "+settings);
        System.out.println("3 "+exit);
        System.out.println("Enter number to select");
    }
    //function
    public String display2(){
        String menu="=========== menu ===========";
        menu += "\n" + play;
        menu += "\n" + settings;
        menu += "\n" + exit;
        return menu;
    }

    // accessors
    public String getPlay() {
        return play;
    }
}
