package com.google.firebase.storage;

import androidx.annotation.Keep;
import com.google.android.gms.internal.ads.C0574em;
import com.google.firebase.components.ComponentRegistrar;
import d3.AbstractC1654b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import l3.InterfaceC1800a;
import m3.InterfaceC1807a;
import n3.C1814a;
import n3.InterfaceC1815b;
import n3.q;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@Keep
/* loaded from: classes.dex */
public class StorageRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-gcs";
    q blockingExecutor = new q(h3.b.class, Executor.class);
    q uiExecutor = new q(h3.d.class, Executor.class);

    public /* synthetic */ c lambda$getComponents$0(InterfaceC1815b interfaceC1815b) {
        return new c((d3.g) interfaceC1815b.a(d3.g.class), interfaceC1815b.e(InterfaceC1807a.class), interfaceC1815b.e(InterfaceC1800a.class), (Executor) interfaceC1815b.d(this.blockingExecutor), (Executor) interfaceC1815b.d(this.uiExecutor));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1814a> getComponents() {
        C0574em c0574em = new C0574em(c.class, new Class[0]);
        c0574em.f8636a = LIBRARY_NAME;
        c0574em.a(n3.i.a(d3.g.class));
        c0574em.a(new n3.i(this.blockingExecutor, 1, 0));
        c0574em.a(new n3.i(this.uiExecutor, 1, 0));
        c0574em.a(new n3.i(InterfaceC1807a.class, 0, 1));
        c0574em.a(new n3.i(InterfaceC1800a.class, 0, 1));
        c0574em.f8639f = new C1.g(5, this);
        return Arrays.asList(c0574em.b(), AbstractC1654b.n(LIBRARY_NAME, "20.3.0"));
    }
}
