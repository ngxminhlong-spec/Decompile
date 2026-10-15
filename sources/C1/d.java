package C1;

import n3.n;
import w3.InterfaceC2053a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f472o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f473p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f474q;

    public /* synthetic */ d(int i4, Object obj, Object obj2) {
        this.f472o = i4;
        this.f473p = obj;
        this.f474q = obj2;
    }

    private final void a() {
        n nVar = (n) this.f473p;
        InterfaceC2053a interfaceC2053a = (InterfaceC2053a) this.f474q;
        synchronized (nVar) {
            try {
                if (nVar.f14139b == null) {
                    nVar.f14138a.add(interfaceC2053a);
                } else {
                    nVar.f14139b.add(interfaceC2053a.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0131  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.d.run():void");
    }
}
