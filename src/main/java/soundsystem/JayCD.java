package soundsystem;


import org.springframework.stereotype.Component;

@Component
public class JayCD implements CompactDisc {

    private String title = "叶惠美 专辑";
    private String artlist = "周杰伦&&方文山";

    public void play()
    {
        System.out.println("01菊花台\\n02夜曲");
    }

}
