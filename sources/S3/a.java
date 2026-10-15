package S3;

import java.io.Serializable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class a implements T3.a, Serializable {

    /* renamed from: o, reason: collision with root package name */
    public transient T3.a f1779o;

    /* renamed from: p, reason: collision with root package name */
    public final Y3.j f1780p;

    /* renamed from: q, reason: collision with root package name */
    public final Class f1781q;

    /* renamed from: r, reason: collision with root package name */
    public final String f1782r;

    /* renamed from: s, reason: collision with root package name */
    public final String f1783s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1784t;

    public a(Y3.j jVar, Class cls, String str, String str2, boolean z4) {
        this.f1780p = jVar;
        this.f1781q = cls;
        this.f1782r = str;
        this.f1783s = str2;
        this.f1784t = z4;
    }

    public final b c() {
        boolean z4 = this.f1784t;
        Class cls = this.f1781q;
        if (z4) {
            i.f1791a.getClass();
            return new g(cls);
        }
        i.f1791a.getClass();
        return new c(cls);
    }
}
