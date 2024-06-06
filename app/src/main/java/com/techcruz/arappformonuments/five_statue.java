package com.techcruz.arappformonuments;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class five_statue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_statue);

        TextView content;
        TextView a,b,c,d,e;
        a= findViewById(R.id.statueofunity);
        b= findViewById(R.id.greatbuddha);
        c= findViewById(R.id.adiyogi);
        d= findViewById(R.id.ataltunnel);
        e= findViewById(R.id.ashokpillar);
        content= findViewById(R.id.content_text);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText("The Statue of Unity is the world's tallest statue, with a height of 182 meters (597 feet),located in the state of Gujarat, India. It depicts Indian statesman and independence activist Vallabhbhai Patel (1875–1950), who was the first deputy prime minister and home minister of independent India and an adherent of Mahatma Gandhi. Patel was highly respected for his leadership in uniting 562 princely states of India to form the single Union of India. In Gujarat the statue is found on the Narmada River in the Kevadiya colony, facing the Sardar Sarovar Dam 100 kilometers (62 mi) southeast of the city of Vadodara.The Statue of Unity was inaugurated by prime minister Narendra Modi on October 31, 2018, on the 143rd birth anniversary of Sardar Vallabhbhai Patel.\n\n" +
                        "स्टैच्यू ऑफ यूनिटी भारत के प्रथम उप प्रधानमन्त्री तथा प्रथम गृहमन्त्री वल्लभभाई पटेल को समर्पित एक स्मारक है, जो भारतीय राज्य गुजरात में स्थित है।[5] गुजरात के तत्कालीन मुख्यमन्त्री नरेन्द्र मोदी ने 31 अक्टूबर 2013 को सरदार पटेल के जन्मदिवस के मौके पर इस विशालकाय मूर्ति के निर्माण का शिलान्यास किया था। यह स्मारक सरदार सरोवर बांध से 3.2 किमी की दूरी पर साधू बेट नामक स्थान पर है जो कि नर्मदा नदी पर एक टापू है। यह स्थान भारतीय राज्य गुजरात के भरुच के निकट नर्मदा जिले में स्थित है।\n" +
                        "\n" +
                        "यह विश्व की सबसे ऊँची मूर्ति है, जिसकी लम्बाई 182 मीटर (597 फीट) है। इसके बाद विश्व की दूसरी सबसे ऊँची मूर्ति चीन में स्प्रिंग टैम्पल बुद्ध है, जिसकी आधार के साथ कुल ऊंचाई 153 मीटर (502 फीट) हैं।\n" +
                        "\n" +
                        "प्रारम्भ में इस परियोजना की कुल लागत भारत सरकार द्वारा लगभग ₹3,000 करोड़ (US$438 मिलियन) रखी गयी थी, बाद लार्सन एंड टूब्रो ने अक्टूबर 2014 में सबसे कम ₹2,989 करोड़ (US$436.39 मिलियन) की बोली लगाई; जिसमें आकृति, निर्माण तथा रखरखाव शामिल था। निर्माण कार्य का प्रारम्भ 31 अक्टूबर 2013 को प्रारम्भ हुआ।[10][11] मूर्ति का निर्माण कार्य मध्य अक्टूबर 2018 में समाप्त हो गया। इसका उद्घाटन भारत के प्रधानमंत्री नरेन्द्र मोदी द्वारा 31 अक्टूबर 2018 को सरदार पटेल के जन्मदिवस के मौके पर किया गया।");
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText("The word ‘Buddha’ is a title, which means ‘one who is awake’ — in the sense of having ‘woken up to reality’. The Buddha was born as Siddhartha Gautama in Nepal around 2,500 years ago. He did not claim to be a god or a prophet. He was a human being who became Enlightened, understanding life in the deepest way possible. He renounced his princely life, spent six years studying doctrines and undergoing yogic austerities. He then gave up ascetic practices for normal life. He spent seven weeks in the shade of a Bodhi tree until, finally, one night toward dawn, enlightenment came. Then he preached sermons and embarked on missionary travels for 45 years. He affected the lives of thousands high and low. At the age of 80 he experienced his parinirvana extinction itself.The literature inspired by the Buddha's story is as varied as those who have told it in the last 2500 years. To the first of his followers, and the tradition associated with Theravada Buddhism and figures like the great Emperor Ashoka, the Buddha was a man, not a God. He was a teacher, not a savior. The Buddha died in 483 B.C.E., after 45 years of traveling and teaching. Upon his death, the Buddha passed into a state of nirvana, the ultimate release from suffering in which the self no longer exists and salvation is achieved. Included in his last breaths were four words of inspiration: \"Strive on with awareness.\" And his followers did.\n" +
                        "शब्द ‘ बुद्ध ’ एक शीर्षक है, जिसका अर्थ है ‘ जो जाग रहा है ’ — होने के अर्थ में ‘ वास्तविकता के लिए जाग गया ’. बुद्ध का जन्म लगभग 2,500 साल पहले नेपाल में सिद्धार्थ गौतम के रूप में हुआ था. उसने भगवान या पैगंबर होने का दावा नहीं किया. वह एक इंसान था जो प्रबुद्ध हो गया, जीवन को सबसे गहरे तरीके से समझ रहा था. उन्होंने अपने राजसी जीवन को त्याग दिया, छह साल सिद्धांतों का अध्ययन करने और योगिक तपस्या से गुजरने में बिताए. फिर उन्होंने सामान्य जीवन के लिए तपस्वी प्रथाओं को छोड़ दिया. उन्होंने बोधि वृक्ष की छाया में सात सप्ताह बिताए, आखिरकार, एक रात भोर की ओर, आत्मज्ञान आया. फिर उन्होंने उपदेश दिया और 45 वर्षों तक मिशनरी यात्रा पर रहे. उन्होंने हजारों उच्च और निम्न के जीवन को प्रभावित किया. 80 वर्ष की आयु में उन्होंने अपने परिनिवाना विलुप्त होने का अनुभव किया। बुद्ध की कहानी से प्रेरित साहित्य उन लोगों की तरह विविध है जिन्होंने पिछले 2500 वर्षों में इसे बताया है. अपने अनुयायियों में से पहले, और थेरवाद बौद्ध धर्म से जुड़ी परंपरा और महान सम्राट अशोक जैसे आंकड़े, बुद्ध एक व्यक्ति थे, भगवान नहीं. वह एक शिक्षक था, उद्धारकर्ता नहीं. यात्रा और शिक्षण के 45 वर्षों के बाद, बुद्ध की मृत्यु 483 ईसा पूर्व में हुई. उनकी मृत्यु के बाद, बुद्ध निर्वाण की स्थिति में चले गए, दुख से अंतिम विमोचन जिसमें स्वयं अब मौजूद नहीं है और मोक्ष प्राप्त होता है. उनकी अंतिम सांसों में शामिल थे प्रेरणा के चार शब्द: \"जागरूकता के साथ प्रयास करें.\" और उनके अनुयायियों ने किया.\n");
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText("The Adiyogi statue is a 34-metre tall (112 ft), 45-metre long (147 ft) and 25-metre wide (82 ft) steel statue of Shiva with Thirunamam at Coimbatore, Tamil Nadu. It is recognized by the Guinness World Records as the \"Largest Bust Sculpture” in the world.[1][2] Designed by Sadhguru Jaggi Vasudev, it weighs around 500 tonnes (490 long tons; 550 short tons).[3]\n" +
                        "Adiyogi refers to Shiva (Shankar) as the first yogi. It was established to inspire people towards inner well-being through yoga.\n" +
                        "आदियोगी शिव प्रतिमा, शंकर की ११२ फ़ीट की ऊँची प्रतिमा है जो कोयम्बटूर में वर्ष २०१७ में स्थापित की गयी थी। इसकी अभिकल्पना (डिजाइन) सद्गुरु जग्गी वासुदेव ने की है। सद्गुरु का विचार है कि यह प्रतिमा योग के प्रति लोगों में प्रेरणा जगाने के लिये हैं, इसीलिये इसका नाम 'आदियोगी' (=प्रथम योगी) है। शिव को योग का प्रवर्तक माना जाता है।");
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText("Atal Tunnel (also known as Rohtang Tunnel), named after former Prime Minister of India, Atal Bihari Vajpayee is a highway tunnel built under the Rohtang Pass in the eastern Pir Panjal range of the Himalayas on the Leh-Manali Highway in Himachal Pradesh, India.At a length of 9.02 km, it is the longest highway single-tube tunnel above 10,000 feet (3,048 m) in the world. With the existing Atal Tunnel and after the completion of under-construction Shingo La Tunnel, which is targeted to be completed by 2025, the new Leh-Manali Highway via Nimmu–Padum–Darcha road will become all-weather roads.The cost of the entire project is ₹3,200 crore (US$438 million).The tunnel was completed by the Border Roads Organization (BRO) under Ministry of Defense.Telephone facility available at every 150 meters in the tunnel, emergency exit every 500 meters,fire hydrant every 60 meters,cave in every 2.2km. Air quality monitoring i.e air quality sensors are installed at each kilometer.\n" +
                        "अटल टनल ( को रोहतांग टनल ) के नाम से भी जाना जाता है, जिसका नाम भारत के पूर्व प्रधान मंत्री के नाम पर रखा गया है, अटल बिहारी वाजपेयी एक राजमार्ग सुरंग है जो हिमालय के पूर्वी पीर पंजल रेंज में हिमालय के लेह-मनाली राजमार्ग पर हिमालय के रोहतांग दर्रे के नीचे बनाई गई है, भारत। 9.02 किमी की लंबाई में, यह दुनिया में 10,000 फीट ( 3,048 मीटर ) से ऊपर सबसे लंबी राजमार्ग एकल-ट्यूब सुरंग है. मौजूदा अटल सुरंग के साथ और निर्माण के पूरा होने के बाद शिंगो ला टनल, जिसे 2025 तक पूरा करने का लक्ष्य है, निमू – पडुम – दारचा रोड के माध्यम से नया लेह-मनाली राजमार्ग सभी मौसम की सड़कें बन जाएगा। पूरी परियोजना की लागत ₹ 3,200 करोड़ ( US $ 438 मिलियन ) है.सुरंग को रक्षा मंत्रालय के तहत बॉर्डर रोड्स ऑर्गनाइजेशन ( BRO ) द्वारा पूरा किया गया था। सुरंग में हर 150 मीटर पर उपलब्ध टेलीफोन सुविधा, हर 500 मीटर पर आपातकालीन निकास, हर 60 मीटर पर अग्नि हाइड्रेंट,हर 2.2 किमी में गुफा. प्रत्येक किलोमीटर पर वायु गुणवत्ता निगरानी यानी वायु गुणवत्ता सेंसर स्थापित किए जाते हैं.\n");
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText("The national emblem of India is an adaptation of the Lion Capital atop the Ashoka Pillar of Sarnath, Uttar Pradesh, and is combined with the National Motto Satyameva Jayate. The Lion Capital crowning the Ashok Pillar is carved out of a single block of yellow sandstone and features four Asiatic Lions sitting back to back, but the two dimensional representation of the National Emblem depicts only 3, the fourth lion is hidden from view. The four lions stand on a short cylindrical base that has four Ashok Chakras corresponding to each lion bust and reliefs of four more animals in between them – the lion, the bull, the elephant and the galloping horse.the words are a quote from Mundaka Upanishad, the last and most philosophical of the four Vedas and is translated as ‘Truth alone triumphs’.\n" +
                        "भारत का राष्ट्रीय प्रतीक सारनाथ, उत्तर प्रदेश के अशोक स्तंभ के ऊपर लायन कैपिटल का एक अनुकूलन है, और इसे राष्ट्रीय आदर्श वाक्य सत्यमेवा जयते के साथ जोड़ा गया है. अशोक स्तंभ की ताजपोशी करने वाली लायन कैपिटल को पीले बलुआ पत्थर के एक ही ब्लॉक से उकेरा गया है और इसमें चार एशियाई शेर पीछे की ओर बैठे हैं, लेकिन राष्ट्रीय प्रतीक के दो आयामी प्रतिनिधित्व केवल 3 को दर्शाते हैं, चौथा शेर दृश्य से छिपा हुआ है. चार शेर एक छोटे बेलनाकार आधार पर खड़े होते हैं, जिसमें प्रत्येक शेर के बस्ट के अनुरूप चार अशोक चक्र होते हैं और उनके बीच में चार और जानवरों की राहत होती है – शेर, बैल, हाथी और सरपट दौड़ने वाला घोड़ा। ये शब्द मुंडका उपनिषद के एक उद्धरण हैं, जो चार वेदों के अंतिम और सबसे दार्शनिक हैं और इसका अनुवाद ‘ सत्य अकेले विजय ’ के रूप में किया गया है.\n");
            }
        });





    }
}