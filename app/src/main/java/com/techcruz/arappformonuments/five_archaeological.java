package com.techcruz.arappformonuments;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class five_archaeological extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_archaeological);


        TextView content;
        TextView a,b,c,d,e,g;
        a= findViewById(R.id.brihadeshwara);
        b= findViewById(R.id.greatstupa);
        c= findViewById(R.id.elloracave);
        d= findViewById(R.id.tajmahal);
        e= findViewById(R.id.jesus);
        g= findViewById(R.id.charminar);
        content= findViewById(R.id.content_text);
        Button btn= findViewById(R.id.btnarc);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.brihadeshwaratemple_eng);
        final MediaPlayer mediaPlayer2=MediaPlayer.create(this,R.raw.bhiradeshwara_hindi);
        final MediaPlayer stupa=MediaPlayer.create(this,R.raw.thegreatstupa_eng);
        final MediaPlayer ellora= MediaPlayer.create(this,R.raw.ellora_eng);
        final MediaPlayer tajmahal=MediaPlayer.create(this,R.raw.tajmahal_eng);
        final MediaPlayer charminar=MediaPlayer.create(this,R.raw.charminar_eng);
        final MediaPlayer jesus=MediaPlayer.create(this,R.raw.basilicaofbom_eng);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText("The Brihadeeswara temple is called Peruvudaiyar Koyil or Thanjavur Kovil. It was built under Raja Raja Chola, a Chola emperor ruling over ancient Tamil Nadu. It is a 1000 years old temple,at 216 feet at its highest point and carved completely of granite, it took 12 years to complete. It was finished in 1011 AD and is dedicated to Shiva.There’s no granite to be found anywhere nearby–not for at least 50 miles.The temple is formed of 130,000 tons of it, often huge giant pieces of it that would be impossible for any human to move. There is no binding material, only interlocking stone–something never found in tall buildings today.It took more than 1,000 elephants to haul large slabs of granite to Thanjavur from 50 miles away. To cut the rocks, workers used an ingenious method of ancient engineering.The Mahalingam—the stone on top of the tower—weighs 80 tons and measures 23 feet around and 9 feet high.Without cranes, a long ramp was made leading up to the tower, and elephants hauled the stone up to the top, assisted by men with ropes.  There are three gates but only two elaborate Gopurams. The first one is more like a fort gate that was built by the Marathas to defend the place. It was connected to the moat that surrounded the Temple. It is the 2nd gate – Keralantakan Tiruvasal and the 3rd gate – Rajarajan Tiruvasal.\n\n\n\n\n \t\tहाडेसवारा मंदिर को पेरूवुदयार कोयल या तंजावुर कोविल कहा जाता है. यह राजा राजा चोला के अधीन बनाया गया था, जो प्राचीन तमिलनाडु पर शासन करने वाला एक चोला सम्राट था. यह एक 1000 साल पुराना मंदिर है, इसके उच्चतम बिंदु पर 216 फीट और पूरी तरह से ग्रेनाइट की नक्काशी की गई है, इसे पूरा होने में 12 साल लग गए. यह 1011 ईस्वी में समाप्त हो गया था और शिव को समर्पित है। कहीं भी कोई ग्रेनाइट नहीं पाया जा सकता है – कम से कम 50 मील के लिए नहीं। मंदिर 130,000 टन से बना है, अक्सर इसके विशाल विशाल टुकड़े जो किसी भी मानव के लिए स्थानांतरित करना असंभव होगा. कोई बाध्यकारी सामग्री नहीं है, केवल इंटरलॉकिंग स्टोन – आज ऊंची इमारतों में कुछ भी नहीं मिला है। यह 50 मील दूर से तंजावुर के लिए ग्रेनाइट के बड़े स्लैब को ढोना करने के लिए 1,000 से अधिक हाथियों को ले गया. चट्टानों को काटने के लिए, श्रमिकों ने प्राचीन इंजीनियरिंग की एक सरल विधि का उपयोग किया। महलिंगम — टॉवर के शीर्ष पर स्थित पत्थर — 80 टन वजन और 23 फीट चारों ओर और 9 फीट ऊंचे क्रेन के साथ मापता है, एक लंबे रैंप को टॉवर तक ले जाया गया था, और हाथियों ने पत्थर को ऊपर तक फेंक दिया, रस्सियों के साथ पुरुषों द्वारा सहायता प्रदान की गई.  तीन द्वार हैं लेकिन केवल दो विस्तृत गोपुरम हैं. पहले एक किले के गेट की तरह है जो जगह की रक्षा के लिए मराठों द्वारा बनाया गया था. यह मंदिर को घेरने वाले खंदक से जुड़ा था. यह दूसरा गेट – केरलानटकन तिरुवासल और तीसरा गेट – राजराजन तिरुवासल है.\n\n\n\n\n");
                mediaPlayer1.start();
                content.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mediaPlayer1.isLooping()) return;
                        stupa.stop();
                        jesus.stop();
                        charminar.stop();
                        tajmahal.stop();
                        ellora.stop();
                        mediaPlayer1.start();

                    }

                });
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText("The Great Stupa at Sanchi is one of the most important Buddhist monuments reflecting gem of Buddhist art and architecture.Sanchi was anciently known as Cetiyagiri and associated with Mahadeva. Located at Sanchi Town, Madhya Pradesh, India, this Stupa is the oldest stone structure in India that was built during the Mauryan period. Originally commissioned in the third century BCE by Emperor Ashok this huge hemispherical dome with a height of 12.2816.46 m (54.0 ft) consists of a central chamber where the relics of Lord Buddha are placed. Four ornamental gateways facing four directions and a balustrade surrounding the Stupa were later added in the first century BCE.The Great Stupa and other Buddhist monuments at Sanchi were discovered in 1818 as a result of excavations.The main body of the stupa symbolizes the cosmic mountain. It is topped by a ‘harmika’ to hold the triple umbrella, or ‘chhatraveli’, which represents the three jewels of Buddhism – the Buddha, the Dharma, and the Sangha.\n" +
                        "       सांची में द ग्रेट स्तूप बौद्ध कला और वास्तुकला के मणि को दर्शाने वाले सबसे महत्वपूर्ण बौद्ध स्मारकों में से एक है। सांची को प्राचीन रूप से सेतियागिरी के रूप में जाना जाता था और महादेव से जुड़ा था. भारत के मध्य प्रदेश के सांची टाउन में स्थित, यह स्तूप भारत की सबसे पुरानी पत्थर की संरचना है जिसे मौर्य काल के दौरान बनाया गया था. मूल रूप से सम्राट अशोक द्वारा तीसरी शताब्दी ईसा पूर्व में कमीशन किया गया था, 12.2816.46 मीटर ( 54.0 फीट ) की ऊंचाई के साथ इस विशाल गोलार्द्ध गुंबद में एक केंद्रीय कक्ष शामिल है जहां भगवान बुद्ध के अवशेष हैं रखा. चार दिशाओं का सामना करने वाले चार सजावटी द्वार और स्तूप के आसपास एक बालस्ट्रेड को बाद में पहली शताब्दी ईसा पूर्व में जोड़ा गया था। सांची में महान स्तूप और अन्य बौद्ध स्मारकों को 1818 में खोजा गया था उत्खनन का। स्तूप का मुख्य शरीर ब्रह्मांडीय पर्वत का प्रतीक है. यह ट्रिपल छाता, या ‘ छत्रवेली ’ को धारण करने के लिए ‘ धर्मिका ’ द्वारा सबसे ऊपर है, जो बौद्ध धर्म के तीन रत्नों का प्रतिनिधित्व करता है – बुद्ध, धर्म और संघ.\n\n\n\n\n");

                if (stupa.isLooping()) return;
                mediaPlayer1.stop();
                stupa.start();

            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText("These 34 monasteries and temples, extending over more than 2 km, were dug side by side in the wall of a high basalt cliff, not far from Aurangabad, in Maharashtra. Ellora, with its uninterrupted sequence of monuments dating from A.D. 600 to 1000, brings the civilization of ancient India to life. Not only is the Ellora complex a unique artistic creation and a technological exploit but, with its sanctuaries devoted to Buddhism, Hinduism and Jainism, it illustrates the spirit of tolerance that was characteristic of ancient India.. There are 17 Hindu caves, 12 Buddhist and five Jain caves with deities, carvings and even monasteries depicting the mythology of each religion. These caves constructed near each other stand for harmony and solidarity among all faiths and beliefs.\n" +
                        ".एलोरा की गुफाएं\n" +
                        "महाराष्ट्र के औरंगाबाद से थोड़ी ही दूरी पर 2 किमी के क्षेत्र में फैले हुए, ये 34 मठ-मंदिर एक ऊंची बेसाल्ट चट्टान की दीवार को काटकर साथ-साथ ही बनाए गए हैं। 600 से लेकर 1000 ईस्\u200Dवी काल के दौरान एक के बाद एक बने स्मारकों से समृद्ध एलोरा, प्राचीन भारत की सभ्यता को जीवंत करता है। एलोरा परिसर, न केवल एक अद्वितीय कलात्मक रचना और तकनीकी कार्य है, अपितु यह बौद्ध, हिंदू और जैन धर्म को समर्पित अपने मठ-मंदिरों के साथ सहिष्णुता की उस भावना को भी पूरी तरह से दर्शाता है, जो प्राचीन भारत की विशेषता थी.\n\n\n\n\n\n\n\n\n");
                ellora.start();
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText("The Taj Mahal, an immense mausoleum of white marble, built in Agra between 1631 and 1648 by order of the Mughal Emperor Shah Jahan, is the jewel of Muslim art in India and one of the universally admired masterpieces of the world's heritage.The monument, begun in 1632, was finished in 1648; unverified but nonetheless, tenacious, legends attribute its construction to an international team of several thousands of masons, marble workers, mosaicists and decorators working under the orders of the architect of the emperor, Ustad Ahmad Lahori.The Taj Mahal was designated as a UNESCO World Heritage Site in 1983 for being the jewel of Muslim art in India and one of the universally admired masterpieces of the world's heritage. It is regarded by many as the best example of Mughal architecture and a symbol of India's rich history.\n\n\n\n\nताजमहल, सफेद संगमरमर का एक विशाल मकबरा, जिसे मुगल सम्राट शाहजहाँ के आदेश से 1631 और 1648 के बीच आगरा में बनाया गया था, भारत में मुस्लिम कला का गहना है और दुनिया की विरासत की सार्वभौमिक रूप से प्रशंसित कृतियों में से एक है। 1632 में शुरू हुआ स्मारक 1648 में समाप्त हो गया था; असत्यापित लेकिन फिर भी, दृढ़, किंवदंतियों ने सम्राट के वास्तुकार के आदेश के तहत काम करने वाले कई हजारों राजमिस्त्री, संगमरमर के श्रमिक, मोज़ेक और सज्जाकार की एक अंतरराष्ट्रीय टीम को इसके निर्माण का श्रेय दिया, उस्ताद अहमद लाहोरी। ताजमहल को 1983 में यूनेस्को की विश्व धरोहर स्थल के रूप में नामित किया गया था भारत में मुस्लिम कला का गहना और दुनिया की विरासत की सार्वभौमिक रूप से प्रशंसित कृतियों में से एक. इसे कई लोग मुगल वास्तुकला का सबसे अच्छा उदाहरण और भारत के समृद्ध इतिहास का प्रतीक मानते हैं.\n\n\n\n\n\n\n\n\n\n\n");
                tajmahal.start();
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(" The Basilica of Bom Jesus is a monument typical of the classic forms of plane architecture, introduced by the Society of Jesus, otherwise known as the Jesuits. The façade, which is of granite, represents features of five styles of architecture: Roman, Ionic, Doric, Corinthian and Composite. It is a large single Nave structure built ( 1595-1605) and paid for with legacies left by Dom Jeronimo Mascarenhas, a wealthy Portuguese Captain of Cochin.The retable of the main altar exhibits a huge statue of Saint Ignatius of Loyola, the founder (along with St. Francis Xavier who was a founding member) of the Society of Jesus and below it, a small image of Bom Jesus (Child Jesus), the patron of the church.On the southern side of the transept lies the Chapel of St. Francis Xavier. This chapel has carved and gilded columns and wood-carved floral decorations. This is where the relics of the saint are kept.The Basilica also contains a modern art gallery with paintings depicting various Biblical scenes.  \n\n\n\n\n\n" +
                        "  बेसिलिका ऑफ बोम जीसस, सोसाइटी ऑफ जीसस द्वारा शुरू किए गए विमान वास्तुकला के क्लासिक रूपों का एक विशिष्ट स्मारक है, जिसे जेसुइट्स के रूप में जाना जाता है. अग्रभाग, जो ग्रेनाइट का है, वास्तुकला की पांच शैलियों की विशेषताओं का प्रतिनिधित्व करता है: रोमन, आयनिक, डोरिक, कोरिंथियन और समग्र. यह एक बड़ा एकल गुफा संरचना है जिसे ( 1595-1605 ) बनाया गया है और डोम जेरोनिमो मस्कारेन्हास द्वारा छोड़ी गई विरासत के लिए भुगतान किया गया है, कोचीन का एक धनी पुर्तगाली कैप्टन। मुख्य वेदी के पीछे हटने वाले सेंट इग्नाटियस की एक विशाल प्रतिमा का प्रदर्शन करते हैं, जो सेंट के साथ संस्थापक ( है. फ्रांसिस ज़ेवियर जो यीशु के समाज के संस्थापक सदस्य ) थे और इसके नीचे, बॉम जीसस की एक छोटी छवि ( चाइल्ड जीसस ), चर्च के संरक्षक। ट्रेन्सेप्ट के दक्षिणी किनारे पर चैपल ऑफ सेंट स्थित है. फ्रांसिस जेवियर. इस चैपल में नक्काशीदार और सोने के स्तंभ और लकड़ी से नक्काशीदार फूलों की सजावट है. यह वह जगह है जहां संत के अवशेष रखे जाते हैं। बेसिलिका में विभिन्न बाइबिल दृश्यों को चित्रित करने वाली पेंटिंग के साथ एक आधुनिक आर्ट गैलरी भी है.  \n\n\n\n\n\n\n\n\n\n\n");
                jesus.start();
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText("The Charminar is  constructed in 1591, is a monument located in Hyderabad, Telangana, India.The fifth ruler of the Qutb Shahi dynasty, Muhammad Quli Qutb Shah, built the Charminar in 1591. It  was built at the intersection of the historical trade route connecting the markets of Golkonda with the port city of Machhilipatnam.The structure is made of granite, limestone, mortar, and pulverised marble, weighing approximately 14,000 tones apiece.[22] Initially the monument was so proportionately planned that when the fort first opened, one could see all four corners of the bustling city of Hyderabad through each of its four grand arches, as each arch faced one of the most active royal ancestral streets.\n\n\n\n\n\n" +
                        "चार्मिनार का निर्माण 1591 में हुआ था, यह हैदराबाद, तेलंगाना, भारत में स्थित एक स्मारक है। कुतुब शाही राजवंश के पांचवें शासक मुहम्मद कुली कुतुब शाह ने 1591 में चार्मिनार का निर्माण किया था. यह ऐतिहासिक व्यापार मार्ग के चौराहे पर बनाया गया था, जो गोलकुंडा के बाजारों को माचिलिपत्तनम के बंदरगाह शहर से जोड़ता है। यह संरचना ग्रेनाइट, चूना पत्थर, मोर्टार और पुलवराइज्ड संगमरमर से बनी है, लगभग 14,000 टन वजन का वजन। [22 ] शुरू में स्मारक को इतनी आनुपातिक रूप से योजनाबद्ध किया गया था कि जब किला पहली बार खुला, तो कोई अपने चार भव्य मेहराबों में से प्रत्येक के माध्यम से हैदराबाद के हलचल वाले शहर के सभी चार कोनों को देख सकता था, प्रत्येक आर्क के रूप में सबसे सक्रिय शाही पैतृक सड़कों में से एक का सामना करना पड़ा.\n\n\n\n\n\n");
                charminar.start();
            }
        });





    }





}