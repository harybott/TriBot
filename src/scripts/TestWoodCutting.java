package scripts;


import org.tribot.api.input.Keyboard;
import org.tribot.api.input.Mouse;
import org.tribot.script.Script;
import org.tribot.script.ScriptManifest;

/**
 * Created by Administrator on 2016/11/3.
 */

@ScriptManifest(authors = "Zwww", name = "TestWoodCutting", category = "Test")
public class TestWoodCutting extends Script {

    //Inventory 我的程序 的是
    private static final int num = 0;


    public static int getNum() {
        System.out.println("-----------Zwww.com-----------  = " + num + ", " + "当前类 = TestWoodCutting.getNum()");
        System.out.println("-----------Zwww.com----------- dir = " + num + ", " + "当前类 = TestWoodCutting.getNum()");
        System.out.println("-----------Zwww.com-----------  = " + num + ", " + "当前类 = TestWoodCutting.getNum()");

        Keyboard.getSpeed();
        Mouse.getSpeed();
        System.out.println("dir dir dir " + dir + num);


        return 0;
    }

    public void run() {

    }
}
