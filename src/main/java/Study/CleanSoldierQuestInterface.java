package Study;

/**
 * Created by love-pig on 19/1/1.
 *
 * 清理兵线
 */
public class CleanSoldierQuestInterface implements QuestInterface {

    public CleanSoldierQuestInterface()
    {

    }

    public void embark(String knightType)
    {
        System.out.println(knightType + "清理兵线！！");
    }
}
