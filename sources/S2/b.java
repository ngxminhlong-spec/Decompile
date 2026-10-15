package S2;

import android.graphics.Typeface;
import m2.AbstractC1806a;
import z.AbstractC2123b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends AbstractC2123b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC1806a f1764e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f1765f;

    public b(d dVar, AbstractC1806a abstractC1806a) {
        this.f1765f = dVar;
        this.f1764e = abstractC1806a;
    }

    @Override // z.AbstractC2123b
    public final void h(int i4) {
        this.f1765f.f1777k = true;
        this.f1764e.L(i4);
    }

    @Override // z.AbstractC2123b
    public final void i(Typeface typeface) {
        d dVar = this.f1765f;
        dVar.f1778l = Typeface.create(typeface, dVar.c);
        dVar.f1777k = true;
        this.f1764e.M(dVar.f1778l, false);
    }
}
