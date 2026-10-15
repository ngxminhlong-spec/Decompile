package S2;

import android.graphics.Typeface;
import android.text.TextPaint;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c extends AbstractC1806a {

    /* renamed from: n0, reason: collision with root package name */
    public final /* synthetic */ TextPaint f1766n0;

    /* renamed from: o0, reason: collision with root package name */
    public final /* synthetic */ AbstractC1806a f1767o0;

    /* renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ d f1768p0;

    public c(d dVar, TextPaint textPaint, AbstractC1806a abstractC1806a) {
        this.f1768p0 = dVar;
        this.f1766n0 = textPaint;
        this.f1767o0 = abstractC1806a;
    }

    @Override // m2.AbstractC1806a
    public final void L(int i4) {
        this.f1767o0.L(i4);
    }

    @Override // m2.AbstractC1806a
    public final void M(Typeface typeface, boolean z4) {
        this.f1768p0.d(this.f1766n0, typeface);
        this.f1767o0.M(typeface, z4);
    }
}
