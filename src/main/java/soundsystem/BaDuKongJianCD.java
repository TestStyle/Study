package soundsystem;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaDuKongJianCD implements CompactDisc {

    private String title = "八度空间 专辑";
    private String artlist = "周杰伦&&方文山";

    public void play()
    {
        String lineSeparator = System.getProperty("line.separator");
        System.out.println("播放八度空间专辑");
        System.out.println("01半兽人");
        System.out.println("02半岛铁盒");
        System.out.println("03暗号");
        System.out.println("04龙拳");
        System.out.println("05火车叨位去");
        System.out.println("06分裂（离开）");
        System.out.println("07爷爷泡的茶");
        System.out.println("08回到过去");
        System.out.println("09米兰的小铁匠");
        System.out.println("10最后的战役");
    }

}
