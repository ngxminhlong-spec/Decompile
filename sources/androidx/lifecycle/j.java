package androidx.lifecycle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public g f2974a;

    /* renamed from: b, reason: collision with root package name */
    public h f2975b;

    public final void a(i iVar, f fVar) {
        g a4 = fVar.a();
        g gVar = this.f2974a;
        S3.e.e(gVar, "state1");
        if (a4.compareTo(gVar) < 0) {
            gVar = a4;
        }
        this.f2974a = gVar;
        this.f2975b.a(iVar, fVar);
        this.f2974a = a4;
    }
}
