package Y;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2137a;

    public a(boolean z4) {
        this.f2137a = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f2137a == ((a) obj).f2137a;
    }

    public final int hashCode() {
        return 1169068184 + (this.f2137a ? 1231 : 1237);
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=com.google.android.gms.ads, shouldRecordObservation=" + this.f2137a;
    }
}
