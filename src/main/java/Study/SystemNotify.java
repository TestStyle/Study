package Study;

import java.io.PrintStream;

public class SystemNotify {
    private PrintStream stream;

    public SystemNotify(PrintStream stream)
    {
        this.stream = stream;
    }

    public void notifyBeforeQuest()
    {
        stream.println("开始任务！！！");
    }

    public void notifyAfterQuest()
    {
        stream.println("任务结束！！！");
    }
}
