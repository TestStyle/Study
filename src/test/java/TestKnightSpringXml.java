import org.testng.annotations.Test;

import java.io.PrintStream;

/**
 * Created by love-pig on 19/1/1.
 */
public class TestKnightSpringXml {

    @Test
    public void testKnight()
    {
        Quest soldierQuest = new CleanSoldierQuest();
        Quest gangkQuest = new GangkQuest();
        Knight jungleKnight = new JungleKnight(soldierQuest);
        Knight topKnight = new TopKnight(gangkQuest);

        jungleKnight.emarkOnQuest();
        topKnight.emarkOnQuest();
    }
}
