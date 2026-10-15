package l1;

import android.text.TextUtils;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import f.AbstractActivityC1671f;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f13951e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f13952f;

    /* renamed from: g, reason: collision with root package name */
    public static HashSet f13953g;

    /* renamed from: h, reason: collision with root package name */
    public static Integer f13954h;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f13955a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f13956b;
    public e c;
    public e d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l1.f] */
    static {
        ?? obj = new Object();
        obj.f13956b = new ArrayList();
        f13951e = obj;
        f13952f = "likes";
    }

    public static HashSet b(AbstractActivityC1671f abstractActivityC1671f) {
        HashSet hashSet = f13953g;
        if (hashSet != null) {
            return hashSet;
        }
        String string = abstractActivityC1671f.getPreferences(0).getString(f13952f, "");
        String str = string != null ? string : "";
        HashSet hashSet2 = new HashSet();
        for (String str2 : str.split(" ")) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    hashSet2.add(Integer.valueOf(str2));
                } catch (Throwable unused) {
                }
            }
        }
        f13953g = hashSet2;
        return hashSet2;
    }

    public final void a() {
        ArrayList arrayList = this.f13955a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C1797d c1797d = (C1797d) obj;
            c1797d.f13948i = c1797d.d.toLowerCase().split("[\\W]");
        }
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        this.f13955a = arrayList;
        arrayList.add(new C1797d(R.raw.s1, 1, 1625327120123L, "Room Light Sensor", 153L, 1201L, 3, 12));
        this.f13955a.add(new C1797d(R.raw.s2, 2, 1625327120123L, "Bulbs", 96L, 797L, 6, 5));
        this.f13955a.add(new C1797d(R.raw.s3, 3, 1625327120123L, "8-3 Non-Priority Encoder", 4668L, 15624L, 3, 12));
        this.f13955a.add(new C1797d(R.raw.s4, 4, 1625327120123L, "Johnson Counter", 1355L, 4125L, 4, 12));
        this.f13955a.add(new C1797d(R.raw.s5, 5, 1625327120123L, "Shift Register (PISO)", 1404L, 3972L, 14, 27));
        this.f13955a.add(new C1797d(R.raw.s6, 6, 1625327120123L, "4-Bit Adder", 11922L, 18582L, 4, 3));
        this.f13955a.add(new C1797d(R.raw.s7, 7, 1625327120123L, "7400 IC Quad 2 Input NAND", 360L, 2354L, 4, 0));
        this.f13955a.add(new C1797d(R.raw.s8, 8, 1625327120123L, "Vibrate on Proximity Sensor", 242L, 2706L, 2, 1));
        this.f13955a.add(new C1797d(R.raw.s9, 9, 1625327120123L, "Maze 🤣", 1009L, 4338L, 6, 4));
        this.f13955a.add(new C1797d(R.raw.s10, 10, 1625327120123L, "4-Input OR Gate", 12088L, 23045L, 2, 5));
        this.f13955a.add(new C1797d(R.raw.s11, 11, 1625327120123L, "7486 IC Quad 2 Input XOR", 380L, 8267L, 4, 0));
        this.f13955a.add(new C1797d(R.raw.s12, 12, 1625327120123L, "Bidirectional Shift Register", 448L, 2329L, 17, 33));
        this.f13955a.add(new C1797d(R.raw.s13, 13, 1625327120123L, "5-Input AND Gate", 452L, 3211L, 3, 2));
        this.f13955a.add(new C1797d(R.raw.s14, 14, 1625327120123L, "74148 8-3 Bit Priority Encoder", 654L, 9765L, 29, 69));
        this.f13955a.add(new C1797d(R.raw.s15, 15, 1625327120123L, "4-Input NOR Gate", 8870L, 12208L, 3, 2));
        this.f13955a.add(new C1797d(R.raw.s16, 16, 1625327120123L, "Shift Register (SISO)", 3478L, 8908L, 4, 8));
        this.f13955a.add(new C1797d(R.raw.s17, 17, 1625327120123L, "Shift Register (PIPO)", 654L, 6548L, 4, 4));
        this.f13955a.add(new C1797d(R.raw.s18, 18, 1625327120123L, "Half Adder", 10890L, 17219L, 2, 6));
        this.f13955a.add(new C1797d(R.raw.s19, 19, 1625327120123L, "Battery Information", 1008L, 5604L, 12, 10));
        this.f13955a.add(new C1797d(R.raw.s20, 20, 1625327120123L, "Drumpad 🥁", 677L, 7510L, 17, 20));
        this.f13955a.add(new C1797d(R.raw.s21, 21, 1625327120123L, "16-4 Bit Priority Encoder", 1344L, 2901L, 11, 14));
        this.f13955a.add(new C1797d(R.raw.s22, 22, 1625327120123L, "Full Adder", 10505L, 17056L, 5, 12));
        this.f13955a.add(new C1797d(R.raw.s23, 23, 1625327120123L, "9-Input NAND Gate", 149L, 958L, 4, 3));
        this.f13955a.add(new C1797d(R.raw.s24, 24, 1625327120123L, "Shift Register (SIPO)", 1802L, 9811L, 4, 12));
        this.f13955a.add(new C1797d(R.raw.s25, 25, 1625327120123L, "4-Input AND Gate", 8799L, 14808L, 3, 2));
        this.f13955a.add(new C1797d(R.raw.s26, 26, 1625327120123L, "Ring Counter", 740L, 2133L, 4, 12));
        this.f13955a.add(new C1797d(R.raw.s27, 27, 1625327120123L, "RGB Lighting 😜", 155L, 6849L, 14, 13));
        this.f13955a.add(new C1797d(R.raw.s28, 28, 1625327120123L, "8-Bit Full Adder", 5691L, 9871L, 8, 7));
        this.f13955a.add(new C1797d(R.raw.s29, 29, 1625512592867L, "asm counter up-down", 30L, 181L, 8, 17));
        this.f13955a.add(new C1797d(R.raw.s30, 30, 1625512592867L, "meet a magnet", 31L, 334L, 19, 36));
        this.f13955a.add(new C1797d(R.raw.s31, 31, 1625512592867L, "vsc Counter 0-7", 31L, 190L, 9, 12));
        this.f13955a.add(new C1797d(R.raw.s32, 32, 1625981563377L, "On / Off Button", 14L, 271L, 11, 21));
        this.f13955a.add(new C1797d(R.raw.s33, 33, 1625981563377L, "Заряд", 14L, 156L, 8, 17));
        this.f13955a.add(new C1797d(R.raw.s34, 34, 1625981563377L, "Проект 5", 14L, 100L, 7, 12));
        this.f13955a.add(new C1797d(R.raw.s35, 35, 1625981563377L, "asm trafic light", 21L, 205L, 19, 36));
        this.f13955a.add(new C1797d(R.raw.s36, 36, 1625981563377L, "Проект 39", 17L, 133L, 2, 1));
        this.f13955a.add(new C1797d(R.raw.s37, 37, 1625981563377L, "Multiplier 2x2bit", 20L, 286L, 16, 27));
        this.f13955a.add(new C1797d(R.raw.s38, 38, 1625981563377L, "Шумомер", 11L, 111L, 5, 18));
        this.f13955a.add(new C1797d(R.raw.s39, 39, 1625981563377L, "Proyecto 4", 20L, 201L, 6, 4));
        this.f13955a.add(new C1797d(R.raw.s40, 40, 1627488332279L, "6led disco lights and normal disco light", 8L, 95L, 10, 20));
        this.f13955a.add(new C1797d(R.raw.s41, 41, 1627488332279L, "trafic light and sound", 11L, 107L, 9, 20));
        this.f13955a.add(new C1797d(R.raw.s42, 42, 1627488332279L, "2-bit adder", 6L, 35L, 6, 5));
        this.f13955a.add(new C1797d(R.raw.s43, 43, 1627488332279L, "test rotate screen", 6L, 65L, 4, 4));
        this.f13955a.add(new C1797d(R.raw.s44, 44, 1627488332279L, "prox_flash", 8L, 51L, 5, 4));
        this.f13955a.add(new C1797d(R.raw.s45, 45, 1627488332279L, "Proyecto simple", 7L, 32L, 4, 3));
        this.f13955a.add(new C1797d(R.raw.s46, 46, 1627488332279L, "2 second flas light", 6L, 55L, 4, 3));
        this.f13955a.add(new C1797d(R.raw.s47, 47, 1627488332279L, "188-110 randomizing generator", 9L, 100L, 54, 66));
        this.f13955a.add(new C1797d(R.raw.s48, 48, 1627488332279L, "полный сумматор", 7L, 54L, 8, 10));
        this.f13955a.add(new C1797d(R.raw.s49, 49, 1627488332279L, "Denmark flag", 8L, 55L, 5, 18));
        this.f13955a.add(new C1797d(R.raw.s50, 50, 1627488332279L, "Indicador de som", 5L, 49L, 8, 6));
        this.f13955a.add(new C1797d(R.raw.s51, 51, 1627488332279L, "Diwali light", 9L, 72L, 10, 15));
        this.f13955a.add(new C1797d(R.raw.s52, 52, 1627488332279L, "Shadow", 7L, 64L, 13, 20));
        this.f13955a.add(new C1797d(R.raw.s53, 53, 1627488332279L, "diffrent light circuit", 7L, 60L, 7, 6));
        this.f13955a.add(new C1797d(R.raw.s54, 54, 1627488332279L, "noise noise maze", 8L, 64L, 2, 8));
        this.f13955a.add(new C1797d(R.raw.s55, 55, 1627488332279L, "LED maxtrix line light", 11L, 88L, 8, 32));
        this.f13955a.add(new C1797d(R.raw.s56, 56, 1627488332279L, "super led matrix lightnig", 8L, 89L, 20, 65));
        this.f13955a.add(new C1797d(R.raw.s57, 57, 1627488332279L, "Traffic lights", 13L, 129L, 15, 22));
        this.f13955a.add(new C1797d(R.raw.s58, 58, 1627488332279L, "sirena", 9L, 87L, 8, 12));
        this.f13955a.add(new C1797d(R.raw.s59, 59, 1627488332279L, "5second flash and vibrater", 5L, 53L, 5, 4));
        this.f13955a.add(new C1797d(R.raw.s60, 60, 1627488332279L, "Project 6", 6L, 63L, 7, 5));
        this.f13955a.add(new C1797d(R.raw.s61, 61, 1627488332279L, "buzzer and flash ; vibrater, led ", 12L, 116L, 6, 20));
        this.f13955a.add(new C1797d(R.raw.s62, 62, 1627488332279L, "2colour disco light circuit", 8L, 81L, 6, 14));
        this.f13955a.add(new C1797d(R.raw.s63, 63, 1627488332279L, "10 second buzzer", 7L, 71L, 4, 4));
        this.f13955a.add(new C1797d(R.raw.s64, 64, 1627488332279L, "police", 13L, 212L, 5, 6));
        this.f13955a.add(new C1797d(R.raw.s65, 65, 1627488332279L, "bartery", 16L, 131L, 8, 10));
        this.f13955a.add(new C1797d(R.raw.s66, 66, 1627488332279L, "super unlimitad  light", 16L, 182L, 30, 79));
        this.f13955a.add(new C1797d(R.raw.s67, 67, 1627488332279L, "moving maze", 7L, 45L, 5, 5));
        this.f13955a.add(new C1797d(R.raw.s68, 68, 1627488332279L, "Active sonar", 13L, 129L, 3, 2));
        this.f13955a.add(new C1797d(R.raw.s69, 69, 1627488332279L, "Shadow123", 6L, 44L, 10, 14));
        this.f13955a.add(new C1797d(R.raw.s70, 70, 1627488332279L, "BCD", 13L, 142L, 6, 11));
        this.f13955a.add(new C1797d(R.raw.s71, 71, 1627488332279L, "bramka czasowa (time gate)", 7L, 50L, 7, 8));
        this.f13955a.add(new C1797d(R.raw.s72, 72, 1627488332279L, "COME TO SOLVE", 6L, 89L, 7, 5));
        this.f13955a.add(new C1797d(R.raw.s73, 73, 1627488332279L, "Johnson_counter", 5L, 36L, 10, 14));
        this.f13955a.add(new C1797d(R.raw.s74, 74, 1627488332279L, "ledmax line circuit", 9L, 51L, 15, 34));
        this.f13955a.add(new C1797d(R.raw.s75, 75, 1627488332279L, "2 second flash light", 5L, 43L, 4, 3));
        this.f13955a.add(new C1797d(R.raw.s76, 76, 1627488332279L, "or gate test", 8L, 25L, 4, 3));
        this.f13955a.add(new C1797d(R.raw.s77, 77, 1627488332279L, "5colour rgb light", 6L, 72L, 5, 8));
        this.f13955a.add(new C1797d(R.raw.s78, 78, 1627488332279L, "demo button", 7L, 35L, 6, 10));
        this.f13955a.add(new C1797d(R.raw.s79, 79, 1627488332279L, "Tick generator", 5L, 83L, 7, 12));
        this.f13955a.add(new C1797d(R.raw.s80, 80, 1627488332279L, "Somador (x=x+1)", 10L, 71L, 22, 53));
        this.f13955a.add(new C1797d(R.raw.s81, 81, 1627488332279L, "Button switch", 6L, 66L, 3, 5));
        this.f13955a.add(new C1797d(R.raw.s82, 82, 1628276516031L, "Sound Counter (Not Geiger Counter)", 8L, 52L, 9, 24));
        this.f13955a.add(new C1797d(R.raw.s83, 83, 1628276516031L, "3 State OR Gate", 6L, 19L, 4, 3));
        this.f13955a.add(new C1797d(R.raw.s84, 84, 1628276516031L, "test obrotu ekranu", 6L, 24L, 4, 4));
        this.f13955a.add(new C1797d(R.raw.s85, 85, 1628276516031L, "🔋 bateria", 14L, 132L, 8, 10));
        this.f13955a.add(new C1797d(R.raw.s86, 86, 1628276516031L, "And ,Not ,Or", 7L, 35L, 25, 24));
        this.f13955a.add(new C1797d(R.raw.s87, 87, 1628276516031L, "police 2.0", 10L, 78L, 8, 10));
        this.f13955a.add(new C1797d(R.raw.s88, 88, 1628276516031L, "Vibrate on Proximity Sensor(modified)", 7L, 48L, 7, 6));
        this.f13955a.add(new C1797d(R.raw.s89, 89, 1628276516031L, "light sensor", 9L, 80L, 3, 12));
        this.f13955a.add(new C1797d(R.raw.s90, 90, 1628276516031L, "2 bit Up and Down Counter using D Flip Flop", 5L, 40L, 8, 17));
        this.f13955a.add(new C1797d(R.raw.s91, 91, 1628276516031L, "przycisk demo", 6L, 27L, 6, 10));
        this.f13955a.add(new C1797d(R.raw.s92, 92, 1628276516031L, "4-Adder (UI)", 10L, 39L, 30, 28));
        this.f13955a.add(new C1797d(R.raw.s93, 93, 1628276516031L, "4 Bit Shift Register (PIPO) Using D flip Flop", 6L, 32L, 18, 14));
        this.f13955a.add(new C1797d(R.raw.s94, 94, 1628276516031L, "4 Channel demultiplexer", 8L, 40L, 15, 15));
        this.f13955a.add(new C1797d(R.raw.s95, 95, 1628276516031L, "A H C", 6L, 31L, 5, 17));
        this.f13955a.add(new C1797d(R.raw.s96, 96, 1628276516031L, "volume LED", 12L, 95L, 3, 5));
        this.f13955a.add(new C1797d(R.raw.s97, 97, 1628276516031L, "Johnson Counter by Prof. Moin Shaikh", 9L, 38L, 9, 18));
        this.f13955a.add(new C1797d(R.raw.s98, 98, 1628276516031L, "Project 6", 9L, 40L, 8, 8));
        this.f13955a.add(new C1797d(R.raw.s99, 99, 1628276516031L, "my 8 bit adder with hexa decimal display", 11L, 83L, 33, 73));
        this.f13955a.add(new C1797d(R.raw.s100, 100, 1628276516031L, "BCD ADDER", 11L, 52L, 22, 29));
        this.f13955a.add(new C1797d(R.raw.s101, 101, 1628276516031L, "my 8 bit adder", 7L, 29L, 27, 43));
        this.f13955a.add(new C1797d(R.raw.s102, 102, 1628276516031L, "4 Bit Full Adder", 10L, 37L, 34, 54));
        this.f13955a.add(new C1797d(R.raw.s103, 103, 1628276516031L, "Half, full adder", 7L, 37L, 14, 16));
        this.f13955a.add(new C1797d(R.raw.s104, 104, 1628276516031L, "generator", 11L, 65L, 1, 0));
        this.f13955a.add(new C1797d(R.raw.s105, 105, 1628276516031L, "3 state AND Gate", 9L, 31L, 4, 3));
        this.f13955a.add(new C1797d(R.raw.s106, 106, 1628276516031L, "Ring Counter By Prof. Moin Shaikh", 7L, 51L, 11, 20));
        this.f13955a.add(new C1797d(R.raw.s107, 107, 1628883728719L, "Full-Adder using half-adder", 5L, 20L, 3, 6));
        this.f13955a.add(new C1797d(R.raw.s108, 108, 1628883728719L, "4-Bit Computer", 24L, 153L, 193, 650));
        this.f13955a.add(new C1797d(R.raw.s109, 109, 1628883728719L, "Basic Binary Arithmetic Unit", 6L, 41L, 34, 34));
        this.f13955a.add(new C1797d(R.raw.s110, 110, 1628883728719L, "RAM 8x1", 9L, 83L, 14, 30));
        this.f13955a.add(new C1797d(R.raw.s111, 111, 1628883728719L, "4*1 MUX", 7L, 36L, 15, 24));
        this.f13955a.add(new C1797d(R.raw.s112, 112, 1628883728719L, "8-bit calc half adder", 7L, 55L, 104, 232));
        this.f13955a.add(new C1797d(R.raw.s113, 113, 1628883728719L, "byte", 7L, 34L, 33, 32));
        this.f13955a.add(new C1797d(R.raw.s114, 114, 1628883728719L, "мото гудок со светом", 5L, 29L, 8, 5));
        this.f13955a.add(new C1797d(R.raw.s115, 115, 1628883728719L, "мото гудок со светом 2", 8L, 40L, 7, 5));
        this.f13955a.add(new C1797d(R.raw.s116, 116, 1628883728719L, "semáforo", 9L, 49L, 7, 10));
        this.f13955a.add(new C1797d(R.raw.s117, 117, 1628883728719L, "Project 3", 7L, 29L, 14, 20));
        this.f13955a.add(new C1797d(R.raw.s118, 118, 1628883728719L, "Metal detector", 10L, 116L, 8, 9));
        this.f13955a.add(new C1797d(R.raw.s119, 119, 1628883728719L, "BCD 2 digit decimal", 10L, 84L, 60, 165));
        this.f13955a.add(new C1797d(R.raw.s120, 120, 1629481399053L, "sk Mafiz", 6L, 17L, 9, 41));
        this.f13955a.add(new C1797d(R.raw.s121, 121, 1629481399053L, "circuito en serie", 8L, 21L, 5, 5));
        this.f13955a.add(new C1797d(R.raw.s122, 122, 1629481399053L, "Adv. Toggle", 5L, 11L, 1, 2));
        this.f13955a.add(new C1797d(R.raw.s123, 123, 1629481399053L, "4BIT SUPER NOT", 6L, 11L, 4, 18));
        this.f13955a.add(new C1797d(R.raw.s124, 124, 1629481399053L, "Project 1", 7L, 18L, 8, 14));
        this.f13955a.add(new C1797d(R.raw.s125, 125, 1629481399053L, "LED marks", 7L, 21L, 9, 19));
        this.f13955a.add(new C1797d(R.raw.s126, 126, 1629481399053L, "ALU", 5L, 30L, 6, 32));
        this.f13955a.add(new C1797d(R.raw.s127, 127, 1629481399053L, "双向三态门", 6L, 19L, 17, 32));
        this.f13955a.add(new C1797d(R.raw.s128, 128, 1629481399053L, "circuito paralelo", 6L, 20L, 5, 7));
        this.f13955a.add(new C1797d(R.raw.s129, 129, 1629481399053L, "чип", 6L, 17L, 6, 12));
        this.f13955a.add(new C1797d(R.raw.s130, 130, 1629481399053L, "2BIT HALF ADDER", 6L, 13L, 4, 12));
        this.f13955a.add(new C1797d(R.raw.s131, 131, 1629481399053L, "Project 18", 6L, 23L, 8, 29));
        this.f13955a.add(new C1797d(R.raw.s132, 132, 1629481399053L, "Toggle", 5L, 11L, 1, 2));
        this.f13955a.add(new C1797d(R.raw.s133, 133, 1629481399053L, "4BIT HELF ADDER", 5L, 13L, 2, 16));
        this.f13955a.add(new C1797d(R.raw.s134, 134, 1629481399053L, "SUPER NOT", 6L, 18L, 6, 5));
        this.f13955a.add(new C1797d(R.raw.s135, 135, 1629481399053L, "light control by voice(do 👏 to turn it on)", 8L, 88L, 6, 6));
        this.f13955a.add(new C1797d(R.raw.s136, 136, 1629481399053L, "Dec. U/D Counter Test", 7L, 29L, 13, 28));
        this.f13955a.add(new C1797d(R.raw.s137, 137, 1629481399053L, "Project 0", 6L, 16L, 4, 6));
        this.f13955a.add(new C1797d(R.raw.s138, 138, 1629481399053L, "Full subtractor", 9L, 67L, 12, 14));
        this.f13955a.add(new C1797d(R.raw.s139, 139, 1629481399053L, "lamp v koi", 11L, 48L, 8, 9));
        this.f13955a.add(new C1797d(R.raw.s140, 140, 1630150304071L, "SAFE PIANO P.6", 5L, 26L, 8, 9));
        this.f13955a.add(new C1797d(R.raw.s141, 141, 1630150304071L, "SN74HCOOD", 3L, 8L, 4, 13));
        this.f13955a.add(new C1797d(R.raw.s142, 142, 1630150304071L, "INCLINER SENSOR", 4L, 16L, 7, 8));
        this.f13955a.add(new C1797d(R.raw.s143, 143, 1630150304071L, "BYTE Multiplier v2t", 3L, 15L, 58, 86));
        this.f13955a.add(new C1797d(R.raw.s144, 144, 1630150304071L, "ALU with everything labeled", 4L, 17L, 80, 105));
        this.f13955a.add(new C1797d(R.raw.s145, 145, 1630150304071L, "4*1 Mux", 3L, 10L, 10, 10));
        this.f13955a.add(new C1797d(R.raw.s146, 146, 1630150304071L, "vsc ALU", 4L, 16L, 22, 66));
        this.f13955a.add(new C1797d(R.raw.s147, 147, 1630150304071L, "Load degree", 3L, 9L, 8, 13));
        this.f13955a.add(new C1797d(R.raw.s148, 148, 1630150304071L, "2*1 MUX", 3L, 9L, 8, 8));
        this.f13955a.add(new C1797d(R.raw.s149, 149, 1630150304071L, "2's complement", 3L, 9L, 3, 9));
        this.f13955a.add(new C1797d(R.raw.s150, 150, 1630150304071L, "Demorgan 1st theorem", 5L, 10L, 6, 5));
        this.f13955a.add(new C1797d(R.raw.s151, 151, 1630150304071L, "8-bit subtracter", 4L, 12L, 29, 74));
        this.f13955a.add(new C1797d(R.raw.s152, 152, 1630150304071L, "serena 2.7", 3L, 25L, 5, 8));
        this.f13955a.add(new C1797d(R.raw.s153, 153, 1630150304071L, "LED   R   G   B", 4L, 19L, 8, 14));
        this.f13955a.add(new C1797d(R.raw.s154, 154, 1630150304071L, "BYTE Multiplier v1.0", 3L, 22L, 65, 91));
        this.f13955a.add(new C1797d(R.raw.s155, 155, 1630150304071L, "ニュートラル検出装置(NAND)", 3L, 17L, 57, 100));
        this.f13955a.add(new C1797d(R.raw.s156, 156, 1630150304071L, "Talent Show System", 4L, 21L, 45, 38));
        this.f13955a.add(new C1797d(R.raw.s157, 157, 1630150304071L, "Mic Testing", 5L, 22L, 11, 10));
        this.f13955a.add(new C1797d(R.raw.s158, 158, 1630150304071L, "==", 3L, 8L, 15, 14));
        this.f13955a.add(new C1797d(R.raw.s159, 159, 1630150304071L, "sumador completo", 4L, 12L, 32, 42));
        this.f13955a.add(new C1797d(R.raw.s160, 160, 1630150304071L, "PROCESSOR", 4L, 30L, 2, 9));
        this.f13955a.add(new C1797d(R.raw.s161, 161, 1630150304071L, "Warning System.", 3L, 35L, 16, 22));
        this.f13955a.add(new C1797d(R.raw.s162, 162, 1630150304071L, "FESTA LED", 3L, 14L, 8, 9));
        this.f13955a.add(new C1797d(R.raw.s163, 163, 1630150304071L, "1's complement", 5L, 9L, 24, 16));
        this.f13955a.add(new C1797d(R.raw.s164, 164, 1630150304071L, "A processor that converts from binary to decimal notation", 4L, 21L, 5, 14));
        this.f13955a.add(new C1797d(R.raw.s165, 165, 1630150304071L, "8-bit and gate", 3L, 10L, 8, 0));
        this.f13955a.add(new C1797d(R.raw.s166, 166, 1630150304071L, "Boolean 3", 4L, 15L, 22, 19));
        this.f13955a.add(new C1797d(R.raw.s167, 167, 1630150304071L, "16-bit adder", 5L, 13L, 4, 11));
        this.f13955a.add(new C1797d(R.raw.s168, 168, 1630150304071L, "Drum pad 🥁🥁🥁🥁", 5L, 41L, 17, 20));
        this.f13955a.add(new C1797d(R.raw.s169, 169, 1630150304071L, "0 to F simple", 3L, 23L, 8, 22));
        this.f13955a.add(new C1797d(R.raw.s170, 170, 1630150304071L, "Talent Show System 2", 4L, 33L, 68, 64));
        this.f13955a.add(new C1797d(R.raw.s171, 171, 1630150304071L, "my flip flop", 6L, 19L, 9, 11));
        this.f13955a.add(new C1797d(R.raw.s172, 172, 1630698000625L, "D FF 8-bit register", 4L, 11L, 9, 8));
        this.f13955a.add(new C1797d(R.raw.s173, 173, 1630698000625L, "Yuvan project 6", 2L, 13L, 4, 11));
        this.f13955a.add(new C1797d(R.raw.s174, 174, 1630698000625L, "Yuvan project 1", 3L, 9L, 5, 5));
        this.f13955a.add(new C1797d(R.raw.s175, 175, 1630698000625L, "Equals", 3L, 11L, 3, 17));
        this.f13955a.add(new C1797d(R.raw.s176, 176, 1630698000625L, "Yuvan project 7", 5L, 12L, 9, 7));
        this.f13955a.add(new C1797d(R.raw.s177, 177, 1630698000625L, "decimal audio level counter", 3L, 19L, 50, 84));
        this.f13955a.add(new C1797d(R.raw.s178, 178, 1630698000625L, "Inputs and outputs", 3L, 14L, 4, 12));
        this.f13955a.add(new C1797d(R.raw.s179, 179, 1630698000625L, "Buffer", 3L, 12L, 4, 0));
        this.f13955a.add(new C1797d(R.raw.s180, 180, 1630698000625L, "D097/20( project using multiplexer)", 3L, 10L, 8, 7));
        this.f13955a.add(new C1797d(R.raw.s181, 181, 1630698000625L, "Yuvan ", 3L, 8L, 5, 8));
        this.f13955a.add(new C1797d(R.raw.s182, 182, 1630698000625L, "Yuvan project 9", 3L, 11L, 6, 11));
        this.f13955a.add(new C1797d(R.raw.s183, 183, 1630698000625L, "Yuvan project 5", 3L, 11L, 5, 3));
        this.f13955a.add(new C1797d(R.raw.s184, 184, 1630698000625L, "Projeto led", 4L, 10L, 6, 6));
        this.f13955a.add(new C1797d(R.raw.s185, 185, 1630698000625L, "Yuvan project 8", 3L, 10L, 5, 13));
        this.f13955a.add(new C1797d(R.raw.s186, 186, 1630698000625L, "Project 1", 4L, 8L, 16, 21));
        this.f13955a.add(new C1797d(R.raw.s187, 187, 1630698000625L, "Project 1", 3L, 10L, 11, 8));
        this.f13955a.add(new C1797d(R.raw.s188, 188, 1630698000625L, "Expt 1 Verification of logic gates 1", 5L, 15L, 27, 20));
        this.f13955a.add(new C1797d(R.raw.s189, 189, 1630698000625L, "DEMORGANME2", 7L, 8L, 9, 12));
        this.f13955a.add(new C1797d(R.raw.s190, 190, 1630698000625L, "Project 3", 4L, 10L, 5, 4));
        this.f13955a.add(new C1797d(R.raw.s191, 191, 1630698000625L, "lampy RGB", 6L, 18L, 8, 9));
        this.f13955a.add(new C1797d(R.raw.s192, 192, 1630698000625L, "JustSome flip-flop muxes", 3L, 13L, 27, 47));
        this.f13955a.add(new C1797d(R.raw.s193, 193, 1630698000625L, "Проект 1", 5L, 23L, 13, 12));
        this.f13955a.add(new C1797d(R.raw.s194, 194, 1630698000625L, "Expt 1 Verification of logic gates 1", 5L, 12L, 27, 20));
        this.f13955a.add(new C1797d(R.raw.s195, 195, 1630698000625L, "Load degree", 5L, 16L, 8, 13));
        this.f13955a.add(new C1797d(R.raw.s196, 196, 1630698000625L, "disco voice", 4L, 25L, 8, 33));
        this.f13955a.add(new C1797d(R.raw.s197, 197, 1630698000625L, "Yuvan project 2", 3L, 11L, 7, 20));
        this.f13955a.add(new C1797d(R.raw.s198, 198, 1630698000625L, "Yuvan project 3", 4L, 21L, 7, 16));
        this.f13955a.add(new C1797d(R.raw.s199, 199, 1630698000625L, "Operador logico elemental", 3L, 14L, 18, 19));
        this.f13955a.add(new C1797d(R.raw.s200, 200, 1630698000625L, "multiplexer", 6L, 18L, 7, 12));
        this.f13955a.add(new C1797d(R.raw.s201, 201, 1630698000625L, "Lock", 6L, 37L, 18, 33));
        this.f13955a.add(new C1797d(R.raw.s202, 202, 1630698000625L, "Flip-Flop", 9L, 23L, 12, 19));
        this.f13955a.add(new C1797d(R.raw.s203, 203, 1631383633069L, "Project 3", 2L, 13L, 6, 7));
        this.f13955a.add(new C1797d(R.raw.s204, 204, 1631383633069L, "Trafficlight 4 way", 3L, 14L, 28, 57));
        this.f13955a.add(new C1797d(R.raw.s205, 205, 1631383633069L, "3 input XOR", 2L, 14L, 6, 10));
        this.f13955a.add(new C1797d(R.raw.s206, 206, 1631383633069L, "CHIP 8 BIT LATCH", 2L, 12L, 19, 49));
        this.f13955a.add(new C1797d(R.raw.s207, 207, 1631383633069L, "SOS", 4L, 16L, 2, 1));
        this.f13955a.add(new C1797d(R.raw.s208, 208, 1631383633069L, "Sound Detector", 3L, 29L, 21, 26));
        this.f13955a.add(new C1797d(R.raw.s209, 209, 1631383633069L, "wyprostuj swój tablet lub telefon", 3L, 10L, 5, 4));
        this.f13955a.add(new C1797d(R.raw.s210, 210, 1631383633069L, "CHIP 2 Bit Comp", 3L, 8L, 23, 54));
        this.f13955a.add(new C1797d(R.raw.s211, 211, 1631383633069L, "Red-green light auto switching", 3L, 12L, 8, 14));
        this.f13955a.add(new C1797d(R.raw.s212, 212, 1631383633069L, "Generator", 2L, 14L, 6, 0));
        this.f13955a.add(new C1797d(R.raw.s213, 213, 1631383633069L, "CHIP 12 Bit Comp", 3L, 11L, 46, 71));
        this.f13955a.add(new C1797d(R.raw.s214, 214, 1631383633069L, "CHIP 3BTo7Seg", 3L, 13L, 46, 87));
        this.f13955a.add(new C1797d(R.raw.s215, 215, 1631383633069L, "Hari Project 7", 5L, 7L, 22, 35));
        this.f13955a.add(new C1797d(R.raw.s216, 216, 1631383633069L, "CHIP 4 Bit Equality", 3L, 12L, 15, 14));
        this.f13955a.add(new C1797d(R.raw.s217, 217, 1631383633069L, "D FF 8-bit register", 5L, 9L, 9, 8));
        this.f13955a.add(new C1797d(R.raw.s218, 218, 1631383633069L, "7 color LED bulb (part 1)", 3L, 19L, 15, 20));
        this.f13955a.add(new C1797d(R.raw.s219, 219, 1631383633069L, "CHIP 4/16 Decoder", 3L, 17L, 8, 23));
        this.f13955a.add(new C1797d(R.raw.s220, 220, 1631383633069L, "ALU", 10L, 25L, 122, 130));
        this.f13955a.add(new C1797d(R.raw.s221, 221, 1631383633069L, "CHIP 4 Bit Comp", 5L, 27L, 41, 63));
        this.f13955a.add(new C1797d(R.raw.s222, 222, 1631978511181L, "💙🖐️💡✔️😍", 4L, 20L, 8, 21));
        this.f13955a.add(new C1797d(R.raw.s223, 223, 1631978511181L, "RAM 16x8bit", 3L, 28L, 32, 321));
        this.f13955a.add(new C1797d(R.raw.s224, 224, 1631978511181L, "процессор в3", 1L, 10L, 1, 0));
        this.f13955a.add(new C1797d(R.raw.s225, 225, 1631978511181L, "Flashlight Trigger", 3L, 21L, 4, 6));
        this.f13955a.add(new C1797d(R.raw.s226, 226, 1631978511181L, "circuito uscito", 1L, 11L, 4, 13));
        this.f13955a.add(new C1797d(R.raw.s227, 227, 1631978511181L, "Project 4", 1L, 16L, 7, 8));
        this.f13955a.add(new C1797d(R.raw.s228, 228, 1631978511181L, "74LS48(1-9)", 4L, 16L, 20, 46));
        this.f13955a.add(new C1797d(R.raw.s229, 229, 1631978511181L, "binary to Gray convertor", 4L, 28L, 11, 14));
        this.f13955a.add(new C1797d(R.raw.s230, 230, 1631978511181L, "Proyecto 9", 6L, 48L, 17, 24));
        this.f13955a.add(new C1797d(R.raw.s231, 231, 1633960339979L, "8-bit Processing Unit", 0L, 0L, 43, 162));
        this.f13955a.add(new C1797d(R.raw.s232, 232, 1633960339979L, "Full Subtractor", 0L, 0L, 23, 14));
        this.f13955a.add(new C1797d(R.raw.s233, 233, 1633960339979L, "IC 7402 (NOR)", 0L, 0L, 4, 0));
        this.f13955a.add(new C1797d(R.raw.s234, 234, 1633960339979L, "Flip flops using NAND gates", 0L, 0L, 62, 53));
        this.f13955a.add(new C1797d(R.raw.s235, 235, 1633960339979L, "Music with lights", 0L, 0L, 23, 34));
        this.f13955a.add(new C1797d(R.raw.s236, 236, 1633960339979L, "RAM 2 байта (хауиуи)", 0L, 0L, 32, 64));
        this.f13955a.add(new C1797d(R.raw.s237, 237, 1633960339979L, "clock 0.25 Hz", 0L, 0L, 4, 5));
        this.f13955a.add(new C1797d(R.raw.s238, 238, 1633960339979L, "IC 7408 (AND)", 0L, 0L, 4, 0));
        this.f13955a.add(new C1797d(R.raw.s239, 239, 1633960339979L, "On / Off Button Using JK Latch And 'And Gate'", 0L, 0L, 8, 22));
        this.f13955a.add(new C1797d(R.raw.s240, 240, 1633960339979L, "Multiplexer", 0L, 0L, 33, 21));
        this.f13955a.add(new C1797d(R.raw.s241, 241, 1633960339979L, "Johnson Counter", 0L, 0L, 9, 13));
        this.f13955a.add(new C1797d(R.raw.s242, 242, 1633960339979L, "saksham sasulkar OR gate", 0L, 0L, 8, 3));
        this.f13955a.add(new C1797d(R.raw.s243, 243, 1633960339979L, "Program Counter", 0L, 0L, 25, 45));
        this.f13955a.add(new C1797d(R.raw.s244, 244, 1633960339979L, "Digital Clock", 0L, 0L, 56, 167));
        this.f13955a.add(new C1797d(R.raw.s245, 245, 1633960339979L, "one hour clock", 0L, 0L, 23, 70));
        this.f13955a.add(new C1797d(R.raw.s246, 246, 1633960339979L, "Flip-Flop", 0L, 0L, 23, 18));
        this.f13955a.add(new C1797d(R.raw.s247, 247, 1633960339979L, "siren", 0L, 0L, 7, 7));
        this.f13955a.add(new C1797d(R.raw.s248, 248, 1633960339979L, "Project 17", 0L, 0L, 14, 110));
        this.f13955a.add(new C1797d(R.raw.s249, 249, 1633960339979L, "PENGUKUR SUARA", 0L, 0L, 3, 22));
        this.f13955a.add(new C1797d(R.raw.s250, 250, 1633960339979L, "RGB Battery", 0L, 0L, 7, 13));
        this.f13955a.add(new C1797d(R.raw.s251, 251, 1633960339979L, "IC 7432 (OR)", 0L, 0L, 4, 0));
        this.f13955a.add(new C1797d(R.raw.s252, 252, 1633960339979L, "NOT GATE", 0L, 0L, 3, 2));
        this.f13955a.add(new C1797d(R.raw.s253, 253, 1633960339979L, "Binary to Decimal 7-Segment Display", 0L, 0L, 4, 18));
        this.f13955a.add(new C1797d(R.raw.s254, 254, 1633960339979L, "шына 4 разрядная(хауиуи)", 0L, 0L, 4, 7));
        this.f13955a.add(new C1797d(R.raw.s255, 255, 1633960339979L, "Ring Counter", 0L, 0L, 10, 14));
        this.f13955a.add(new C1797d(R.raw.s256, 256, 1633960339979L, "Flash and Vibrate", 0L, 0L, 9, 10));
        this.f13955a.add(new C1797d(R.raw.s257, 257, 1633960339979L, "De-Multiplexer", 0L, 0L, 54, 18));
        this.f13955a.add(new C1797d(R.raw.s258, 258, 1633960339979L, "GROUND UP", 0L, 0L, 31, 32));
        this.f13955a.add(new C1797d(R.raw.s259, 259, 1633960339979L, "Meio somador", 0L, 0L, 2, 4));
        this.f13955a.add(new C1797d(R.raw.s260, 260, 1633960339979L, "full battery detector v2", 0L, 0L, 8, 16));
        this.f13955a.add(new C1797d(R.raw.s261, 261, 1633960339979L, "ligh alarm", 0L, 0L, 14, 21));
        this.f13955a.add(new C1797d(R.raw.s262, 262, 1633960339979L, "Using a 4BIT ADDER", 0L, 0L, 15, 14));
        this.f13955a.add(new C1797d(R.raw.s263, 263, 1633960339979L, "VPN", 0L, 0L, 6, 6));
        this.f13955a.add(new C1797d(R.raw.s264, 264, 1633960339979L, "semaforo", 0L, 0L, 7, 15));
        this.f13955a.add(new C1797d(R.raw.s265, 265, 1633960339979L, "Sr latchs", 0L, 0L, 66, 50));
        this.f13955a.add(new C1797d(R.raw.s266, 266, 1633960339979L, "multiplexer", 0L, 0L, 48, 21));
        this.f13955a.add(new C1797d(R.raw.s267, 267, 1633960339979L, "IC 7404 (NOT)", 0L, 0L, 6, 0));
        this.f13955a.add(new C1797d(R.raw.s268, 268, 1633960339979L, "Double Ringing Doorbell", 0L, 0L, 6, 8));
        this.f13955a.add(new C1797d(R.raw.s269, 269, 1633960339979L, "RGB with one input switch.", 0L, 0L, 7, 11));
        this.f13955a.add(new C1797d(R.raw.s270, 270, 1633960339979L, "number display", 0L, 0L, 8, 7));
        this.f13955a.add(new C1797d(R.raw.s271, 271, 1633960339979L, "Add/Sub Calculator v1", 0L, 0L, 98, 287));
        this.f13955a.add(new C1797d(R.raw.s272, 272, 1633960339979L, "sensor lighting", 0L, 0L, 3, 3));
        this.f13955a.add(new C1797d(R.raw.s273, 273, 1633960339979L, "All Flip-Flop", 0L, 0L, 23, 18));
        this.f13955a.add(new C1797d(R.raw.s274, 274, 1633960339979L, "IC 7483", 0L, 0L, 4, 3));
        this.f13955a.add(new C1797d(R.raw.s275, 275, 1633960339979L, "LCSP CLUB - SUPER ELEMENTS", 0L, 0L, 107, 124));
        this.f13955a.add(new C1797d(R.raw.s276, 276, 1633960339979L, "10010 overlapped Moore machine", 0L, 0L, 25, 29));
        this.f13955a.add(new C1797d(R.raw.s277, 277, 1633960339979L, "7408 IC", 0L, 0L, 4, 0));
        a();
    }
}
