package scripts;

import org.tribot.script.Script;
import org.tribot.script.ScriptManifest;

/**
 * @Description :
 * @Author : Zwww
 * @Time : 2016/11/9  22:57
 * @Version : V1.0.0
 */


@ScriptManifest(authors = "Zwww", name = "TestWoodCutting", category = "Test")
public class TestWoodCutting extends Script {


    //Inventory 我的程序 的是
    private int num = 0;
    private int lin = 1

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void run() {
        //region Description
        for (int i = 0; i <; i++) {

        }
        System.out.println("-----------Zwww.com----------- dddd = " + dddd + ", " + "当前类 = TestWoodCutting.run()");
        System.out.println("-----------Zwww.com-----------  = " + +", " + "当前类 = TestWoodCutting.run()");

        System.out.println("");
        //endregion

    }


    public int getLin() {
        return lin;
    }

    public void setLin(int lin) {
        this.lin = lin;
    }
}
