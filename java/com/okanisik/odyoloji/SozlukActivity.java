package com.okanisik.odyoloji;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.startapp.sdk.adsbase.StartAppAd;

public class SozlukActivity extends AppCompatActivity {



    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;
    private String[] items = {"Abdomen:Karın","Abducens:Uzaklaştıran","Abduction:Orta hattan uzaklaşma",
    "Absorbans:Emilim","Acetabulum:Hokka çukuru,çanakcık","Adduction:Orta hatta yaklaşma",
    "Admittans:Geçirgenlik","Afferens:Merkeze getiren","Afferent Sinir:Bilgiyi duyu organından merkeze taşıyan sinir",
    "Akkiz:Sonradan kazanılmış","Akophone:İlk elektirikli işitme cihazı","Akselerasyon:İvme,hızlanma",
    "Akson:Sinir hücrelerinin uzun kolu","Akustik:Ses,Sesle ilgili","Akustik Direnç:Ses iletimine karşı oluşan kuvvetler toplamı",
    "Akustik Refleks:Yüksek şiddetli akustik uyarım sonucu stapes kasının kasılması","Akustik Travma:Yüksek şiddetli uyarıma maruz kalmaktan kaynaklanan işitme kaybı",
    "Akustik Tümör:İşitme siniri üzerinde oluşan tümör","Akut:Ani başlayan","Album:Beyaz","Alın Kemiği:(Frontal bone)Kafatasının ön bölümünü oluşturan kemik",
    "Alimentarius:Beslenmeye yarayan","Alveolus:Küçük çukur","Amphiarthrosis:Az oynar(yarı oynar) eklem",
    "Amplitüd:Periyodik bir dalganın uzanımının ulaştığı en büyük değer","Amyglada:Duygusal hafıza ve duygusal tepkilerin oluşmasında etkili olan ve korku gibi duyguların oluşmasında sorumlu olan kısım",
    "Anastomosis:Ağızlaşma,birleşme","Anguler:Açısal","Angulus:Açı,köşe","Annulus:Timpanik yüzük","Ansa:Halka","ANSI:American National Standarts İnstitue",
    "Antagonist:Zıt etki","Antebrachium:Ön kol","Anterior:Ön","Antrum:Oyun,Boşluk","Anularis:Halka gibi","Apertura:Açıklık","Apex:Tepe",
    "Aplazi:Gelişmezlik,bir organ veya dokunun gelişimindeki hatalı gelişme","Apoeneurosis:Kasları saran geniş fasiya",
    "Aralıklı Gürültü:(İntermittent)Tekrarlayan kesik kesik gürültüdür","Arthrologla:Eklem bilimi","Articulatio:Eklem","Ascendens:Çıkan,yükselen",
    "ASHA:American Speech and Hearning Association","Asimetrik İşitme Kaybı:Bir kulaktaki işitme kaybı şeklinin diğer kulaktan farklı olması",
    "Ateroskleroz:Damar sertleşmesi","Atrofi:Körelme,yapı ve görev bakımından zayıflama ya da küçülme","Auricula:Kulak kepçesi","Basal Ganglia:Karmaşık motor hareketlerinin uygulanması ve organizasyonundan sorumlu yapı",
    "Basınçlı Emilim:Orta kulak basınç seviyesinde yapılan emilim ölçümü","Basınçsız Emilim:Atmosfer basıncından yapılan emilim ölçümü","Basilar Membran:Scala tympani ve Scala media'yı birbirinden ayıran yapı",
    "Bilateral:İki taraflı","Cerebellum:Beyincik","Cerebrum:Beyin","Cochlea:(Koklea)İşitme organı","Compression:Sıkışma","Coranal:Vücudu ön ve arka olarak ikiye bölen eksen", "Corpus Callosum:Beynin her iki hemisferini birbirinden bağlayan yapı",
    "Dalgaboyu:Art arda meydana gelen iki dalganın aynı fazlı noktaları arasındaki mesafe","daPa:Deka Pascal,Basınç birimi","Darbeli Gürültü:(İmpact)Aniden oluşan,kısa süreli ve şok dalgası yaratan gürültü",
    "Decay:Sönümlenme","Dehissans:Yarılma","Dentrit:Sinir hücrelerinin kısa kolları","Deprivasyon:Yoksunluk",
    "Desibel:(dB) Ses şiddet düzeyi birimi","Dinamik Aralık:İşitme eşiği ile rahatsız olma eşiği arasındaki fark",
    "Dozimetre:Zaman içindeki gürültü örneklerini kaydeden ses seviyesi ölçüm aleti","Ear Canal","Ear Wax:Kulak kiri",
    "Efferent Sinir:Merkezden gelen sinyali perifere taşıyan sinir","Endolymph:(endolenf)Potasyum oranın yüksek,Sodyum oranı düşük bir sıvı",
    "Eustachi Tube:Östaki tüpü","Fiksasyon:Birleşme,Bütünleşme","Fistül:Yarık","Forebrain:Ön beyin","Frekans:Ses dalgasının 1 saniye içerisindeki sıkışma ve seyrekleşme sayısı",
    "Genlik:Periyodik bir dalganın uzanımının ulaştığı en büyük değer","Glue Ear:Orta kulakta biriken sıvının zamanla yoğunlaşmasıyla oluşan patolojik durum",
    "Gradient:Tepe eğimi","Gyrus:(girus) çıkıntı","Hava yolu testi:Dış kulak yoluna verilen akustik uyarımla yapılan işitme ölçümü",
    "Helicotrema:Scala vestibuli ve Scala tympani'nin en üst kısımda birleşerek oluşturduğu yapı","Helix:Auriculanın en üst kısmı","Hertz:(Hz)Frekans birimi",
    "Hindbrain:Arka beyin","ISO:İnternational Standarts Organization","İletişim Tipi İşitme Kaybı:İTİK,Dış veya orta kulak patolojilerinden kaynaklanan işitme kaybı",
    "İmmitans:İmpedans ve admittans kelimelirinin birleştirilmesiyle oluşturulan ölçüm kavramı","İmpedans:Direnç",
    "İnkus:Kemikçik zincirinin ortanca kemiği","İpsilateral:Aynı taraf","İstirahat Potansiyeli:Koklea uyarılmadığı zaman bile mevcut olan elektirikli potansiyel",
    "İşitme Eşiği:Akustik uyarımın %50'sinin duyabildiği en düşük şiddet seviyesi","İzofonik:Fonem yerleşimi dengeli dağılmış(kelime listesi)",
    "KAGA:Kulaklar arası geçiş azalması","Kemik yolu testi:Kafatası kemiğinden verilen  titreşimle işitme  eşiğinin ölçülmesi",
    "Koklea[Salyangoz]:İşitme organının içinde yer aldığı salyangoz şeklindeki kemik yapı","Koklear Çekirdek:İşitme sinirinin sonlanıp,işitme yollarının başladığı beyinsapı girişindeki sinirsel bağlantı bölgesi",
    "Koklear Emisyon:Dış tüylü hücrelerin aktivasyonu ile oluşan çok hafif düzeydeki sesler",
    "Koklear İşitme Kaybı:Dış ve/veya iç tüylü hücre harabiyetine bağlı işitme kaybı","Koklear Mikrofonik:İşitsel uyaranlara tepki şeklindeki potansiyeller",
    "Kompleks Ses:Birden Fazla sesin oluşturduğu ses","Konka:Dış kulak yolunun hemen girişinde bulunan çukur kısım",
    "Kontralateral:Karşı taraf","Kronik:Sürekli","Kronik Otit:Sürekli tekrarlayan kulak ilhitabı","Kulak kanalı hacmi:(Timpanometride)Ölçüm probunun ucu il kulak zarı arasında kalan hacim",
    "Kütle etkisi:Eylemsizlik kuvveti","Loudness:Ses yüksekliği","Malleus:3 kemikçik içinde en büyük olanı",
    "Maske:Test sinyalinin duyulmasını zorlaştıran gürültü uyaranı","Mass:Kütle","Mastoid Kemik:Kulak kepçesinin hemen arkasında havalı hücrelerden oluşan kemik doku",
    "Medulla Oblangata:Beyin ile diğer vücut organları arasındaki bağlantıyı sağlayan yapı","Membran:Zar",
    "Meniere:Daha çok alçak frekansları etkileyen,baş dönmesi ve çınlamanın eşlik ettiği işitsel patoloji",
    "Midbrain:Orta beyin","Mikst:Karışık,İletim ve sensörinöral işitme kaybının birlikte sebep olduğu işitme kaybı tipi",
    "Minimum Maske Seviyesi:Eşik değişikliğine neden olan en düşük maske seviyesi","Modiolus:Kokleanın merkezi dikey aksı",
    "N.Trigeminus:V.Sinir","N.Abducens:VI.Sinir","N.Facialis:VII.Sinir","N.Vestibulocochlearis:VIII.Sinir","Nervous:Sinir",
    "Normal İşitme:-10 ile 25 dB arasında değişen işitme eşiği.Bazı klinikler normal işitmeyi -10 ile 15dB arasında kabul eder","Nöral:Sinirsel","Nucleus:Çekirdek",
    "Odyogram:İşitme eşiklerinin işaretlendi belge","Odyoloji:İşitme bilimi","Odyometre:İşitme ölçümü yapılan alet","Odyometri:İşitme ölçüm işi",
    "Oklüzyon:Tıkanıklık","Oktav:Üst değeri,alt değerinin iki katı olan frekans aralığı","Otitis media:Orta kulak enfeksiyonu",
    "Ototoksisite:Bir ilaç veya kimyasal maddenin iç kulağa yapısal veya işlevsel olarak zarar vermesi","Oval pencere:Scala vestibulinin orta kulağa bakan promontoryum üzerindeki penceresi",
    "Ölü bölge:Bazal zar üzerinde tüylü hücrelerinin tümüyle tahrip olduğu bölgeler","Östaki Tüpü:Orta kulağı genize bağlayan havalandırma tüpü",
    "Pars Flaccida:Kulak zarının üst kısmını oluşturan,iki katmandan oluşan gevşek bölge","Pars Tensa:3 tabakadan oluşan ve zar alanının büyük kısmını kaplayan gergin bölge",
    "Perforasyon:Yırtık,açıklık","Periferal:Dış taraf","Perilymph:(perilenf)Sodyum oranı yüksek,Potasyum oranı düşük bir sıvı","Pes Ses:Kalın ses",
    "Pinna:Kulak kepçesi","Pramit:Stapes kasının içinde yer aldığı piramide benzeyen kemik yapı","Pich:Ses perdesi","Pons:Cerebellum'un iki yarım küresi arasındaki uyarıiletiminin sağlayan ve her ik hemisferi birbirine bağlayan yapı",
    "Presbiakuzi:Yaşlılığa bağlı olarak ortaya çıkan işitme kaybı","Pressure:Basınç","Probe Tone:Ölçüm amacıyla kulağa yerleştirilen tıkaçtan verilen akustik uyaranın frekans özelliği","Progresif İşitme Kaybı:İlerleyici işitme kaybı","Promontoryum:Kokleanın orta kulağa doğru genişleyen bazal çıkıntısı",
    "Rarefaction:Gevşeme","Refleks Sönümlenmesi:Uyaran şiddeti değişmediği halde akustik refleks genliğinin zamanla azalması","Reflektans:Yansıma","Regular:Düzenli",
    "Reissner's membran:Scala vestibuli ve Scala media'yı birbirinden ayıran yapı","Rekruitment:(Recruitment)İşitme kayıplılarda ses şiddetinin seviyesini yükseldikçe şiddet algısının normalleşmesi",
    "Retraksiyon:Geri çekilme","Retrokoklear:Koklea sonrası","Rezonans Frekansı:Bir ortamda akustik enerjinin en üst seviyeye çıktığı frekans aralığı",
    "Sabit Gürültü:(Steady State)Kendi içinde en fazla 5 dB fark gösteren ve sürekli tekrarlayan gürültü","Saf Ses:Tek frekanstan oluşan akustik enerji",
    "Saf Ses Ortalaması:Genellikle 500,1000 ve 2000 Hz işitme eşiklerinin ortalamasıyla elde edilen değer","Sagital:Vücudu sağ ve sol olarak ikiye ayıran eksen",
    "Sensation Level:(SL)Algılama seviyesi","Sensörinöral:Koklea ve/veya işitme siniri patolojisinden kaynaklanan işitme kaybı","Seroz Otit:Orta kulakta sıvı birikmesi",
    "Sessiz Oda:İşitme testlerinin yapıldığı uluslararası kalibrasyon kriterlerine göre oluşturulmuş test odası","Ses:Hava ya da diğer iletici ortamlarda bir dalga biçiminin veya hareketinin kulak tarafından algılanması",
    "Shadow Effect:Gölge etkisi","Simultane:Uyarının Eş zamanlı olarak verilmesi","Simultane:Uyarının Eş zamanlı olarak verilmesi",
    "Simülasyon:Taklit","Sinaps:Sinir hücrelerinin diğer sinir veya doku hücrelerine mesaj ilettiği bağlantı noktası","Skala Media:Kokleada,skala timpani ve sakala vestibuli arasında yer alan korti organının bulunduğu kanal",
    "Skala Timpani:Yuvarlak pencere ile helikotrema arasında yer alan koklear kanal","Skala Vestibuli:Oval pencere ile helikotrema arasında yer alan koklear kanal",
    "Spiral Ganglion:İşitme sinirinin hücre çekirdeklerinden oluşan spiral yapı.Moduolusun içine yerleşmiştir","Stapes:Kemikçik zincirinin en küçük ve sonuncu olanı",
    "Statik Esneklik:Timpanogramın tepe noktası ile +200 daPa'da oluşan esneklik değerler arasındaki fark","Stiffness:Katılık",
    "Stria Vaskularis: Korti organının beslenmesini sağlayan,skala media'nın dış yüzeyinde bulunan damarlı yapı","Sulcus:Girinti","Tek Taraflı İşitme Kaybı:Sadece bir kulakta işitme kaybı olması",
    "Tektorial Zar:Korti organını üstten örten zar","Temporal Kemik:Şakak kemiği,Kokleanın içine yerleştiği kafatası kemiği","Tensor Timpani:Malleusu mediale doğru çekerek kulak zarının  gerginliğini arttıran kas",
    "Thalamus:Diensefalon'un bir parçası olup koku duyusu hariç,tüm sistemlerden gelen Afferent inpulslar için bir kapı","Timbre:Ses rengi",
    "Timpanogram:Orta kulağın geçirgenliğini veya direncini gösteren grafik","Timpanometre:Orta kulağın geçirgenlik veya direncini ölçen alet",
    "Toynbee Manevrası:Orta kulak basıncını azaltan manevra.Burun kapatılark yutkunma işlemi","Tiz Ses:İnce ses","Tragus:Kulak kanalı girişinin önünde yer alan çıkıntı",
    "Travelling Wave:İlerleyen dalga teorisi","Tympanic Membrane:Kulak zarı","Uncinatus:Çengelsi","Uncus:Çengel","Unilateral:Tek taraflı",
    "Unstabil:Düzenli","Upbeat:Yukarıvuran","Umbo:Malleusun uzun kolunun(Manubrium)kulak zarına gömüldüğü uç noktası","Vallecula:Çukurcuk",
    "Valsalva Manevrası:Orta kulak basıncını arttıran manevra","Vasoconstriction:Damarların büzülmesi","Vena:Toplar damar","Vertebra:Omur","Verticalis:Dikey","Vesica:Kese,torba",
    "Viscera:İç organ","Vasodilatation:Damarların genişlemesi","Vertigo:Baş dönmesi","Vestibular System:Denge organı","Vezikülasyon:Keseciklenme,torbacıklanma",
    "Vibratör:Titreştirici,Kemik yolu ölçümlerindde kullanılan aparat","Vizüel:Görsel","Yapay Refleks:(Refleks artefact)gerçekte reflekse bağlı olmayıp,akustik refleks görüntüsüne sahip grafik bulgusu",
    "Yuvarlak Pencere:Scala timpaninin orta kulağa bakan promontoryum üzerindeki penceresi","Zigomatik Kemik:Elmacık kemiği"};
    private EditText searchBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sozluk);


        listView = findViewById(R.id.listViews);
        searchBar=findViewById(R.id.searchItems);
        arrayAdapter = new ArrayAdapter<String>(SozlukActivity.this, android.R.layout.simple_expandable_list_item_1,items);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SozlukActivity.this, items[position], Toast.LENGTH_SHORT).show();

            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SozlukActivity.this);
                builder.setTitle(items[position]);
                builder.setMessage("ANY");
                builder.setCancelable(true);
                builder.show();
                return false;
            }
        });

        searchBar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                SozlukActivity.this.arrayAdapter.getFilter().filter(s);


            }
        });




    }
}