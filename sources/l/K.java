package l;

import android.graphics.Typeface;
import android.os.Build;
import java.lang.ref.WeakReference;
import z.AbstractC2123b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class K extends AbstractC2123b {

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f13644e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13645f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13646g;

    public K(L l4, int i4, int i5) {
        this.f13644e = new WeakReference(l4);
        this.f13645f = i4;
        this.f13646g = i5;
    }

    @Override // z.AbstractC2123b
    public final void h(int i4) {
    }

    @Override // z.AbstractC2123b
    public final void i(Typeface typeface) {
        int i4;
        WeakReference weakReference = this.f13644e;
        L l4 = (L) weakReference.get();
        if (l4 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && (i4 = this.f13645f) != -1) {
            typeface = Typeface.create(typeface, i4, (this.f13646g & 2) != 0);
        }
        l4.f13648a.post(new RunnableC1767g(weakReference, typeface));
    }
}
