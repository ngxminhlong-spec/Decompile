package M;

import I.g;
import android.graphics.Rect;
import java.util.Comparator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1115o = new Rect();

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1116p = new Rect();

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1117q;

    /* renamed from: r, reason: collision with root package name */
    public final V2.e f1118r;

    public c(boolean z4, V2.e eVar) {
        this.f1117q = z4;
        this.f1118r = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f1118r.getClass();
        Rect rect = this.f1115o;
        ((g) obj).f(rect);
        Rect rect2 = this.f1116p;
        ((g) obj2).f(rect2);
        int i4 = rect.top;
        int i5 = rect2.top;
        if (i4 < i5) {
            return -1;
        }
        if (i4 > i5) {
            return 1;
        }
        int i6 = rect.left;
        int i7 = rect2.left;
        boolean z4 = this.f1117q;
        if (i6 < i7) {
            return z4 ? 1 : -1;
        }
        if (i6 > i7) {
            return z4 ? -1 : 1;
        }
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        if (i8 < i9) {
            return -1;
        }
        if (i8 > i9) {
            return 1;
        }
        int i10 = rect.right;
        int i11 = rect2.right;
        if (i10 < i11) {
            return z4 ? 1 : -1;
        }
        if (i10 > i11) {
            return z4 ? -1 : 1;
        }
        return 0;
    }
}
