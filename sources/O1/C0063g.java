package O1;

import android.content.Context;
import com.google.android.gms.internal.ads.InterfaceC1069q9;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063g extends AbstractC0079o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1353b;
    public final /* synthetic */ X0 c;
    public final /* synthetic */ String d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1069q9 f1354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0077n f1355f;

    public C0063g(C0077n c0077n, Context context, X0 x02, String str, InterfaceC1069q9 interfaceC1069q9) {
        this.f1355f = c0077n;
        this.f1353b = context;
        this.c = x02;
        this.d = str;
        this.f1354e = interfaceC1069q9;
    }

    @Override // O1.AbstractC0079o
    public final Object a() {
        C0077n.d(this.f1353b, "app_open");
        return new I();
    }

    @Override // O1.AbstractC0079o
    public final Object b(Q q4) {
        return q4.o2(new BinderC1813b(this.f1353b), this.c, this.d, this.f1354e, 234310000);
    }

    @Override // O1.AbstractC0079o
    public final /* bridge */ /* synthetic */ Object c() {
        return ((H0) this.f1355f.f1368o).n(this.f1353b, this.c, this.d, this.f1354e, 4);
    }
}
