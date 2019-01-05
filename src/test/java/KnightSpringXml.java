import Study.KnightInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * Created by love-pig on 19/1/1.
 */
public class KnightSpringXml {

    @Test
    public void testKnight()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("KnightInterface.xml");

        KnightInterface knight = context.getBean(KnightInterface.class);

        knight.embarkOnQuest();

        context.close();
    }
}
