package j3;

import android.content.Context;
import k.C1748e;
import w3.InterfaceC2053a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: j3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1736c implements InterfaceC2053a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13343b;
    public final /* synthetic */ String c;

    public /* synthetic */ C1736c(int i4, Context context, String str) {
        this.f13342a = i4;
        this.f13343b = context;
        this.c = str;
    }

    @Override // w3.InterfaceC2053a
    public final Object get() {
        switch (this.f13342a) {
            case 0:
                return this.f13343b.getSharedPreferences(this.c, 0);
            default:
                return new C1748e(this.f13343b, this.c);
        }
    }
}
