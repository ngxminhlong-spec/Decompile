package t;

import com.google.android.gms.internal.ads.C0668gu;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Object f14832a;

    /* renamed from: b, reason: collision with root package name */
    public j f14833b;
    public k c;
    public boolean d;

    public final void finalize() {
        k kVar;
        j jVar = this.f14833b;
        if (jVar != null) {
            i iVar = jVar.f14836p;
            if (!iVar.isDone()) {
                iVar.k(new C0668gu("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f14832a, 2));
            }
        }
        if (this.d || (kVar = this.c) == null) {
            return;
        }
        kVar.j(null);
    }
}
