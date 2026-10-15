package L1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1075a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1076b;

    public a(String str, boolean z4) {
        this.f1075a = str;
        this.f1076b = z4;
    }

    public final String toString() {
        String str = this.f1075a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("{");
        sb.append(str);
        sb.append("}");
        sb.append(this.f1076b);
        return sb.toString();
    }
}
