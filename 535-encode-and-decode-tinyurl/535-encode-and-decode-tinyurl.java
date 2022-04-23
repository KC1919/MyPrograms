public class Codec {
int key = 0;
    HashMap<Integer, String> mp = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        key++;
        mp.put(key, longUrl);
        return key+"";
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return mp.get(Integer.parseInt(shortUrl));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));