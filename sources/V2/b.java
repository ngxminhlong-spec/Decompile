package V2;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f1851a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1852b;

    public b(float f4, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f1851a;
            f4 += ((b) cVar).f1852b;
        }
        this.f1851a = cVar;
        this.f1852b = f4;
    }

    @Override // V2.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f1851a.a(rectF) + this.f1852b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1851a.equals(bVar.f1851a) && this.f1852b == bVar.f1852b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1851a, Float.valueOf(this.f1852b)});
    }
}
