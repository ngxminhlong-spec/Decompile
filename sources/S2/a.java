package S2;

import android.graphics.Typeface;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends AbstractC1806a {

    /* renamed from: n0, reason: collision with root package name */
    public final Typeface f1761n0;

    /* renamed from: o0, reason: collision with root package name */
    public final D3.d f1762o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f1763p0;

    public a(D3.d dVar, Typeface typeface) {
        this.f1761n0 = typeface;
        this.f1762o0 = dVar;
    }

    @Override // m2.AbstractC1806a
    public final void L(int i4) {
        if (this.f1763p0) {
            return;
        }
        P2.b bVar = (P2.b) this.f1762o0.f677p;
        a aVar = bVar.f1557v;
        if (aVar != null) {
            aVar.f1763p0 = true;
        }
        Typeface typeface = bVar.f1554s;
        Typeface typeface2 = this.f1761n0;
        if (typeface != typeface2) {
            bVar.f1554s = typeface2;
            bVar.g();
        }
    }

    @Override // m2.AbstractC1806a
    public final void M(Typeface typeface, boolean z4) {
        if (this.f1763p0) {
            return;
        }
        P2.b bVar = (P2.b) this.f1762o0.f677p;
        a aVar = bVar.f1557v;
        if (aVar != null) {
            aVar.f1763p0 = true;
        }
        if (bVar.f1554s != typeface) {
            bVar.f1554s = typeface;
            bVar.g();
        }
    }
}
