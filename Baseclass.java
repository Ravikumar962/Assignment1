import java.util.Scanner;
public class Baseclass {
   public int height;
    public int width;
    public void display(){
        System.out.println("the height and width of the rectangle are "+this.height+" "+this.width);

    }
}
class Derivedclass extends Baseclass{

        Scanner sc=new Scanner(System.in);
        public void read_input(){
            height=sc.nextInt();
            width=sc.nextInt();
        }
        void display(int height,int width){
            System.out.println("area of rectangle is:"+height*width);
        }

    public static void main(String[] args) {
        Derivedclass d=new Derivedclass();
        d.read_input();
        d.display();
        d.display(d.height,d.width);
    }

}
