package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.ads.C0574em;
import com.google.android.gms.internal.measurement.C1509e0;
import com.google.firebase.components.ComponentRegistrar;
import d3.AbstractC1654b;
import d3.g;
import f3.C1676b;
import f3.InterfaceC1675a;
import g3.a;
import h2.y;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import k.C1748e;
import n3.C1814a;
import n3.InterfaceC1815b;
import n3.i;
import n3.k;
import u3.InterfaceC2016b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, f3.b] */
    public static InterfaceC1675a lambda$getComponents$0(InterfaceC1815b interfaceC1815b) {
        g gVar = (g) interfaceC1815b.a(g.class);
        Context context = (Context) interfaceC1815b.a(Context.class);
        InterfaceC2016b interfaceC2016b = (InterfaceC2016b) interfaceC1815b.a(InterfaceC2016b.class);
        y.i(gVar);
        y.i(context);
        y.i(interfaceC2016b);
        y.i(context.getApplicationContext());
        if (C1676b.f12974a == null) {
            synchronized (C1676b.class) {
                try {
                    if (C1676b.f12974a == null) {
                        Bundle bundle = new Bundle(1);
                        gVar.a();
                        if ("[DEFAULT]".equals(gVar.f12618b)) {
                            ((k) interfaceC2016b).a();
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.g());
                        }
                        C1748e c1748e = C1509e0.e(context, null, null, bundle).f11909b;
                        ?? obj = new Object();
                        y.i(c1748e);
                        new ConcurrentHashMap();
                        C1676b.f12974a = obj;
                    }
                } finally {
                }
            }
        }
        return C1676b.f12974a;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C1814a> getComponents() {
        C0574em c0574em = new C0574em(InterfaceC1675a.class, new Class[0]);
        c0574em.a(i.a(g.class));
        c0574em.a(i.a(Context.class));
        c0574em.a(i.a(InterfaceC2016b.class));
        c0574em.f8639f = a.f13041o;
        if (!(c0574em.f8637b == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        c0574em.f8637b = 2;
        return Arrays.asList(c0574em.b(), AbstractC1654b.n("fire-analytics", "21.1.1"));
    }
}
