package B0;

import O1.InterfaceC0060e0;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.Y9;
import h0.C1694b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f implements g0.c {

    /* renamed from: q, reason: collision with root package name */
    public static f f73q;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f74o;

    /* renamed from: p, reason: collision with root package name */
    public String f75p;

    public /* synthetic */ f(int i4) {
        this.f74o = i4;
    }

    public f(InterfaceC0060e0 interfaceC0060e0) {
        String str;
        this.f74o = 1;
        try {
            str = interfaceC0060e0.a();
        } catch (RemoteException e4) {
            Y9.q("", e4);
            str = null;
        }
        this.f75p = str;
    }

    public f(String str) {
        this.f74o = 4;
        this.f75p = str;
    }

    @Override // g0.c
    public String a() {
        return this.f75p;
    }

    @Override // g0.c
    public void b(C1694b c1694b) {
    }

    public String toString() {
        switch (this.f74o) {
            case 1:
                return this.f75p;
            default:
                return super.toString();
        }
    }
}
