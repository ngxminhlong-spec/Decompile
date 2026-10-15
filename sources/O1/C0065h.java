package O1;

import android.content.Context;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065h extends AbstractC0079o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1356b;
    public final /* synthetic */ X0 c;
    public final /* synthetic */ String d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0077n f1357e;

    public C0065h(C0077n c0077n, Context context, X0 x02, String str) {
        this.f1357e = c0077n;
        this.f1356b = context;
        this.c = x02;
        this.d = str;
    }

    @Override // O1.AbstractC0079o
    public final Object a() {
        C0077n.d(this.f1356b, "search");
        return new I();
    }

    @Override // O1.AbstractC0079o
    public final Object b(Q q4) {
        return q4.k1(new BinderC1813b(this.f1356b), this.c, this.d, 234310000);
    }

    @Override // O1.AbstractC0079o
    public final /* bridge */ /* synthetic */ Object c() {
        return ((H0) this.f1357e.f1368o).n(this.f1356b, this.c, this.d, null, 3);
    }
}
