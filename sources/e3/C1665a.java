package e3;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1509e0;
import com.google.android.gms.internal.measurement.D;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.internal.measurement.S;
import com.google.android.gms.internal.measurement.T;
import com.google.android.gms.internal.measurement.X;
import com.google.android.gms.internal.measurement.Y;
import java.util.List;
import java.util.Map;
import x2.InterfaceC2105w0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1665a implements InterfaceC2105w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1509e0 f12783a;

    public C1665a(C1509e0 c1509e0) {
        this.f12783a = c1509e0;
    }

    @Override // x2.InterfaceC2105w0
    public final void V(String str) {
        C1509e0 c1509e0 = this.f12783a;
        c1509e0.b(new T(c1509e0, str, 2));
    }

    @Override // x2.InterfaceC2105w0
    public final void a(String str, String str2, Bundle bundle) {
        C1509e0 c1509e0 = this.f12783a;
        c1509e0.b(new S(c1509e0, str, str2, bundle, 0));
    }

    @Override // x2.InterfaceC2105w0
    public final List b(String str, String str2) {
        return this.f12783a.f(str, str2);
    }

    @Override // x2.InterfaceC2105w0
    public final long c() {
        return this.f12783a.d();
    }

    @Override // x2.InterfaceC2105w0
    public final Map d(String str, String str2, boolean z4) {
        return this.f12783a.g(str, str2, z4);
    }

    @Override // x2.InterfaceC2105w0
    public final void e(Bundle bundle) {
        C1509e0 c1509e0 = this.f12783a;
        c1509e0.b(new Q(c1509e0, bundle, 0));
    }

    @Override // x2.InterfaceC2105w0
    public final String f() {
        D d = new D();
        C1509e0 c1509e0 = this.f12783a;
        c1509e0.b(new X(c1509e0, d, 1));
        return (String) D.a0(d.Q(50L), String.class);
    }

    @Override // x2.InterfaceC2105w0
    public final String g() {
        D d = new D();
        C1509e0 c1509e0 = this.f12783a;
        c1509e0.b(new X(c1509e0, d, 4));
        return (String) D.a0(d.Q(500L), String.class);
    }

    @Override // x2.InterfaceC2105w0
    public final void h(String str, String str2, Bundle bundle) {
        C1509e0 c1509e0 = this.f12783a;
        c1509e0.b(new Y(c1509e0, str, str2, bundle, true, 1));
    }

    @Override // x2.InterfaceC2105w0
    public final void i(String str) {
        C1509e0 c1509e0 = this.f12783a;
        c1509e0.b(new T(c1509e0, str, 1));
    }

    @Override // x2.InterfaceC2105w0
    public final String j() {
        D d = new D();
        C1509e0 c1509e0 = this.f12783a;
        c1509e0.b(new X(c1509e0, d, 3));
        return (String) D.a0(d.Q(500L), String.class);
    }

    @Override // x2.InterfaceC2105w0
    public final String k() {
        D d = new D();
        C1509e0 c1509e0 = this.f12783a;
        c1509e0.b(new X(c1509e0, d, 0));
        return (String) D.a0(d.Q(500L), String.class);
    }

    @Override // x2.InterfaceC2105w0
    public final int o(String str) {
        return this.f12783a.c(str);
    }
}
