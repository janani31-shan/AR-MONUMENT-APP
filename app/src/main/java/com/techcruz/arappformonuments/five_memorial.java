package com.techcruz.arappformonuments;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class five_memorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_memorial);
        TextView content;
        TextView a,b,c,d;
        a= findViewById(R.id.tajmahal);
        b= findViewById(R.id.mysorepalace);
        c= findViewById(R.id.indiagate);
        d= findViewById(R.id.lotustemp);
        content= findViewById(R.id.content_text);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText("The Taj Mahal, an immense mausoleum of white marble, built in Agra between 1631 and 1648 by order of the Mughal Emperor Shah Jahan, is the jewel of Muslim art in India and one of the universally admired masterpieces of the world's heritage.The monument, begun in 1632, was finished in 1648; unverified but nonetheless, tenacious, legends attribute its construction to an international team of several thousands of masons, marble workers, mosaicists and decorators working under the orders of the architect of the emperor, Ustad Ahmad Lahori.The Taj Mahal was designated as a UNESCO World Heritage Site in 1983 for being \"the jewel of Muslim art in India and one of the universally admired masterpieces of the world's heritage\". It is regarded by many as the best example of Mughal architecture and a symbol of India's rich history.\n" +
                        "ताजमहल, सफेद संगमरमर का एक विशाल मकबरा, जिसे मुगल सम्राट शाहजहाँ के आदेश से 1631 और 1648 के बीच आगरा में बनाया गया था, भारत में मुस्लिम कला का गहना है और दुनिया की विरासत की सार्वभौमिक रूप से प्रशंसित कृतियों में से एक है। 1632 में शुरू हुआ स्मारक 1648 में समाप्त हो गया था; असत्यापित लेकिन फिर भी, दृढ़, किंवदंतियों ने सम्राट के वास्तुकार के आदेश के तहत काम करने वाले कई हजारों राजमिस्त्री, संगमरमर के श्रमिक, मोज़ेक और सज्जाकार की एक अंतरराष्ट्रीय टीम को इसके निर्माण का श्रेय दिया, उस्ताद अहमद लाहोरी। ताजमहल को 1983 में यूनेस्को की विश्व धरोहर स्थल के रूप में नामित किया गया था \"भारत में मुस्लिम कला का गहना और दुनिया की विरासत की सार्वभौमिक रूप से प्रशंसित कृतियों में से एक\". इसे कई लोग मुगल वास्तुकला का सबसे अच्छा उदाहरण और भारत के समृद्ध इतिहास का प्रतीक मानते हैं.\n");
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText("The Mysore Palace, also known as Amba Vilas Palace, is a historical palace and a royal residence (house). It is located in Mysore, Karnataka. It used to be the official residence of the Wadiyar dynasty and the seat of the Kingdom of Mysore. The palace is in the center of Mysore, and faces the Chamundi Hills eastward.The last palace, now known as the Old Palace or the Wooden Palace, burned to ashes during a wedding in 1896.The three-storied palace along with a 145 feet five-storied tower was built using fine grey granite while deep pink marble was used for the domes.  The task of revamping the palace was commissioned to a British architect named Henry Irwin, who designed and completed this palace in 1912, at a whopping cost of over 41 lakh Indian rupees. The grand palace stands tall in the heart of Mysore city and attracts visitors from across the world.\n" +
                        "मैसूर पैलेस, जिसे अम्बा विलास पैलेस के नाम से भी जाना जाता है, एक ऐतिहासिक महल और एक शाही निवास ( घर ) है. यह मैसूर, कर्नाटक में स्थित है. यह वाडियार राजवंश का आधिकारिक निवास और मैसूर साम्राज्य की सीट हुआ करती थी. महल मैसूर के केंद्र में है, और पूर्व में चामुंडी पहाड़ियों का सामना करता है। अंतिम महल, जिसे अब ओल्ड पैलेस या वुडन पैलेस के रूप में जाना जाता है, 1896 में एक शादी के दौरान राख में जल गया.145 फीट पांच मंजिला टॉवर के साथ तीन मंजिला महल ठीक ग्रे ग्रेनाइट का उपयोग करके बनाया गया था, जबकि गुंबदों के लिए गहरे गुलाबी संगमरमर का उपयोग किया गया था.  महल को फिर से बनाने का काम हेनरी इरविन नामक एक ब्रिटिश वास्तुकार को दिया गया था, जिन्होंने 1912 में इस महल को 41 लाख से अधिक भारतीय रुपये की लागत से डिजाइन और पूरा किया था. भव्य महल मैसूर शहर के केंद्र में लंबा है और दुनिया भर के आगंतुकों को आकर्षित करता है.\n");
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText("The India Gate (formerly known as the All India War Memorial) is a war memorial located astride the Rajpath, on the eastern edge of the \"ceremonial axis\" of New Delhi, formerly called Kingsway. It stands as a memorial to 84,000 soldiers of the British Indian Army who died in between 1914 and 1921 in the First World War, in France, Flanders, Mesopotamia, Persia, East Africa, Gallipoli and elsewhere in the Near and the Far East, and the Third Anglo-Afghan War. 13,300 servicemen's names, including some soldiers and officers from the United Kingdom, are inscribed on the gate.[2] Designed by Sir Edwin Lutyens, the gate evokes the architectural style of the memorial arch such as the Arch of Constantine, in Rome, and is often compared to the Arc de Triomphe in Paris, and the Gateway of India in Mumbai.\n" +
                        "इण्डिया गेट, (मूल रूप से अखिल भारतीय युद्ध स्मारक कहा जाता है), नई दिल्ली के राजपथ पर स्थित ४२ मीटर ऊँचा विशाल means है। यह स्वतन्त्र भारत का राष्ट्रीय स्मारक है, जिसे पूर्व में किंग्सवे कहा जाता था। इसका डिजाइन सर एडवर्ड लुटियन्स ने तैयार किया था। यह स्मारक पेरिस के आर्क डे ट्रॉयम्फ़ से प्रेरित है। इसे सन् १९३१ में बनाया गया था। मूल रूप से अखिल भारतीय युद्ध स्मारक के रूप में जाने वाले इस स्मारक का निर्माण अंग्रेज शासकों द्वारा उन ९०००० भारतीय सैनिकों की स्मृति में किया गया था जो ब्रिटिश सेना में भर्ती होकर प्रथम विश्वयुद्ध और अफ़ग़ान युद्धों में शहीद हुए थे। यूनाइटेड किंगडम के कुछ सैनिकों और अधिकारियों सहित 13,300 सैनिकों के नाम, गेट पर उत्कीर्ण हैं।[1][2] लाल और पीले बलुआ पत्थरों से बना हुआ यह स्मारक दर्शनीय है।");
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText("Lotus temple is popularly also known as The Baha’i House of Worship. It is designed to reflect the simplicity, clarity and freshness of the Baha'i Faith and to act as a symbol of the unity of mankind and religions. It was designed by Iranian architect Fariborz Sahba, The design of the temple has half opened lotus flower with 27 freestanding ‘petals’ made of marble. These 27 petals are composed of three ranks of nine petals.The nine arches with 27 petals support the central hall of the Temple. There are nine reflecting pools surrounding the building on the outside.The entire structure is made of white marble to show the purity, peace, and glory of the Bahai temple.The Bahai temple hall has a capacity of 2500 people and the total occupied area is 26 acres. Nearly four million people around the world visiting every year means 10000 people for a day. The constructed marbles were brought from Penteli Mountains in Greece. There are seven worshiping Bahai temples all over the world. They are in New Delhi, India. Kampala in Uganda, Frankfurt in Germany, Wilmette in the USA, Apia in Western Samoa, Panama City in Panama and Sydney in Australia.\n" +
                        "लोटस मंदिर को लोकप्रिय रूप से द बहाई हाउस ऑफ उपासना के रूप में भी जाना जाता है. यह बहाई आस्था की सादगी, स्पष्टता और ताजगी को प्रतिबिंबित करने और मानव जाति और धर्मों की एकता के प्रतीक के रूप में कार्य करने के लिए बनाया गया है. यह ईरानी वास्तुकार फारिबोर्ज़ साहबा द्वारा डिजाइन किया गया था, मंदिर के डिजाइन में संगमरमर से बने 27 फ्रीस्टैंडिंग ‘ पंखुड़ियों ’ के साथ आधा खुला कमल का फूल है. ये 27 पंखुड़ियाँ नौ पंखुड़ियों के तीन रैंकों से बनी होती हैं। 27 पंखुड़ियों वाले नौ मेहराब मंदिर के केंद्रीय हॉल का समर्थन करते हैं. बाहर की इमारत के आसपास नौ प्रतिबिंबित पूल हैं। पूरी संरचना पवित्रता, शांति दिखाने के लिए सफेद संगमरमर से बनी है, और बहाई मंदिर की महिमा। बहाई मंदिर हॉल में 2500 लोगों की क्षमता है और कुल कब्जे वाला क्षेत्र 26 एकड़ है. हर साल दुनिया भर में आने वाले लगभग चार मिलियन लोगों का मतलब है एक दिन के लिए 10000 लोग. निर्मित पत्थर ग्रीस में पेंटेली पर्वत से लाए गए थे. दुनिया भर में सात पूजा बहाई मंदिर हैं. वे नई दिल्ली, भारत में हैं. युगांडा में कंपाला, जर्मनी में फ्रैंकफर्ट, यूएसए में विल्मेट, पश्चिमी समोआ में एपिया, पनामा में पनामा सिटी और ऑस्ट्रेलिया में सिडनी.\n");
            }
        });











    }
}