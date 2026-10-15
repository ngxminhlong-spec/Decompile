package h;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: h.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1690d implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public int[] f13077a;

    /* renamed from: b, reason: collision with root package name */
    public int f13078b;
    public int c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f4) {
        int i4 = (int) ((f4 * this.c) + 0.5f);
        int i5 = this.f13078b;
        int[] iArr = this.f13077a;
        int i6 = 0;
        while (i6 < i5) {
            int i7 = iArr[i6];
            if (i4 < i7) {
                break;
            }
            i4 -= i7;
            i6++;
        }
        return (i6 / i5) + (i6 < i5 ? i4 / this.c : 0.0f);
    }
}
