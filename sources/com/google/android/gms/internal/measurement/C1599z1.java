package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1599z1 implements InterfaceC1556o1 {

    /* renamed from: q, reason: collision with root package name */
    public static final F1 f12122q = new F1(1);

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12123o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f12124p;

    public C1599z1(int i4) {
        InterfaceC1506d2 interfaceC1506d2;
        this.f12123o = i4;
        switch (i4) {
            case 4:
                this.f12124p = new HashMap();
                return;
            default:
                try {
                    interfaceC1506d2 = (InterfaceC1506d2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC1506d2 = f12122q;
                }
                Z1 z12 = new Z1(F1.f11729b, interfaceC1506d2);
                Charset charset = O1.f11796a;
                this.f12124p = z12;
                return;
        }
    }

    public /* synthetic */ C1599z1(int i4, Object obj) {
        this.f12123o = i4;
        this.f12124p = obj;
    }

    public C1599z1(C1595y1 c1595y1) {
        this.f12123o = 0;
        Charset charset = O1.f11796a;
        this.f12124p = c1595y1;
        c1595y1.f12118b = this;
    }

    public void a(int i4, int i5) {
        C1595y1 c1595y1 = (C1595y1) this.f12124p;
        c1595y1.W(i4 << 3);
        c1595y1.W((i5 >> 31) ^ (i5 + i5));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:8|(4:10|(1:12)|13|14)|15|(4:17|(1:19)|13|14)|20|(1:22)(1:94)|(2:24|(1:26))|27|28|29|30|31|32|(1:34)(1:86)|35|(6:37|38|39|40|41|(2:42|(3:44|(3:59|60|61)(7:46|47|(2:49|(1:52))|53|(1:55)|56|57)|58)(4:62|63|64|65)))(1:85)|66|14) */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0080, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0081, code lost:
    
        android.util.Log.e("HermeticFileOverrides", "no data dir", r0);
        r6 = com.google.android.gms.internal.measurement.C1544l1.f11964o;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [r.i] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1556o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1599z1.b():java.lang.Object");
    }

    public void c(int i4, long j4) {
        ((C1595y1) this.f12124p).X(i4, (j4 >> 63) ^ (j4 + j4));
    }

    public void d(int i4, C1591x1 c1591x1) {
        ((C1595y1) this.f12124p).P(i4, c1591x1);
    }

    public void e(int i4, Object obj, InterfaceC1549m2 interfaceC1549m2) {
        C1595y1 c1595y1 = (C1595y1) this.f12124p;
        c1595y1.V(i4, 3);
        interfaceC1549m2.e((AbstractC1571s1) obj, c1595y1.f12118b);
        c1595y1.V(i4, 4);
    }

    public void f(int i4, Object obj, InterfaceC1549m2 interfaceC1549m2) {
        C1595y1 c1595y1 = (C1595y1) this.f12124p;
        AbstractC1571s1 abstractC1571s1 = (AbstractC1571s1) obj;
        c1595y1.W((i4 << 3) | 2);
        I1 i12 = (I1) abstractC1571s1;
        int i5 = i12.zzd;
        if (i5 == -1) {
            i5 = interfaceC1549m2.l(abstractC1571s1);
            i12.zzd = i5;
        }
        c1595y1.W(i5);
        interfaceC1549m2.e(abstractC1571s1, c1595y1.f12118b);
    }
}
