package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class CDPlayConfig {

    //@Bean
    public CompactDisc yeHUIMeiCD()
    {
        return new YeHuiMeiCD();
    }

    //@Bean
    public CompactDisc jayChousBedtimeStoriesCD()
    {
        return new JayChousBedtimeStoriesCD();
    }

    //@Bean
    public CompactDisc randomBeatlesCD()
    {
        int choice = (int) Math.floor(Math.random() * 3);

        if(choice == 0)
        {
            return new YeHuiMeiCD();
        }else if(choice == 1)
        {
            return new JayChousBedtimeStoriesCD();
        }else
        {
            return  new BaDuKongJianCD();
        }
    }


    //@Bean
    public CDPlayer cdPlayer()
    {
         return new CDPlayer(new YeHuiMeiCD());
    }

    //@Bean
    public CDPlayer cdPlayer(CompactDisc cd)
    {
        return new CDPlayer(cd);
    }

}
