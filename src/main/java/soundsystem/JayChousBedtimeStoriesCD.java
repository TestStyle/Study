package soundsystem;


import org.springframework.stereotype.Component;

@Component
public class JayChousBedtimeStoriesCD implements CompactDisc {

    private String title = "周杰伦的床边故事 专辑";
    private String artlist = "周杰伦";

    public void play()
    {
        String lineSeparator = System.getProperty("line.separator");
        System.out.println("播放周杰伦的床边故事专辑");
        System.out.println("01《床边故事》");
        System.out.println("02《说走就走》");
        System.out.println("03《一点点》");
        System.out.println("04《前世情人》");
        System.out.println("05《英雄》");
        System.out.println("06《不该》");
        System.out.println("07《土耳其冰淇淋》");
        System.out.println("08《告白气球》");
        System.out.println("09《Now You See Me》");
        System.out.println("10《爱情废柴》");
    }

}
