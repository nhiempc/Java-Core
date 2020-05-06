package getdata;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class getNguPhapTiengAnh {
    public static void main(String[] args) throws IOException {
        List<String> url_page = new ArrayList<>();
        List<String> url_detail_page = new ArrayList<>();
        for (int i=1;i<9;i++){
            String url = "https://dayhoctienganh.net/ngu-phap-tieng-anh-nang-cao?_page="+i;
            url_page.add(url);
        }
        Object[] array_url_page = url_page.toArray();
        for (int i =0 ;i<url_page.size();i++){
            Document doc = Jsoup.connect(array_url_page[i].toString()).get();
            Elements element = doc.select("div[class=panel-body]>a");
            for (Element headline : element) {
                url_detail_page.add(headline.absUrl("href"));
            }
        }
        Object[] array_url_detail_page = url_detail_page.toArray();
        for (int i=0;i<array_url_detail_page.length;i++){
            Document doc = Jsoup.connect(array_url_detail_page[i].toString()).get();
            Elements post_content = doc.select("div[class=post-content]");
            Elements post_title = doc.select("header[class=post-header]");
            System.out.println("Tiêu đề: "+post_title.text());
            System.out.println("Nội dung:");
            System.out.println(post_content.text());
        }
    }
}
