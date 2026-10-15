package x2;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2061a implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15521o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f15522p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f15523q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C2104w f15524r;

    public /* synthetic */ RunnableC2061a(C2104w c2104w, String str, long j4, int i4) {
        this.f15521o = i4;
        this.f15524r = c2104w;
        this.f15522p = str;
        this.f15523q = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15521o) {
            case 0:
                C2104w c2104w = this.f15524r;
                c2104w.g();
                String str = this.f15522p;
                h2.y.e(str);
                r.e eVar = c2104w.c;
                boolean isEmpty = eVar.isEmpty();
                long j4 = this.f15523q;
                if (isEmpty) {
                    c2104w.d = j4;
                }
                Integer num = (Integer) eVar.get(str);
                if (num != null) {
                    eVar.put(str, Integer.valueOf(num.intValue() + 1));
                    return;
                }
                if (eVar.f14741q < 100) {
                    eVar.put(str, 1);
                    c2104w.f15839b.put(str, Long.valueOf(j4));
                    return;
                } else {
                    K k3 = ((C2066c0) c2104w.f1719a).f15568i;
                    C2066c0.i(k3);
                    k3.f15397i.a("Too many ads visible");
                    return;
                }
            default:
                C2104w c2104w2 = this.f15524r;
                c2104w2.g();
                r.e eVar2 = c2104w2.f15839b;
                C2066c0 c2066c0 = (C2066c0) c2104w2.f1719a;
                String str2 = this.f15522p;
                h2.y.e(str2);
                r.e eVar3 = c2104w2.c;
                Integer num2 = (Integer) eVar3.get(str2);
                if (num2 == null) {
                    K k4 = c2066c0.f15568i;
                    C2066c0.i(k4);
                    k4.f15394f.b(str2, "Call to endAdUnitExposure for unknown ad unit id");
                    return;
                }
                C0 c02 = c2066c0.f15574o;
                K k5 = c2066c0.f15568i;
                C2066c0.h(c02);
                C2111z0 l4 = c02.l(false);
                int intValue = num2.intValue() - 1;
                if (intValue != 0) {
                    eVar3.put(str2, Integer.valueOf(intValue));
                    return;
                }
                eVar3.remove(str2);
                Long l5 = (Long) eVar2.get(str2);
                long j5 = this.f15523q;
                if (l5 == null) {
                    C2066c0.i(k5);
                    k5.f15394f.a("First ad unit exposure time was never set");
                } else {
                    long longValue = l5.longValue();
                    eVar2.remove(str2);
                    c2104w2.l(str2, j5 - longValue, l4);
                }
                if (eVar3.isEmpty()) {
                    long j6 = c2104w2.d;
                    if (j6 == 0) {
                        C2066c0.i(k5);
                        k5.f15394f.a("First ad exposure time was never set");
                        return;
                    } else {
                        c2104w2.k(j5 - j6, l4);
                        c2104w2.d = 0L;
                        return;
                    }
                }
                return;
        }
    }
}
