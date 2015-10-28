/**
 * Created by wei on 10/27/15.
 */
public class waspecQ1 {

    public static void main(String[] cyrus)
    {
        //三个人分别剩余100个炮
        int daiDai=100,longFei=100,xiaoXue=100;

        //听到声音次数
        int count=0;

        //开始
        daiDai--;
        longFei--;
        xiaoXue--;
        count++;


        for(int i=1;;i++)
        {
            //标记
            boolean flag=false;

            //判断呆呆是否该放炮
            if(daiDai>0){
                flag=true;
                daiDai--;
            }
            //判断龙飞是否该放炮
            if(i%2==0&&longFei>0){
                flag=true;
                longFei--;
            }
            //判断小雪是否该放炮
            if(i%3==0&&xiaoXue>0){
                flag=true;
                xiaoXue--;
            }
            //判断是否听到了声音
            if(flag)
            {
                count++;
            }
            //是否都已经放完了
            if(daiDai==0&&longFei==0&&xiaoXue==0)
            {
                break;
            }
        }

        System.out.println("一共听到"+count+"声");
    }
}
