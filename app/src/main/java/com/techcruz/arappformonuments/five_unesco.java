package com.techcruz.arappformonuments;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class five_unesco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_unesco);

        TextView content;
        TextView a,b,c,d,e;
        a= findViewById(R.id.tajmahal);
        b= findViewById(R.id.qutubminar);
        c= findViewById(R.id.elloracave);
        d= findViewById(R.id.brihadeswara);
        e= findViewById(R.id.jesus);
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
                content.setText("Qutub Minar or Qutb Minar, a 73 m (240 ft.) high tower made of red sandstone and marble is not only the highest brick minaret in the world but also one of the most famous historical landmarks of India. The construction of this tower of victory was started by the founder of the Mamluk Dynasty in Delhi, Qutb ud-Din Aibak and completed by his successor and son-in-law Iltutmish. Located in the heart of Delhi, India, this UNESCO World Heritage Site, visible from different parts of the city attracts thousands of visitors every day. some sources believe it was constructed as a tower of victory marking the beginning of Muslim dominion in India, some others say it served the muezzins who called the faithful to prayer from the minaret.\n" +
                        "कुतुब मीनार या कुतुब मीनार, 73 मीटर ( 240 फीट.) लाल बलुआ पत्थर और संगमरमर से बना उच्च टॉवर न केवल दुनिया में सबसे ऊंची ईंट मीनार है, बल्कि भारत के सबसे प्रसिद्ध ऐतिहासिक स्थलों में से एक है. जीत के इस टॉवर का निर्माण दिल्ली में ममलुक राजवंश के संस्थापक कुतुब उद-दीन ऐबक द्वारा शुरू किया गया था और उनके उत्तराधिकारी और दामाद इल्तुतमिश द्वारा पूरा किया गया था. दिल्ली, भारत के केंद्र में स्थित, यह यूनेस्को विश्व धरोहर स्थल, जो शहर के विभिन्न हिस्सों से दिखाई देता है, हर दिन हजारों आगंतुकों को आकर्षित करता है. कुछ स्रोतों का मानना है कि यह भारत में मुस्लिम प्रभुत्व की शुरुआत को चिह्नित करते हुए जीत के एक टॉवर के रूप में बनाया गया था, कुछ अन्य लोगों का कहना है कि इसने मुअज्जिन की सेवा की, जिन्होंने मीनार से प्रार्थना करने के लिए वफादार को बुलाया.\n");
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText("These 34 monasteries and temples, extending over more than 2 km, were dug side by side in the wall of a high basalt cliff, not far from Aurangabad, in Maharashtra. Ellora, with its uninterrupted sequence of monuments dating from A.D. 600 to 1000, brings the civilization of ancient India to life. Not only is the Ellora complex a unique artistic creation and a technological exploit but, with its sanctuaries devoted to Buddhism, Hinduism and Jainism, it illustrates the spirit of tolerance that was characteristic of ancient India.. There are 17 Hindu caves, 12 Buddhist and five Jain caves with deities, carvings and even monasteries depicting the mythology of each religion. These caves constructed near each other stand for harmony and solidarity among all faiths and beliefs.\n" +
                        ".एलोरा की गुफाएं\n" +
                        "महाराष्ट्र के औरंगाबाद से थोड़ी ही दूरी पर 2 किमी के क्षेत्र में फैले हुए, ये 34 मठ-मंदिर एक ऊंची बेसाल्ट चट्टान की दीवार को काटकर साथ-साथ ही बनाए गए हैं। 600 से लेकर 1000 ईस्\u200Dवी काल के दौरान एक के बाद एक बने स्मारकों से समृद्ध एलोरा, प्राचीन भारत की सभ्यता को जीवंत करता है। एलोरा परिसर, न केवल एक अद्वितीय कलात्मक रचना और तकनीकी कार्य है, अपितु यह बौद्ध, हिंदू और जैन धर्म को समर्पित अपने मठ-मंदिरों के साथ सहिष्णुता की उस भावना को भी पूरी तरह से दर्शाता है, जो प्राचीन भारत की विशेषता थी.\n");
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText("The Brihadeeswara temple is called Peruvudaiyar Koyil or Thanjavur Kovil. It was built under Raja Raja Chola, a Chola emperor ruling over ancient Tamil Nadu. It is a 1000 years old temple,at 216 feet at its highest point and carved completely of granite, it took 12 years to complete. It was finished in 1011 AD and is dedicated to Shiva.There’s no granite to be found anywhere nearby–not for at least 50 miles.The temple is formed of 130,000 tons of it, often huge giant pieces of it that would be impossible for any human to move. There is no binding material, only interlocking stone–something never found in tall buildings today.It took more than 1,000 elephants to haul large slabs of granite to Thanjavur from 50 miles away. To cut the rocks, workers used an ingenious method of ancient engineering.The Mahalingam—the stone on top of the tower—weighs 80 tons and measures 23 feet around and 9 feet high.Without cranes, a long ramp was made leading up to the tower, and elephants hauled the stone up to the top, assisted by men with ropes.  There are three gates but only two elaborate Gopurams. The first one is more like a fort gate that was built by the Marathas to defend the place. It was connected to the moat that surrounded the Temple. It is the 2nd gate – Keralantakan Tiruvasal and the 3rd gate – Rajarajan Tiruvasal.\n" +
                        " \n" +
                        "      ब्रिहाडेसवारा मंदिर को पेरूवुदयार कोयल या तंजावुर कोविल कहा जाता है. यह राजा राजा चोला के अधीन बनाया गया था, जो प्राचीन तमिलनाडु पर शासन करने वाला एक चोला सम्राट था. यह एक 1000 साल पुराना मंदिर है, इसके उच्चतम बिंदु पर 216 फीट और पूरी तरह से ग्रेनाइट की नक्काशी की गई है, इसे पूरा होने में 12 साल लग गए. यह 1011 ईस्वी में समाप्त हो गया था और शिव को समर्पित है। कहीं भी कोई ग्रेनाइट नहीं पाया जा सकता है – कम से कम 50 मील के लिए नहीं। मंदिर 130,000 टन से बना है, अक्सर इसके विशाल विशाल टुकड़े जो किसी भी मानव के लिए स्थानांतरित करना असंभव होगा. कोई बाध्यकारी सामग्री नहीं है, केवल इंटरलॉकिंग स्टोन – आज ऊंची इमारतों में कुछ भी नहीं मिला है। यह 50 मील दूर से तंजावुर के लिए ग्रेनाइट के बड़े स्लैब को ढोना करने के लिए 1,000 से अधिक हाथियों को ले गया. चट्टानों को काटने के लिए, श्रमिकों ने प्राचीन इंजीनियरिंग की एक सरल विधि का उपयोग किया। महलिंगम — टॉवर के शीर्ष पर स्थित पत्थर — 80 टन वजन और 23 फीट चारों ओर और 9 फीट ऊंचे क्रेन के साथ मापता है, एक लंबे रैंप को टॉवर तक ले जाया गया था, और हाथियों ने पत्थर को ऊपर तक फेंक दिया, रस्सियों के साथ पुरुषों द्वारा सहायता प्रदान की गई.  तीन द्वार हैं लेकिन केवल दो विस्तृत गोपुरम हैं. पहले एक किले के गेट की तरह है जो जगह की रक्षा के लिए मराठों द्वारा बनाया गया था. यह मंदिर को घेरने वाले खंदक से जुड़ा था. यह दूसरा गेट – केरलानटकन तिरुवासल और तीसरा गेट – राजराजन तिरुवासल है.\n");
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(" The Basilica of Bom Jesus is a monument typical of the classic forms of plane architecture, introduced by the Society of Jesus, otherwise known as the Jesuits. The façade, which is of granite, represents features of five styles of architecture: Roman, Ionic, Doric, Corinthian and Composite. It is a large single Nave structure built ( 1595-1605) and paid for with legacies left by Dom Jeronimo Mascarenhas, a wealthy Portuguese Captain of Cochin.The retable of the main altar exhibits a huge statue of Saint Ignatius of Loyola, the founder (along with St. Francis Xavier who was a founding member) of the Society of Jesus and below it, a small image of Bom Jesus (Child Jesus), the patron of the church.On the southern side of the transept lies the Chapel of St. Francis Xavier. This chapel has carved and gilded columns and wood-carved floral decorations. This is where the relics of the saint are kept.The Basilica also contains a modern art gallery with paintings depicting various Biblical scenes.  \n" +
                        "  बेसिलिका ऑफ बोम जीसस, सोसाइटी ऑफ जीसस द्वारा शुरू किए गए विमान वास्तुकला के क्लासिक रूपों का एक विशिष्ट स्मारक है, जिसे जेसुइट्स के रूप में जाना जाता है. अग्रभाग, जो ग्रेनाइट का है, वास्तुकला की पांच शैलियों की विशेषताओं का प्रतिनिधित्व करता है: रोमन, आयनिक, डोरिक, कोरिंथियन और समग्र. यह एक बड़ा एकल गुफा संरचना है जिसे ( 1595-1605 ) बनाया गया है और डोम जेरोनिमो मस्कारेन्हास द्वारा छोड़ी गई विरासत के लिए भुगतान किया गया है, कोचीन का एक धनी पुर्तगाली कैप्टन। मुख्य वेदी के पीछे हटने वाले सेंट इग्नाटियस की एक विशाल प्रतिमा का प्रदर्शन करते हैं, जो सेंट के साथ संस्थापक ( है. फ्रांसिस ज़ेवियर जो यीशु के समाज के संस्थापक सदस्य ) थे और इसके नीचे, बॉम जीसस की एक छोटी छवि ( चाइल्ड जीसस ), चर्च के संरक्षक। ट्रेन्सेप्ट के दक्षिणी किनारे पर चैपल ऑफ सेंट स्थित है. फ्रांसिस जेवियर. इस चैपल में नक्काशीदार और सोने के स्तंभ और लकड़ी से नक्काशीदार फूलों की सजावट है. यह वह जगह है जहां संत के अवशेष रखे जाते हैं। बेसिलिका में विभिन्न बाइबिल दृश्यों को चित्रित करने वाली पेंटिंग के साथ एक आधुनिक आर्ट गैलरी भी है.  \n");
            }
        });



    }
}