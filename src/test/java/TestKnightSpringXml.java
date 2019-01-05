import Study.CleanSoldierQuestInterface;
import Study.GangkQuestInterface;
import Study.JungleKnightInterface;
import Study.KnightInterface;
import Study.QuestInterface;
import Study.TopKnightInterface;
import org.testng.annotations.Test;

import java.io.PrintStream;

/**
 * Created by love-pig on 19/1/1.
 */
public class TestKnightSpringXml {

    @Test
    public void testKnight()
    {
        QuestInterface soldierQuest = new CleanSoldierQuestInterface();
        QuestInterface gangkQuest = new GangkQuestInterface();
        KnightInterface jungleKnight = new JungleKnightInterface(gangkQuest);
        KnightInterface topKnight = new TopKnightInterface(soldierQuest);

        jungleKnight.embarkOnQuest();
        topKnight.embarkOnQuest();
    }
}
