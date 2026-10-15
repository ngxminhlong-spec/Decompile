package V2;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f1850a;

    public a(float f4) {
        this.f1850a = f4;
    }

    @Override // V2.c
    public final float a(RectF rectF) {
        return this.f1850a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f1850a == ((a) obj).f1850a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1850a)});
    }
}
