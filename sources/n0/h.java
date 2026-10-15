package n0;

import android.app.Notification;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f14091a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14092b;
    public final Notification c;

    public h(int i4, Notification notification, int i5) {
        this.f14091a = i4;
        this.c = notification;
        this.f14092b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f14091a == hVar.f14091a && this.f14092b == hVar.f14092b) {
            return this.c.equals(hVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f14091a * 31) + this.f14092b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f14091a + ", mForegroundServiceType=" + this.f14092b + ", mNotification=" + this.c + '}';
    }
}
