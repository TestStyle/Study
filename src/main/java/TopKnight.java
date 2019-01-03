/**
 * Created by love-pig on 19/1/1.
 *
 * 上单
 */
public class TopKnight extends Knight {

    public TopKnight(Quest quest)
    {
        super(quest);
    }

    @Override
    public void emarkOnQuest()
    {

        quest.emark(this.getClass().getSimpleName());
    }
}
