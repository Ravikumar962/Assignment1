interface calculate{
    public int a(int a,int b);
}
public class Caculator {
    public static void main(String[] args) {

    calculate add=(int a,int b)->{return a+b;};
    calculate difference=(int a,int b)->{return a-b;};
    calculate product=(int a,int b)->{return a*b;};
    calculate division=(int a,int b)->{
        if(b!=0)
        return a/b;
        return 0;
    };
        System.out.println(add.a(6,3));


    }


}
