package app;

/**
 * 项目中的URL地址
 */
public class HtmlURL {
    /** 由于测试使用的后台IP可能会有变动，请以实际IP为准*/

        private static String IpName="172.16.40.100";



    /**
     * @All_NEWS_PAPER_URL
     * 用于显示全部报纸*/
    public static  String All_NEWS_PAPER_URL="http://"+IpName+":8080/PDFtransformationHTML/JSONpaperofficelist.action";

    /**
     * @SEARCH_NEWS_PAPER_URL
     * 用于查询数据库中的报纸
     * */
    public static String SEARCH_NEWS_PAPER_URL="http://"+IpName+":8080/PDFtransformationHTML/JsonPaperAction.action";
    /**
     * @NEWS_PAPER_TYPES
     * 用于查询报刊类型
     * **/
    public static String NEWS_PAPER_TYPES="http://"+IpName+":8080/PDFtransformationHTML/JSONpapertypelist.action";
}
