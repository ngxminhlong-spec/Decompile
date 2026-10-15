package v1;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseArray f15082o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ t[] f15083p;

    /* JADX INFO: Fake field, exist only in values array */
    t EF0;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Enum r02 = new Enum("UNKNOWN_MOBILE_SUBTYPE", 0);
        Enum r1 = new Enum("GPRS", 1);
        Enum r32 = new Enum("EDGE", 2);
        Enum r5 = new Enum("UMTS", 3);
        Enum r7 = new Enum("CDMA", 4);
        Enum r9 = new Enum("EVDO_0", 5);
        Enum r11 = new Enum("EVDO_A", 6);
        Enum r13 = new Enum("RTT", 7);
        Enum r15 = new Enum("HSDPA", 8);
        Enum r14 = new Enum("HSUPA", 9);
        Enum r12 = new Enum("HSPA", 10);
        Enum r10 = new Enum("IDEN", 11);
        Enum r8 = new Enum("EVDO_B", 12);
        Enum r6 = new Enum("LTE", 13);
        Enum r4 = new Enum("EHRPD", 14);
        Enum r22 = new Enum("HSPAP", 15);
        Enum r62 = new Enum("GSM", 16);
        Enum r42 = new Enum("TD_SCDMA", 17);
        Enum r23 = new Enum("IWLAN", 18);
        Enum r63 = new Enum("LTE_CA", 19);
        f15083p = new t[]{r02, r1, r32, r5, r7, r9, r11, r13, r15, r14, r12, r10, r8, r6, r4, r22, r62, r42, r23, r63, new Enum("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f15082o = sparseArray;
        sparseArray.put(0, r02);
        sparseArray.put(1, r1);
        sparseArray.put(2, r32);
        sparseArray.put(3, r5);
        sparseArray.put(4, r7);
        sparseArray.put(5, r9);
        sparseArray.put(6, r11);
        sparseArray.put(7, r13);
        sparseArray.put(8, r15);
        sparseArray.put(9, r14);
        sparseArray.put(10, r12);
        sparseArray.put(11, r10);
        sparseArray.put(12, r8);
        sparseArray.put(13, r6);
        sparseArray.put(14, r4);
        sparseArray.put(15, r22);
        sparseArray.put(16, r62);
        sparseArray.put(17, r42);
        sparseArray.put(18, r23);
        sparseArray.put(19, r63);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f15083p.clone();
    }
}
