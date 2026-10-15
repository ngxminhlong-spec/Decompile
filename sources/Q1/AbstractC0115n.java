package Q1;

import android.content.Context;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.ads.AbstractC0266Ec;
import java.util.LinkedHashMap;
import l2.C1798a;
import x2.C2064b0;
import x2.C2066c0;
import x2.C2106x;
import x2.InterfaceC2078i0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: Q1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0115n implements InterfaceC2078i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1719a;

    public AbstractC0115n(int i4) {
        switch (i4) {
            case 1:
                this.f1719a = new LinkedHashMap();
                return;
            default:
                this.f1719a = new D0.o(10, this);
                return;
        }
    }

    public AbstractC0115n(C2066c0 c2066c0) {
        h2.y.i(c2066c0);
        this.f1719a = c2066c0;
    }

    @Override // x2.InterfaceC2078i0
    public Context b() {
        throw null;
    }

    @Override // x2.InterfaceC2078i0
    public x2.K c() {
        throw null;
    }

    @Override // x2.InterfaceC2078i0
    public C1798a d() {
        throw null;
    }

    public abstract void e();

    public InterfaceFutureC0239a f() {
        return AbstractC0266Ec.f4897a.a((D0.o) this.f1719a);
    }

    public void g() {
        C2064b0 c2064b0 = ((C2066c0) this.f1719a).f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
    }

    @Override // x2.InterfaceC2078i0
    public C2064b0 t() {
        throw null;
    }

    @Override // x2.InterfaceC2078i0
    public C2106x w() {
        throw null;
    }
}
