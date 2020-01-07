package izgledaplikacije;

public class Global{
    private static int index = 0;

    public static int getVar(){
        return Global.index;
    }

    public static void setVar(int var){
        Global.index = var;
    }
}