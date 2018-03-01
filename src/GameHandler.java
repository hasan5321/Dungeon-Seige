import java.awt.Graphics;
import java.util.LinkedList;
/**
 * Name - GameHandler
 * 
 * Description - This class updates all the game objects
 * and render all of the game objects.
 * Source - https://www.youtube.com/watch?v=0T1U0kbu1Sk&
 */
public class GameHandler {
  //object is used to store all the gameobjects
  LinkedList<GameObject> object = new LinkedList<GameObject>();
  
  /*
   * Name - tick()
   * Description - this will iterate to every object's tick
   * method, which is used to update the game.
   */
  public void tick() {
    for(int i = 0; i < object.size(); i++) {
      GameObject temp = object.get(i);
      temp.tick();
    }
  }
  
  /**
   * Name - render(Graphics g)
   * 
   * Description - This method will iterate to every
   * object's render() method.
   */
  public void render(Graphics g) {
    for(int i = 0; i < object.size(); i++) {
      GameObject temp = object.get(i);
      temp.render(g);
    }
  }
  
  public void addObject(GameObject a) {
    this.object.add(a);
  }
  public void removeObject(GameObject a) {
    this.object.remove(a);
  }
}
