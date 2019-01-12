package soundsystem;


import org.springframework.stereotype.Component;

@Component
public class YeHuiMeiCD implements CompactDisc {

    private String title = "叶惠美 专辑";
    private String artlist = "周杰伦&&方文山";

    public void play()
    {
        String lineSeparator = System.getProperty("line.separator");
        System.out.println("播放叶惠美专辑");
        System.out.println("01以父之名");
        System.out.println("02懦夫");
        System.out.println("03晴天");
        System.out.println("04三年二班");
        System.out.println("05东风破");
        System.out.println("06你听得到");
        System.out.println("07同一种调调");
        System.out.println("08她的睫毛");
        System.out.println("09爱情悬崖");
        System.out.println("10梯田");
        System.out.println("11双刀");
    }

}
