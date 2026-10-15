package t2;

import android.util.Log;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: t2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2001h implements b3.c, F {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ C2001h f14906p = new C2001h(0);

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14907o;

    public /* synthetic */ C2001h(int i4) {
        this.f14907o = i4;
    }

    @Override // b3.c
    public void b(B0.a aVar) {
        Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(aVar.f45b)));
    }

    @Override // t2.H
    public Object c() {
        switch (this.f14907o) {
            case 1:
                return new Object();
            default:
                o3.i iVar = s.f14936b;
                r.c(iVar);
                return new J(iVar);
        }
    }
}
