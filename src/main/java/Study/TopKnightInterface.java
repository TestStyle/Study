package Study;

/**
 * Created by love-pig on 19/1/1.
 *
 * 上单
 */
public class TopKnightInterface implements KnightInterface {

    private QuestInterface quest;
    public TopKnightInterface(QuestInterface quest)
    {
        this.quest = quest;
    }

    public void embarkOnQuest()
    {

        quest.embark(this.getClass().getSimpleName());
    }
}
