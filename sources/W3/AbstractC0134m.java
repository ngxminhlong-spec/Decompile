package W3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: W3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0134m extends L3.a implements L3.f {

    /* renamed from: p, reason: collision with root package name */
    public static final C0133l f2108p = new C0133l(L3.e.f1100o, C0132k.f2104s);

    public AbstractC0134m() {
        super(L3.e.f1100o);
    }

    @Override // L3.a, L3.i
    public final L3.g b(L3.h hVar) {
        L3.g a4;
        S3.e.e(hVar, "key");
        if (!(hVar instanceof C0133l)) {
            if (L3.e.f1100o == hVar) {
                return this;
            }
            return null;
        }
        C0133l c0133l = (C0133l) hVar;
        L3.h hVar2 = this.f1094o;
        if ((hVar2 == c0133l || c0133l.f2107p == hVar2) && (a4 = c0133l.a(this)) != null) {
            return a4;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r3.a(r2) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        return L3.j.f1101o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        if (L3.e.f1100o == r3) goto L15;
     */
    @Override // L3.a, L3.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final L3.i f(L3.h r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            S3.e.e(r3, r0)
            boolean r0 = r3 instanceof W3.C0133l
            if (r0 == 0) goto L1c
            W3.l r3 = (W3.C0133l) r3
            L3.h r0 = r2.f1094o
            if (r0 == r3) goto L15
            L3.h r1 = r3.f2107p
            if (r1 != r0) goto L14
            goto L15
        L14:
            return r2
        L15:
            L3.g r3 = r3.a(r2)
            if (r3 == 0) goto L23
            goto L20
        L1c:
            L3.e r0 = L3.e.f1100o
            if (r0 != r3) goto L23
        L20:
            L3.j r3 = L3.j.f1101o
            return r3
        L23:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.AbstractC0134m.f(L3.h):L3.i");
    }

    public abstract void g(L3.i iVar, Runnable runnable);

    public boolean h() {
        return !(this instanceof c0);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + r.d(this);
    }
}
