package x1;

import android.content.Context;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15250a;

    /* renamed from: b, reason: collision with root package name */
    public final F1.a f15251b;
    public final F1.a c;
    public final String d;

    public b(Context context, F1.a aVar, F1.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f15250a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f15251b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f15250a.equals(bVar.f15250a) && this.f15251b.equals(bVar.f15251b) && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f15250a.hashCode() ^ 1000003) * 1000003) ^ this.f15251b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f15250a);
        sb.append(", wallClock=");
        sb.append(this.f15251b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return n0.a.j(sb, this.d, "}");
    }
}
