package concurrent.msg;

/**
 * send msg demo
 */
public class SendMsgTask implements Runnable{

    private String mobile;

    public SendMsgTask(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "===已发送短信到" + mobile);
    }

}
