// Last updated: 1/4/2026, 11:34:11 am
1import java.util.*;
2
3public class Codec {
4
5    Map<String, String> map = new HashMap<>();
6    String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
7    Random rand = new Random();
8    public String getKey() {
9        StringBuilder sb = new StringBuilder();
10
11        for (int i = 0; i < 6; i++) {
12            sb.append(chars.charAt(rand.nextInt(chars.length())));
13        }
14        return sb.toString();
15    }
16    public String encode(String longUrl) {
17        String key = getKey();
18        while (map.containsKey(key)) {
19            key = getKey();
20        }
21        map.put(key, longUrl);
22        return "http://tinyurl.com/" + key;
23    }
24
25    public String decode(String shortUrl) {
26        String key = shortUrl.substring(shortUrl.lastIndexOf("/") + 1);
27        return map.get(key);
28    }
29}
30
31// Your Codec object will be instantiated and called as such:
32// Codec codec = new Codec();
33// codec.decode(codec.encode(url));