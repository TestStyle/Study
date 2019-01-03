/**
 * Created by love-pig on 19/1/1.
 *
 *
 */
public class JungleKnight extends Knight {


    public JungleKnight(Quest quest)
    {
        super(quest);
    }

    @Override
    public void emarkOnQuest()
    {
        quest.emark(this.getClass().getSimpleName());
    }
}
