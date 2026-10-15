package com.google.firebase.installations;

import D3.b;
import androidx.annotation.Keep;
import com.google.android.gms.internal.ads.C0574em;
import com.google.firebase.components.ComponentRegistrar;
import d3.AbstractC1654b;
import d3.g;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import n3.C1814a;
import n3.InterfaceC1815b;
import n3.i;
import n3.q;
import v3.C2033d;
import v3.InterfaceC2034e;
import x3.C2113b;
import x3.InterfaceC2114c;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    public static /* synthetic */ InterfaceC2114c lambda$getComponents$0(InterfaceC1815b interfaceC1815b) {
        return new C2113b((g) interfaceC1815b.a(g.class), interfaceC1815b.e(InterfaceC2034e.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1814a> getComponents() {
        C0574em c0574em = new C0574em(InterfaceC2114c.class, new Class[0]);
        c0574em.a(i.a(g.class));
        c0574em.a(new i(InterfaceC2034e.class, 0, 1));
        c0574em.f8639f = new b(16);
        C1814a b4 = c0574em.b();
        C2033d c2033d = new C2033d(0);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(C2033d.class));
        return Arrays.asList(b4, new C1814a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new C1.g(7, c2033d), hashSet3), AbstractC1654b.n("fire-installations", "17.0.1"));
    }
}
