public class Map {
    //1=wall  'I'
    //0=floor ' '
    private int[][]map = {
            {1,1,1,1,1,1,1,1},
            {1,0,0,0,0,0,0,1},
            {1,1,1,1,0,0,0,1},
            {1,0,0,1,0,0,0,1},
            {1,0,1,0,0,0,0,1},
            {1,0,0,0,0,1,1,1},
            {1,0,1,0,0,1,0,1},
            {1,0,1,0,0,0,0,1},
            {1,1,1,1,1,1,1,1},
    };
    private int height = 9;
    private int width = 8;
    public int[][] getMap() {
        return map;
    }
    public boolean isWalkable(int x, int y){
        if (map[y][x] == 0) {
            return true;
        } else {
            return false;
        }
    }

}