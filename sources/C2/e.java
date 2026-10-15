package C2;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f514a;
    public TimeInterpolator c = null;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f516e = 1;

    /* renamed from: b, reason: collision with root package name */
    public long f515b = 150;

    public e(long j4) {
        this.f514a = j4;
    }

    public final void a(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.f514a);
        objectAnimator.setDuration(this.f515b);
        objectAnimator.setInterpolator(b());
        objectAnimator.setRepeatCount(this.d);
        objectAnimator.setRepeatMode(this.f516e);
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : a.f508b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f514a == eVar.f514a && this.f515b == eVar.f515b && this.d == eVar.d && this.f516e == eVar.f516e) {
            return b().getClass().equals(eVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f514a;
        long j5 = this.f515b;
        return ((((b().getClass().hashCode() + (((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) ((j5 >>> 32) ^ j5))) * 31)) * 31) + this.d) * 31) + this.f516e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(e.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f514a);
        sb.append(" duration: ");
        sb.append(this.f515b);
        sb.append(" interpolator: ");
        sb.append(b().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.d);
        sb.append(" repeatMode: ");
        return U.a.l(sb, this.f516e, "}\n");
    }
}
