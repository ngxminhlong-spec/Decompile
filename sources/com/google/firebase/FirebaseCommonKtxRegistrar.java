package com.google.firebase;

import W3.AbstractC0134m;
import androidx.annotation.Keep;
import com.google.android.gms.internal.ads.C0574em;
import com.google.firebase.components.ComponentRegistrar;
import d3.AbstractC1654b;
import d3.h;
import h3.a;
import h3.b;
import h3.c;
import h3.d;
import java.util.List;
import java.util.concurrent.Executor;
import n3.C1814a;
import n3.i;
import n3.q;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1814a> getComponents() {
        C0574em a4 = C1814a.a(new q(a.class, AbstractC0134m.class));
        a4.a(new i(new q(a.class, Executor.class), 1, 0));
        a4.f8639f = h.f12624p;
        C1814a b4 = a4.b();
        C0574em a5 = C1814a.a(new q(c.class, AbstractC0134m.class));
        a5.a(new i(new q(c.class, Executor.class), 1, 0));
        a5.f8639f = h.f12625q;
        C1814a b5 = a5.b();
        C0574em a6 = C1814a.a(new q(b.class, AbstractC0134m.class));
        a6.a(new i(new q(b.class, Executor.class), 1, 0));
        a6.f8639f = h.f12626r;
        C1814a b6 = a6.b();
        C0574em a7 = C1814a.a(new q(d.class, AbstractC0134m.class));
        a7.a(new i(new q(d.class, Executor.class), 1, 0));
        a7.f8639f = h.f12627s;
        return AbstractC1654b.D(b4, b5, b6, a7.b());
    }
}
