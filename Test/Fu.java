package Test;

public class Fu {
    public static void main(String[] args){
        //1、转义字符
        System.out.println("天天向上");
        System.out.println("天天\t向上");              // /t表示制表符  对齐
        System.out.println("===================");
        System.out.println("天天\n向上");              //  /n换行符
        System.out.println("===================");
        System.out.println("天天\\向上");              //   \\表示 输出一个\
        System.out.println("===================");
        System.out.println("天天\\\\向上");              //   \\\\表示 输出2个\
        System.out.println("===================");
        System.out.println("天天\'向上");              // \'表示 输出一个'
        System.out.println("===================");
        System.out.println("天天\"向上");              // \"表示 输出一个"
        System.out.println("===================");
        System.out.println("天天王一博\r向上lalala");              //  \r 表示回车
        System.out.println("-----------------------");
        System.out.println("天天王一博\r\n向上");
        System.out.println("-----------------------");
        System.out.println("天天王一博\n\r向上");

        System.out.println("-------------------------------------");
        System.out.println("剧名\t\t主演\t平台\t首日播放量\n余生请多指教\t肖战\t芒果TV\t1亿");
        System.out.println("-------------------------------------");
        
        /**2、注释
         * 文档注释
         * @auther 福橘
         * @version 317
         */

        /*
        多行注释
         */

        //单行注释

    }
}
