package Study;

/**
 * Created by love-pig on 19/1/1.
 *
 *
 */
public class JungleKnightInterface implements KnightInterface {

    private QuestInterface quest;

    public JungleKnightInterface(QuestInterface quest)
    {
        this.quest = quest;
    }

    public void embarkOnQuest()
    {
        quest.embark(this.getClass().getSimpleName());
    }
}
