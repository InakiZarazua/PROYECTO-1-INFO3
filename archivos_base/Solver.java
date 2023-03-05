import java.util.List;
import java.util.ArrayList;
/*
    Esta es su clase principal. El unico metodo que debe implementar es
    public String[] solve(Maze maze)
    pero es libre de crear otros metodos y clases en este u otro archivo que desee.
*/
public class Solver{

    public Solver(){
        //Sientase libre de implementar el contructor de la forma que usted lo desee
        
    }
    public void moverse(Maze maze, List<String> soluciones, String way){
       // if (maze.isExitSpace(int xIndex, int yIndex, int zIndex) == true){
           // soluciones.add("["+ way +"]");
          return;
        
    }
/*
    int MNorte = maze.moveNorth;
    int MSur = maze.moveSouth;
    int MOeste = maze.moveWest;
    int MEste = maze.moveSouth;
    int MArriba = maze.moveUp;
    int MAbajo = moveDown;
 */   

    public String Norte(){
        
        String North = "N";
        return North;
    }
     public String Sur(){
        
        String South = "S";
        return South;
    }
     public String Oeste(){
        
        String West = "O";
        return West;
    }
     public String Este(){
        
        String East = "E";
        return East;
    }
     public String Arriba(){
        
        String Up = "U";
        return Up;
    }
     public String Abajo(){
        
        String Down = "D";
        return Down;
    }
    


    public String solve(Maze maze){
        //Implemente su metodo aqui. Sientase libre de implementar métodos adicionales
        List<String> soluciones = new ArrayList<>();
        //String[] Arraysoluciones = soluciones.stream().toArray

        
        return Norte();
    }

}